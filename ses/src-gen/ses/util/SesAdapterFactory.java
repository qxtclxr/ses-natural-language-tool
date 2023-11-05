/**
 */
package ses.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ses.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ses.SesPackage
 * @generated
 */
public class SesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SesSwitch<Adapter> modelSwitch = new SesSwitch<Adapter>() {
		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseRootEntity(RootEntity object) {
			return createRootEntityAdapter();
		}

		@Override
		public Adapter caseNodeEntity(NodeEntity object) {
			return createNodeEntityAdapter();
		}

		@Override
		public Adapter caseAspect(Aspect object) {
			return createAspectAdapter();
		}

		@Override
		public Adapter caseSpecialization(Specialization object) {
			return createSpecializationAdapter();
		}

		@Override
		public Adapter caseMultiaspect(Multiaspect object) {
			return createMultiaspectAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseRange(Range object) {
			return createRangeAdapter();
		}

		@Override
		public Adapter caseNumberRange(NumberRange object) {
			return createNumberRangeAdapter();
		}

		@Override
		public Adapter caseStringRange(StringRange object) {
			return createStringRangeAdapter();
		}

		@Override
		public Adapter caseBooleanRange(BooleanRange object) {
			return createBooleanRangeAdapter();
		}

		@Override
		public Adapter caseIntegerRange(IntegerRange object) {
			return createIntegerRangeAdapter();
		}

		@Override
		public Adapter caseSES(SES object) {
			return createSESAdapter();
		}

		@Override
		public Adapter caseFloatingPointRange(FloatingPointRange object) {
			return createFloatingPointRangeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.RootEntity <em>Root Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.RootEntity
	 * @generated
	 */
	public Adapter createRootEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.NodeEntity <em>Node Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.NodeEntity
	 * @generated
	 */
	public Adapter createNodeEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.Specialization
	 * @generated
	 */
	public Adapter createSpecializationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.Multiaspect <em>Multiaspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.Multiaspect
	 * @generated
	 */
	public Adapter createMultiaspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.NumberRange <em>Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.NumberRange
	 * @generated
	 */
	public Adapter createNumberRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.StringRange <em>String Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.StringRange
	 * @generated
	 */
	public Adapter createStringRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.BooleanRange <em>Boolean Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.BooleanRange
	 * @generated
	 */
	public Adapter createBooleanRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.IntegerRange <em>Integer Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.IntegerRange
	 * @generated
	 */
	public Adapter createIntegerRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.SES <em>SES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.SES
	 * @generated
	 */
	public Adapter createSESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ses.FloatingPointRange <em>Floating Point Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ses.FloatingPointRange
	 * @generated
	 */
	public Adapter createFloatingPointRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SesAdapterFactory
