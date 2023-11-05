/**
 */
package ses;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.IntegerRange#getLeftBound <em>Left Bound</em>}</li>
 *   <li>{@link ses.IntegerRange#getRightBound <em>Right Bound</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getIntegerRange()
 * @model
 * @generated
 */
public interface IntegerRange extends NumberRange {
	/**
	 * Returns the value of the '<em><b>Left Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Bound</em>' attribute.
	 * @see #setLeftBound(int)
	 * @see ses.SesPackage#getIntegerRange_LeftBound()
	 * @model required="true"
	 * @generated
	 */
	int getLeftBound();

	/**
	 * Sets the value of the '{@link ses.IntegerRange#getLeftBound <em>Left Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Bound</em>' attribute.
	 * @see #getLeftBound()
	 * @generated
	 */
	void setLeftBound(int value);

	/**
	 * Returns the value of the '<em><b>Right Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Bound</em>' attribute.
	 * @see #setRightBound(int)
	 * @see ses.SesPackage#getIntegerRange_RightBound()
	 * @model required="true"
	 * @generated
	 */
	int getRightBound();

	/**
	 * Sets the value of the '{@link ses.IntegerRange#getRightBound <em>Right Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Bound</em>' attribute.
	 * @see #getRightBound()
	 * @generated
	 */
	void setRightBound(int value);

} // IntegerRange
