/**
 */
package ses;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.NodeEntity#getParentRelation <em>Parent Relation</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getNodeEntity()
 * @model
 * @generated
 */
public interface NodeEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Parent Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ses.Relation#getChildEntities <em>Child Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Relation</em>' reference.
	 * @see #setParentRelation(Relation)
	 * @see ses.SesPackage#getNodeEntity_ParentRelation()
	 * @see ses.Relation#getChildEntities
	 * @model opposite="childEntities" required="true"
	 * @generated
	 */
	Relation getParentRelation();

	/**
	 * Sets the value of the '{@link ses.NodeEntity#getParentRelation <em>Parent Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Relation</em>' reference.
	 * @see #getParentRelation()
	 * @generated
	 */
	void setParentRelation(Relation value);

} // NodeEntity
