/**
 */
package ses;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.Relation#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link ses.Relation#getChildEntities <em>Child Entities</em>}</li>
 *   <li>{@link ses.Relation#getName <em>Name</em>}</li>
 *   <li>{@link ses.Relation#getSes <em>Ses</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.Entity#getChildRelations <em>Child Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Entity</em>' reference.
	 * @see #setParentEntity(Entity)
	 * @see ses.SesPackage#getRelation_ParentEntity()
	 * @see ses.Entity#getChildRelations
	 * @model opposite="childRelations" required="true"
	 * @generated
	 */
	Entity getParentEntity();

	/**
	 * Sets the value of the '{@link ses.Relation#getParentEntity <em>Parent Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Entity</em>' reference.
	 * @see #getParentEntity()
	 * @generated
	 */
	void setParentEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Child Entities</b></em>' reference list.
	 * The list contents are of type {@link ses.NodeEntity}.
	 * It is bidirectional and its opposite is '{@link ses.NodeEntity#getParentRelation <em>Parent Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Entities</em>' reference list.
	 * @see ses.SesPackage#getRelation_ChildEntities()
	 * @see ses.NodeEntity#getParentRelation
	 * @model opposite="parentRelation" required="true"
	 * @generated
	 */
	EList<NodeEntity> getChildEntities();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ses.SesPackage#getRelation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ses.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ses</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.SES#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ses</em>' reference.
	 * @see #setSes(SES)
	 * @see ses.SesPackage#getRelation_Ses()
	 * @see ses.SES#getRelations
	 * @model opposite="relations"
	 * @generated
	 */
	SES getSes();

	/**
	 * Sets the value of the '{@link ses.Relation#getSes <em>Ses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ses</em>' reference.
	 * @see #getSes()
	 * @generated
	 */
	void setSes(SES value);

} // Relation
