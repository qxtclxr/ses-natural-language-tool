package ses.grammar;

import java.util.*;
import ses.*;
import ses.exceptions.*;
import ses.grammar.SESGrammarParser.*;
import ses.util.*;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.eclipse.emf.common.util.BasicDiagnostic;


public class SESModelInstantiator extends SESGrammarBaseListener {
	public SES ses;
	private ParseTreeProperty<List<String>> ids = new ParseTreeProperty<>();
	/*Used by rules:
	 * - identifierListAnd
	 * - identifierListOr
	 * - identifierList
	 * - existingVar*/
	private ParseTreeProperty<List<List<String>>> variableEntityPair = new ParseTreeProperty<>();
	/*Used by rules:
	 * - existingVarListAnd
	 * - existingVarList*/
	private ParseTreeProperty<Range> range = new ParseTreeProperty<>();
	/*Used by rules:
	 * - rangeType
	 * - rangeOfString
	 * - rangeOfInteger
	 * - rangeOfFloat
	 * - intInterval
	 * - floatInterval*/
	
	@Override
	public void enterSes(SesContext ctx) {
		this.ses = SesFactory.eINSTANCE.createSES();
	}
	
	@Override
	public void exitAspect(AspectContext ctx) { 
		try {
			//Subtree 0 = identifier(0): Matches the name of the aspect relation
			String name = ctx.identifier(0).getText(); 
			//Subtree 1 = identifier(1): Matches the name of the parent entity
			Entity parentEntity = getEntityByName(ctx.identifier(1).getText());
			/*Subtree 2 = identifierListAnd:
			 *Matches a string of the form "component1, component2, ... and componentN".
			 *The "identifierListAnd" rule attribute is a String list that stores each component as a separate String.*/
			List<String> componentNames =  this.ids.get(ctx.identifierListAnd());
			
			/*EMF generates a Factory for all models (classes) in the metamodel, in this case called SesFactory.
			 *It employs a createXXXX() method to instance each of the models on the metamodel.
			 */
			Aspect aspect = SesFactory.eINSTANCE.createAspect();
			aspect.setName(name);
			aspect.setParentEntity(parentEntity);
			List<Entity> components = new ArrayList<>();
			for(String componentName : componentNames) {
				components.add(createNodeEntity(componentName,aspect));
			}
			
			//Validate the construct that was just created
			BasicDiagnostic diagnostic = new BasicDiagnostic();
			boolean isValid = SesValidator.INSTANCE.validateAspect(aspect, diagnostic, new HashMap<Object,Object>());
			if(!isValid) {
				throw new InvalidConstructException(diagnostic);
			}
			
			//Once validated, the constructs are included in the SES model
			parentEntity.setSes(ses);
			for(Entity component : components) {
				component.setSes(ses);
			}
			aspect.setSes(ses);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void exitSpecialization(SpecializationContext ctx) {
		try {
			//Subtree 0 = identifier(0): Matches the name of the parent entity
			Entity parentEntity = this.getEntityByName(ctx.identifier(0).getText());
			/*Subtree 1 = identifierListAnd:
			 *Matches a string of the form "component1, component2, ... or componentN".
			 *The "identifierListOr" rule attribute is a String list that stores each component as a separate String.*/
			List<String> variantNames = this.ids.get(ctx.identifierListOr());
			//Subtree 2 = identifier(1): Matches the name of the specialization relation
			String name = ctx.identifier(1).getText();
			
			Specialization spec = SesFactory.eINSTANCE.createSpecialization();
			spec.setName(name);
			spec.setParentEntity(parentEntity);
			List<Entity> variants = new ArrayList<>();
			for(String variantName : variantNames) {
				createNodeEntity(variantName,spec);
			}
			
			//Validate the construct that was just created
			BasicDiagnostic diagnostic = new BasicDiagnostic();
			boolean isValid = SesValidator.INSTANCE.validateSpecialization(spec, diagnostic, new HashMap<Object,Object>());
			if(!isValid) {
				throw new InvalidConstructException(diagnostic);
			}
			
			//Once validated, the constructs are included into the SES model
			parentEntity.setSes(ses);
			for(Entity variant : variants) {
				variant.setSes(ses);
			}
			spec.setSes(ses);
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
	
	@Override
	public void exitMultiaspect(MultiaspectContext ctx) { 
		try {
			String name = ctx.identifier(0).getText();
			Entity parentEntity = this.getEntityByName(ctx.identifier(1).getText());
			String variantName = ctx.identifier(2).getText();
			
			Multiaspect multiasp = SesFactory.eINSTANCE.createMultiaspect();
			multiasp.setName(name);
			multiasp.setParentEntity(parentEntity);
			Entity variant = this.createNodeEntity(variantName,multiasp);
			
			//Validate the construct that was just created
			BasicDiagnostic diagnostic = new BasicDiagnostic();
			boolean isValid = SesValidator.INSTANCE.validateMultiaspect(multiasp, diagnostic, new HashMap<Object,Object>());
			if(!isValid) {
				throw new InvalidConstructException(diagnostic);
			}
			
			//Once validated, the constructs are included into the SES model
			parentEntity.setSes(ses);
			multiasp.setSes(ses);
			variant.setSes(ses);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void exitVariable(VariableContext ctx) {
		try {
			Entity entity = this.getEntityByName(ctx.identifier().getText());
			List<String> names = this.ids.get(ctx.identifierListAnd());
			List<Variable> variables = new ArrayList<>();
			for(String name : names) {
				variables.add(createVariable(name, entity));
			}
			
			//Once all variables have been validated, they are allowed into the SES model
			entity.setSes(ses);
			for(Variable var : variables) {
				var.setSes(ses);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void exitIdAnd(IdAndContext ctx) {
		List<String> newIds = new ArrayList<String>();
		newIds.add(ctx.identifier().getText());
		this.ids.put(ctx, newIds);
	}
	
	@Override
	public void exitIdAndList(IdAndListContext ctx) {
		List<String> auxIds = this.ids.get(ctx.identifierList());
		auxIds.add(ctx.identifier().getText());
		this.ids.put(ctx, auxIds);
	}
	
	@Override
	public void exitIdOr(IdOrContext ctx) {
		List<String> newIds = new ArrayList<String>();
		newIds.add(ctx.identifier().getText());
		this.ids.put(ctx, newIds);
	}
	
	@Override
	public void exitIdOrList(IdOrListContext ctx) {
		List<String> auxIds = this.ids.get(ctx.identifierList());
		auxIds.add(ctx.identifier().getText());
		this.ids.put(ctx, auxIds);
	}
	
	@Override
	public void exitIdListBaseCase(IdListBaseCaseContext ctx) {
		List<String> newIds = new ArrayList<String>();
		newIds.add(ctx.identifier().getText());
		this.ids.put(ctx, newIds);
	}
	
	@Override
	public void exitIdListRecursion(IdListRecursionContext ctx) {
		List<String> auxIds = this.ids.get(ctx.identifierList());
		auxIds.add(ctx.identifier().getText());
		this.ids.put(ctx, auxIds);
	}
	
	@Override
	public void exitRange(RangeContext ctx) {
		try {
			//Subtree 0 = existingVar: Matches a string of the form "<entity>'s <variable>"
			//entityName stores <entity>
			String entityName = this.ids.get(ctx.existingVar()).get(0); 
			//varName stores <variable>
			String varName = this.ids.get(ctx.existingVar()).get(1);
			/*Subtree 1 = rangeType: Matches a string that specifies the range of the variable.
			 * rangeType's exit methods instantiate the corresponding "Range" subclass
			 * and store it in the "range" ParseTreeProperty map*/
			Range rangeof = this.range.get(ctx.rangeType());
			
			rangeof.setVariable(this.getVariableByName(varName, entityName));
			
			BasicDiagnostic diagnostic = new BasicDiagnostic();
			boolean isValid = SesValidator.INSTANCE.validateRange(rangeof, diagnostic, new HashMap<Object,Object>());
			if(!isValid) {
				throw new InvalidConstructException(diagnostic);
			}
			
			rangeof.setSes(ses);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void exitRangeTypeString(RangeTypeStringContext ctx) {
		this.range.put(ctx,this.range.get(ctx.rangeOfString()));
	}

	@Override
	public void exitRangeTypeFloat(RangeTypeFloatContext ctx) {
		this.range.put(ctx,this.range.get(ctx.rangeOfFloat()));
	}

	@Override
	public void exitRangeTypeInteger(RangeTypeIntegerContext ctx) {
		this.range.put(ctx,this.range.get(ctx.rangeOfInteger()));
	}

	@Override
	public void exitRangeTypeBoolean(RangeTypeBooleanContext ctx) {
		BooleanRange rangeof = SesFactory.eINSTANCE.createBooleanRange();
		this.range.put(ctx,rangeof);		
	}

	@Override
	public void exitRangeOfStringUnspecified(RangeOfStringUnspecifiedContext ctx) {
		StringRange rangeof = SesFactory.eINSTANCE.createStringRange();
		this.range.put(ctx,rangeof);
	}
	
	@Override
	public void exitRangeOfStringSpecified(RangeOfStringSpecifiedContext ctx) {
		List<String> strings = this.ids.get(ctx.identifierListAnd());
		
		StringRange strRange = SesFactory.eINSTANCE.createStringRange();
		strRange.getRange().addAll(strings);
		
		this.range.put(ctx,strRange);
	}
	

	@Override
	public void exitRangeOfFloatUnspecified(RangeOfFloatUnspecifiedContext ctx) {
		FloatingPointRange rangeof = SesFactory.eINSTANCE.createFloatingPointRange();
		this.range.put(ctx,rangeof);
	}

	@Override
	public void exitRangeOfFloatSpecified(RangeOfFloatSpecifiedContext ctx) {
		double	a = Double.parseDouble(ctx.floatInterval().floatingPoint(0).getText()),
				b = Double.parseDouble(ctx.floatInterval().floatingPoint(1).getText());
		boolean	leftClosed = ctx.floatInterval().BEGININTERV().getText().equals("["),
				rightClosed = ctx.floatInterval().ENDINTERV().getText().equals("]");
		
		FloatingPointRange rangeOf = SesFactory.eINSTANCE.createFloatingPointRange();
		rangeOf.setLeftBound(a);
		rangeOf.setRightBound(b);
		rangeOf.setLeftClosed(leftClosed);
		rangeOf.setRightClosed(rightClosed);
		
		this.range.put(ctx,rangeOf);
	}

	@Override
	public void exitRangeOfIntegerUnspecified(RangeOfIntegerUnspecifiedContext ctx) {
		IntegerRange rangeof = SesFactory.eINSTANCE.createIntegerRange();
		this.range.put(ctx,rangeof);
	}

	@Override
	public void exitRangeOfIntegerSpecified(RangeOfIntegerSpecifiedContext ctx) {
		int	a = Integer.parseInt(ctx.intInterval().INTEGER(0).getText()),
			b = Integer.parseInt(ctx.intInterval().INTEGER(1).getText());
		boolean	leftClosed = ctx.intInterval().BEGININTERV().getText().equals("["),
				rightClosed = ctx.intInterval().ENDINTERV().getText().equals("]");
		
		FloatingPointRange rangeOf = SesFactory.eINSTANCE.createFloatingPointRange();
		rangeOf.setLeftBound(a);
		rangeOf.setRightBound(b);
		rangeOf.setLeftClosed(leftClosed);
		rangeOf.setRightClosed(rightClosed);
		
		this.range.put(ctx,rangeOf);
	}

	@Override
	public void exitVariableDependance(VariableDependanceContext ctx) {
		try {
			List<String> dependantNamePair = this.ids.get(ctx.existingVar());
			List<List<String>> dependeeNamePairs = this.variableEntityPair.get(ctx.existingVarListAnd());
			
			Variable dependant = this.getVariableByName(dependantNamePair.get(1),dependantNamePair.get(0));
			List<Variable> dependees = new ArrayList<>();
			for(List<String> pair : dependeeNamePairs) {
				dependees.add(this.getVariableByName(pair.get(1),pair.get(0)));
			}
			
			dependant.getDependsOn().addAll(dependees);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void exitOneExistingVar(OneExistingVarContext ctx) {
		List<List<String>> newPairs = new ArrayList<>();
		newPairs.add(this.ids.get(ctx.existingVar()));
		this.variableEntityPair.put(ctx, newPairs);
		
	}

	@Override
	public void exitManyExistingVar(ManyExistingVarContext ctx) {
		List<List<String>> auxPairs = this.variableEntityPair.get(ctx.existingVarList());
		auxPairs.add(this.ids.get(ctx.existingVar()));
		this.variableEntityPair.put(ctx, auxPairs);
	}
	
	@Override
	public void exitExistingVarListBaseCase(ExistingVarListBaseCaseContext ctx) {
		List<List<String>> newPairs = new ArrayList<>();
		newPairs.add(this.ids.get(ctx.existingVar()));
		this.variableEntityPair.put(ctx, newPairs);
	}
	
	@Override
	public void exitExistingVarListRecursion(ExistingVarListRecursionContext ctx) {
		List<List<String>> auxPairs = this.variableEntityPair.get(ctx.existingVarList());
		auxPairs.add(this.ids.get(ctx.existingVar()));
		this.variableEntityPair.put(ctx, auxPairs);
	}

	@Override
	public void exitExistingVar(ExistingVarContext ctx) {
		List<String> entityVariablePair = new ArrayList<>();
		entityVariablePair.add(ctx.identifier(0).getText());
		entityVariablePair.add(ctx.identifier(1).getText());
		this.ids.put(ctx,entityVariablePair);
	}

	@Override
	public void exitAspectReutil(AspectReutilContext ctx) {
		// TODO Auto-generated method stub
		super.exitAspectReutil(ctx);
	}

	@Override
	public void exitSpecReutil(SpecReutilContext ctx) {
		// TODO Auto-generated method stub
		super.exitSpecReutil(ctx);
	}
	
	@Override
	public void visitErrorNode(ErrorNode node) {
		try {
			throw new BadParsingException();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//Auxiliary methods
	private Variable getVariableByName(String varName, String entityName) throws ConstructDoesNotExistException {
		Variable var = this.ses.getVariables().stream().
				filter(v -> v.getName().equals(varName) && v.getEntity().getName().equals(entityName)).
				findFirst().
				orElseThrow(() -> new ConstructDoesNotExistException(varName));
		return var;
	}
	
	private Variable createVariable(String name, Entity parentEntity) throws InvalidConstructException {
		Variable var = SesFactory.eINSTANCE.createVariable();
		var.setName(name);
		var.setEntity(parentEntity);
		
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		boolean isValid = SesValidator.INSTANCE.validateVariable(var, diagnostic, new HashMap<Object,Object>());
		if(!isValid) {
			throw new InvalidConstructException(diagnostic);
		}
		
		return var;
	}
	
	private Entity createNodeEntity(String name, Relation relation) throws InvalidConstructException {
		NodeEntity entity = SesFactory.eINSTANCE.createNodeEntity();
		entity.setName(name);
		entity.setParentRelation(relation);
		
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		boolean isValid = SesValidator.INSTANCE.validateNodeEntity(entity, diagnostic, new HashMap<Object,Object>());
		if(!isValid) {
			throw new InvalidConstructException(diagnostic);
		}
		
		return entity;
	}
	
	private Entity createRootEntity(String name) throws InvalidConstructException {
		RootEntity entity = SesFactory.eINSTANCE.createRootEntity();
		entity.setName(name);
		
		BasicDiagnostic diagnostic = new BasicDiagnostic();
		boolean isValid = SesValidator.INSTANCE.validateRootEntity(entity, diagnostic, new HashMap<Object,Object>());
		if(!isValid) {
			throw new InvalidConstructException(diagnostic);
		}
		
		return entity;
	}
	
	private Entity getEntityByName(String name) throws InvalidConstructException, ConstructDoesNotExistException {
		Entity entity;
		if(ses.getEntities().isEmpty()) {
			entity = this.createRootEntity(name);
		}else {
			entity = ses.getEntities().stream().
						filter(e -> e.getName().equals(name)).
						/*If two Entities have the same name, they are equal.
						 *In this case, it means that the entity that was specified exists*/
						findFirst().
						orElseThrow(() -> new ConstructDoesNotExistException(name));
			//WARNING: Sketchy...
		}
		return entity;
	}
}
