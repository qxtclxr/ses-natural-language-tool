/**
 */
package ses.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ses.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SesFactoryImpl extends EFactoryImpl implements SesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SesFactory init() {
		try {
			SesFactory theSesFactory = (SesFactory) EPackage.Registry.INSTANCE.getEFactory(SesPackage.eNS_URI);
			if (theSesFactory != null) {
				return theSesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SesPackage.ROOT_ENTITY:
			return createRootEntity();
		case SesPackage.NODE_ENTITY:
			return createNodeEntity();
		case SesPackage.ASPECT:
			return createAspect();
		case SesPackage.SPECIALIZATION:
			return createSpecialization();
		case SesPackage.MULTIASPECT:
			return createMultiaspect();
		case SesPackage.VARIABLE:
			return createVariable();
		case SesPackage.STRING_RANGE:
			return createStringRange();
		case SesPackage.BOOLEAN_RANGE:
			return createBooleanRange();
		case SesPackage.INTEGER_RANGE:
			return createIntegerRange();
		case SesPackage.SES:
			return createSES();
		case SesPackage.FLOATING_POINT_RANGE:
			return createFloatingPointRange();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootEntity createRootEntity() {
		RootEntityImpl rootEntity = new RootEntityImpl();
		return rootEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeEntity createNodeEntity() {
		NodeEntityImpl nodeEntity = new NodeEntityImpl();
		return nodeEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiaspect createMultiaspect() {
		MultiaspectImpl multiaspect = new MultiaspectImpl();
		return multiaspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringRange createStringRange() {
		StringRangeImpl stringRange = new StringRangeImpl();
		return stringRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanRange createBooleanRange() {
		BooleanRangeImpl booleanRange = new BooleanRangeImpl();
		return booleanRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerRange createIntegerRange() {
		IntegerRangeImpl integerRange = new IntegerRangeImpl();
		return integerRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SES createSES() {
		SESImpl ses = new SESImpl();
		return ses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatingPointRange createFloatingPointRange() {
		FloatingPointRangeImpl floatingPointRange = new FloatingPointRangeImpl();
		return floatingPointRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SesPackage getSesPackage() {
		return (SesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SesPackage getPackage() {
		return SesPackage.eINSTANCE;
	}

} //SesFactoryImpl
