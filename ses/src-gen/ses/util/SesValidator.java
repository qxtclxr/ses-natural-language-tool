/**
 */
package ses.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import ses.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ses.SesPackage
 * @generated
 */
public class SesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SesValidator INSTANCE = new SesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ses";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Restrict Multiaspect To One Child' of 'Multiaspect'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTIASPECT__RESTRICT_MULTIASPECT_TO_ONE_CHILD = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only One Root Entity' of 'SES'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SES__ONLY_ONE_ROOT_ENTITY = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SesValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SesPackage.ENTITY:
			return validateEntity((Entity) value, diagnostics, context);
		case SesPackage.ROOT_ENTITY:
			return validateRootEntity((RootEntity) value, diagnostics, context);
		case SesPackage.NODE_ENTITY:
			return validateNodeEntity((NodeEntity) value, diagnostics, context);
		case SesPackage.ASPECT:
			return validateAspect((Aspect) value, diagnostics, context);
		case SesPackage.SPECIALIZATION:
			return validateSpecialization((Specialization) value, diagnostics, context);
		case SesPackage.MULTIASPECT:
			return validateMultiaspect((Multiaspect) value, diagnostics, context);
		case SesPackage.RELATION:
			return validateRelation((Relation) value, diagnostics, context);
		case SesPackage.VARIABLE:
			return validateVariable((Variable) value, diagnostics, context);
		case SesPackage.RANGE:
			return validateRange((Range) value, diagnostics, context);
		case SesPackage.NUMBER_RANGE:
			return validateNumberRange((NumberRange) value, diagnostics, context);
		case SesPackage.STRING_RANGE:
			return validateStringRange((StringRange) value, diagnostics, context);
		case SesPackage.BOOLEAN_RANGE:
			return validateBooleanRange((BooleanRange) value, diagnostics, context);
		case SesPackage.INTEGER_RANGE:
			return validateIntegerRange((IntegerRange) value, diagnostics, context);
		case SesPackage.SES:
			return validateSES((SES) value, diagnostics, context);
		case SesPackage.FLOATING_POINT_RANGE:
			return validateFloatingPointRange((FloatingPointRange) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootEntity(RootEntity rootEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rootEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeEntity(NodeEntity nodeEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspect(Aspect aspect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aspect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiaspect(Multiaspect multiaspect, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiaspect, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(multiaspect, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(multiaspect, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(multiaspect, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(multiaspect, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(multiaspect, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(multiaspect, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(multiaspect, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(multiaspect, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMultiaspect_restrictMultiaspectToOneChild(multiaspect, diagnostics, context);
		return result;
	}

	/**
	 * Validates the restrictMultiaspectToOneChild constraint of '<em>Multiaspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiaspect_restrictMultiaspectToOneChild(Multiaspect multiaspect,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multiaspect.restrictMultiaspectToOneChild(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(range, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberRange(NumberRange numberRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringRange(StringRange stringRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanRange(BooleanRange booleanRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerRange(IntegerRange integerRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSES(SES ses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ses, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSES_onlyOneRootEntity(ses, diagnostics, context);
		return result;
	}

	/**
	 * Validates the onlyOneRootEntity constraint of '<em>SES</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSES_onlyOneRootEntity(SES ses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ses.onlyOneRootEntity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatingPointRange(FloatingPointRange floatingPointRange, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatingPointRange, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SesValidator
