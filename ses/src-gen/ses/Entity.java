/**
 */
package ses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.Entity#getChildRelations <em>Child Relations</em>}</li>
 *   <li>{@link ses.Entity#getName <em>Name</em>}</li>
 *   <li>{@link ses.Entity#getSes <em>Ses</em>}</li>
 *   <li>{@link ses.Entity#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Relations</b></em>' reference list.
	 * The list contents are of type {@link ses.Relation}.
	 * It is bidirectional and its opposite is '{@link ses.Relation#getParentEntity <em>Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Relations</em>' reference list.
	 * @see ses.SesPackage#getEntity_ChildRelations()
	 * @see ses.Relation#getParentEntity
	 * @model opposite="parentEntity"
	 * @generated
	 */
	EList<Relation> getChildRelations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ses.SesPackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ses.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ses</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.SES#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ses</em>' reference.
	 * @see #setSes(SES)
	 * @see ses.SesPackage#getEntity_Ses()
	 * @see ses.SES#getEntities
	 * @model opposite="entities"
	 * @generated
	 */
	SES getSes();

	/**
	 * Sets the value of the '{@link ses.Entity#getSes <em>Ses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ses</em>' reference.
	 * @see #getSes()
	 * @generated
	 */
	void setSes(SES value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link ses.Variable}.
	 * It is bidirectional and its opposite is '{@link ses.Variable#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see ses.SesPackage#getEntity_Variables()
	 * @see ses.Variable#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();

} // Entity
