/**
 */
package ses;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ses.SesPackage
 * @generated
 */
public interface SesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SesFactory eINSTANCE = ses.impl.SesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Entity</em>'.
	 * @generated
	 */
	RootEntity createRootEntity();

	/**
	 * Returns a new object of class '<em>Node Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Entity</em>'.
	 * @generated
	 */
	NodeEntity createNodeEntity();

	/**
	 * Returns a new object of class '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect</em>'.
	 * @generated
	 */
	Aspect createAspect();

	/**
	 * Returns a new object of class '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialization</em>'.
	 * @generated
	 */
	Specialization createSpecialization();

	/**
	 * Returns a new object of class '<em>Multiaspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiaspect</em>'.
	 * @generated
	 */
	Multiaspect createMultiaspect();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>String Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Range</em>'.
	 * @generated
	 */
	StringRange createStringRange();

	/**
	 * Returns a new object of class '<em>Boolean Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Range</em>'.
	 * @generated
	 */
	BooleanRange createBooleanRange();

	/**
	 * Returns a new object of class '<em>Integer Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Range</em>'.
	 * @generated
	 */
	IntegerRange createIntegerRange();

	/**
	 * Returns a new object of class '<em>SES</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SES</em>'.
	 * @generated
	 */
	SES createSES();

	/**
	 * Returns a new object of class '<em>Floating Point Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating Point Range</em>'.
	 * @generated
	 */
	FloatingPointRange createFloatingPointRange();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SesPackage getSesPackage();

} //SesFactory
