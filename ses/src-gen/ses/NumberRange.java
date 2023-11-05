/**
 */
package ses;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.NumberRange#isLeftClosed <em>Left Closed</em>}</li>
 *   <li>{@link ses.NumberRange#isRightClosed <em>Right Closed</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getNumberRange()
 * @model abstract="true"
 * @generated
 */
public interface NumberRange extends Range {
	/**
	 * Returns the value of the '<em><b>Left Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Closed</em>' attribute.
	 * @see #setLeftClosed(boolean)
	 * @see ses.SesPackage#getNumberRange_LeftClosed()
	 * @model required="true"
	 * @generated
	 */
	boolean isLeftClosed();

	/**
	 * Sets the value of the '{@link ses.NumberRange#isLeftClosed <em>Left Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Closed</em>' attribute.
	 * @see #isLeftClosed()
	 * @generated
	 */
	void setLeftClosed(boolean value);

	/**
	 * Returns the value of the '<em><b>Right Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Closed</em>' attribute.
	 * @see #setRightClosed(boolean)
	 * @see ses.SesPackage#getNumberRange_RightClosed()
	 * @model required="true"
	 * @generated
	 */
	boolean isRightClosed();

	/**
	 * Sets the value of the '{@link ses.NumberRange#isRightClosed <em>Right Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Closed</em>' attribute.
	 * @see #isRightClosed()
	 * @generated
	 */
	void setRightClosed(boolean value);

} // NumberRange
