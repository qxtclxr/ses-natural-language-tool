/**
 */
package ses.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import ses.Multiaspect;
import ses.NodeEntity;
import ses.SesPackage;
import ses.SesTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiaspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MultiaspectImpl extends RelationImpl implements Multiaspect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiaspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.MULTIASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("{type: multiaspect, ");
		str.append("name: " + this.getName() + ", ");
		str.append("parent entity: " + this.getParentEntity().getName() + ", ");
		str.append("child entities: {");
		if (this.eIsSet(SesPackage.MULTIASPECT__CHILD_ENTITIES)) {
			for (NodeEntity ent : this.getChildEntities()) {
				str.append(ent.getName() + ", ");
			}
			str.setLength(str.length() - 2);
		}
		str.append("}}");
		return str.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean restrictMultiaspectToOneChild(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Multiaspect::restrictMultiaspectToOneChild";
		try {
			/**
			 *
			 * inv restrictMultiaspectToOneChild:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.childEntities->size() = 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					SesPackage.Literals.MULTIASPECT___RESTRICT_MULTIASPECT_TO_ONE_CHILD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, SesTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<NodeEntity> childEntities = this.getChildEntities();
				final /*@NonInvalid*/ OrderedSetValue BOXED_childEntities = idResolver
						.createOrderedSetOfAll(SesTables.ORD_CLSSid_NodeEntity, childEntities);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
						.evaluate(BOXED_childEntities);
				final /*@NonInvalid*/ boolean result = size.equals(SesTables.INT_1);
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
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SesPackage.MULTIASPECT___TO_STRING:
			return toString();
		case SesPackage.MULTIASPECT___RESTRICT_MULTIASPECT_TO_ONE_CHILD__DIAGNOSTICCHAIN_MAP:
			return restrictMultiaspectToOneChild((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MultiaspectImpl
