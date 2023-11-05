/**
 */
package ses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.Variable#getName <em>Name</em>}</li>
 *   <li>{@link ses.Variable#getSes <em>Ses</em>}</li>
 *   <li>{@link ses.Variable#getRange <em>Range</em>}</li>
 *   <li>{@link ses.Variable#getEntity <em>Entity</em>}</li>
 *   <li>{@link ses.Variable#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ses.SesPackage#getVariable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ses.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ses</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.SES#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ses</em>' reference.
	 * @see #setSes(SES)
	 * @see ses.SesPackage#getVariable_Ses()
	 * @see ses.SES#getVariables
	 * @model opposite="variables"
	 * @generated
	 */
	SES getSes();

	/**
	 * Sets the value of the '{@link ses.Variable#getSes <em>Ses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ses</em>' reference.
	 * @see #getSes()
	 * @generated
	 */
	void setSes(SES value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.Range#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference.
	 * @see #setRange(Range)
	 * @see ses.SesPackage#getVariable_Range()
	 * @see ses.Range#getVariable
	 * @model opposite="variable"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link ses.Variable#getRange <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.Entity#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see ses.SesPackage#getVariable_Entity()
	 * @see ses.Entity#getVariables
	 * @model opposite="variables" required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link ses.Variable#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link ses.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see ses.SesPackage#getVariable_DependsOn()
	 * @model
	 * @generated
	 */
	EList<Variable> getDependsOn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();

} // Variable
