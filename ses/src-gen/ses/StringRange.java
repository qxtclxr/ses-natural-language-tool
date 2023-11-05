/**
 */
package ses;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.StringRange#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getStringRange()
 * @model
 * @generated
 */
public interface StringRange extends Range {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute list.
	 * @see ses.SesPackage#getStringRange_Range()
	 * @model
	 * @generated
	 */
	EList<String> getRange();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();

} // StringRange
