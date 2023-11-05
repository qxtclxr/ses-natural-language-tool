/**
 */
package ses;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floating Point Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.FloatingPointRange#getLeftBound <em>Left Bound</em>}</li>
 *   <li>{@link ses.FloatingPointRange#getRightBound <em>Right Bound</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getFloatingPointRange()
 * @model
 * @generated
 */
public interface FloatingPointRange extends NumberRange {
	/**
	 * Returns the value of the '<em><b>Left Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Bound</em>' attribute.
	 * @see #setLeftBound(double)
	 * @see ses.SesPackage#getFloatingPointRange_LeftBound()
	 * @model required="true"
	 * @generated
	 */
	double getLeftBound();

	/**
	 * Sets the value of the '{@link ses.FloatingPointRange#getLeftBound <em>Left Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Bound</em>' attribute.
	 * @see #getLeftBound()
	 * @generated
	 */
	void setLeftBound(double value);

	/**
	 * Returns the value of the '<em><b>Right Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Bound</em>' attribute.
	 * @see #setRightBound(double)
	 * @see ses.SesPackage#getFloatingPointRange_RightBound()
	 * @model required="true"
	 * @generated
	 */
	double getRightBound();

	/**
	 * Sets the value of the '{@link ses.FloatingPointRange#getRightBound <em>Right Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Bound</em>' attribute.
	 * @see #getRightBound()
	 * @generated
	 */
	void setRightBound(double value);

} // FloatingPointRange
