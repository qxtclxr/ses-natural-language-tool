/**
 */
package ses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.Range#getVariable <em>Variable</em>}</li>
 *   <li>{@link ses.Range#getSes <em>Ses</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getRange()
 * @model abstract="true"
 * @generated
 */
public interface Range extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.Variable#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ses.SesPackage#getRange_Variable()
	 * @see ses.Variable#getRange
	 * @model opposite="range" required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link ses.Range#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Ses</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.SES#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ses</em>' reference.
	 * @see #setSes(SES)
	 * @see ses.SesPackage#getRange_Ses()
	 * @see ses.SES#getRanges
	 * @model opposite="ranges"
	 * @generated
	 */
	SES getSes();

	/**
	 * Sets the value of the '{@link ses.Range#getSes <em>Ses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ses</em>' reference.
	 * @see #getSes()
	 * @generated
	 */
	void setSes(SES value);

} // Range
