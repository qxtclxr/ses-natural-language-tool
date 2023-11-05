/**
 */
package ses.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import ses.Entity;
import ses.Range;
import ses.Relation;
import ses.SES;
import ses.SesPackage;
import ses.SesTables;
import ses.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SES</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ses.impl.SESImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ses.impl.SESImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link ses.impl.SESImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link ses.impl.SESImpl#getRanges <em>Ranges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SESImpl extends MinimalEObjectImpl.Container implements SES {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getRanges() <em>Ranges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanges()
	 * @generated
	 * @ordered
	 */
	protected EList<Range> ranges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SESImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.SES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectWithInverseResolvingEList<Variable>(Variable.class, this, SesPackage.SES__VARIABLES,
					SesPackage.VARIABLE__SES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectWithInverseResolvingEList<Entity>(Entity.class, this, SesPackage.SES__ENTITIES,
					SesPackage.ENTITY__SES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, SesPackage.SES__RELATIONS,
					SesPackage.RELATION__SES);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Range> getRanges() {
		if (ranges == null) {
			ranges = new EObjectWithInverseResolvingEList<Range>(Range.class, this, SesPackage.SES__RANGES,
					SesPackage.RANGE__SES);
		}
		return ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/ses!SES!toString()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean onlyOneRootEntity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SES::onlyOneRootEntity";
		try {
			/**
			 *
			 * inv onlyOneRootEntity:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = entities->one(e |
			 *           e.oclIsKindOf(RootEntity))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SesPackage.Literals.SES___ONLY_ONE_ROOT_ENTITY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Entity> entities = this.getEntities();
				final /*@NonInvalid*/ OrderedSetValue BOXED_entities = idResolver
						.createOrderedSetOfAll(SesTables.ORD_CLSSid_Entity, entities);
				/*@Thrown*/ boolean accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_e_0 = BOXED_entities.iterator();
				/*@NonInvalid*/ boolean result;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						result = accumulator;
						break;
					}
					/*@NonInvalid*/ Entity e_0 = (Entity) ITERATOR_e_0.next();
					/**
					 * e.oclIsKindOf(RootEntity)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ses_c_c_RootEntity = idResolver
							.getClass(SesTables.CLSSid_RootEntity, null);
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, e_0, TYP_ses_c_c_RootEntity).booleanValue();
					//
					if (oclIsKindOf) { // Carry on till something found
						if (accumulator) {
							result = false;
							break;
						} else {
							accumulator = true;
						}
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, SesTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SesPackage.SES__VARIABLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables()).basicAdd(otherEnd, msgs);
		case SesPackage.SES__ENTITIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntities()).basicAdd(otherEnd, msgs);
		case SesPackage.SES__RELATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRelations()).basicAdd(otherEnd, msgs);
		case SesPackage.SES__RANGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRanges()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SesPackage.SES__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
		case SesPackage.SES__ENTITIES:
			return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
		case SesPackage.SES__RELATIONS:
			return ((InternalEList<?>) getRelations()).basicRemove(otherEnd, msgs);
		case SesPackage.SES__RANGES:
			return ((InternalEList<?>) getRanges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SesPackage.SES__VARIABLES:
			return getVariables();
		case SesPackage.SES__ENTITIES:
			return getEntities();
		case SesPackage.SES__RELATIONS:
			return getRelations();
		case SesPackage.SES__RANGES:
			return getRanges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SesPackage.SES__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case SesPackage.SES__ENTITIES:
			getEntities().clear();
			getEntities().addAll((Collection<? extends Entity>) newValue);
			return;
		case SesPackage.SES__RELATIONS:
			getRelations().clear();
			getRelations().addAll((Collection<? extends Relation>) newValue);
			return;
		case SesPackage.SES__RANGES:
			getRanges().clear();
			getRanges().addAll((Collection<? extends Range>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SesPackage.SES__VARIABLES:
			getVariables().clear();
			return;
		case SesPackage.SES__ENTITIES:
			getEntities().clear();
			return;
		case SesPackage.SES__RELATIONS:
			getRelations().clear();
			return;
		case SesPackage.SES__RANGES:
			getRanges().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SesPackage.SES__VARIABLES:
			return variables != null && !variables.isEmpty();
		case SesPackage.SES__ENTITIES:
			return entities != null && !entities.isEmpty();
		case SesPackage.SES__RELATIONS:
			return relations != null && !relations.isEmpty();
		case SesPackage.SES__RANGES:
			return ranges != null && !ranges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SesPackage.SES___TO_STRING:
			return toString();
		case SesPackage.SES___ONLY_ONE_ROOT_ENTITY__DIAGNOSTICCHAIN_MAP:
			return onlyOneRootEntity((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SESImpl
