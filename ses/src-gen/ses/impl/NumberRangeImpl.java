/**
 */
package ses.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ses.NumberRange;
import ses.SesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ses.impl.NumberRangeImpl#isLeftClosed <em>Left Closed</em>}</li>
 *   <li>{@link ses.impl.NumberRangeImpl#isRightClosed <em>Right Closed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NumberRangeImpl extends RangeImpl implements NumberRange {
	/**
	 * The default value of the '{@link #isLeftClosed() <em>Left Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEFT_CLOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeftClosed() <em>Left Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean leftClosed = LEFT_CLOSED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRightClosed() <em>Right Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIGHT_CLOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRightClosed() <em>Right Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRightClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean rightClosed = RIGHT_CLOSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.NUMBER_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLeftClosed() {
		return leftClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftClosed(boolean newLeftClosed) {
		boolean oldLeftClosed = leftClosed;
		leftClosed = newLeftClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.NUMBER_RANGE__LEFT_CLOSED, oldLeftClosed,
					leftClosed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRightClosed() {
		return rightClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightClosed(boolean newRightClosed) {
		boolean oldRightClosed = rightClosed;
		rightClosed = newRightClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.NUMBER_RANGE__RIGHT_CLOSED, oldRightClosed,
					rightClosed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SesPackage.NUMBER_RANGE__LEFT_CLOSED:
			return isLeftClosed();
		case SesPackage.NUMBER_RANGE__RIGHT_CLOSED:
			return isRightClosed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SesPackage.NUMBER_RANGE__LEFT_CLOSED:
			setLeftClosed((Boolean) newValue);
			return;
		case SesPackage.NUMBER_RANGE__RIGHT_CLOSED:
			setRightClosed((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SesPackage.NUMBER_RANGE__LEFT_CLOSED:
			setLeftClosed(LEFT_CLOSED_EDEFAULT);
			return;
		case SesPackage.NUMBER_RANGE__RIGHT_CLOSED:
			setRightClosed(RIGHT_CLOSED_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SesPackage.NUMBER_RANGE__LEFT_CLOSED:
			return leftClosed != LEFT_CLOSED_EDEFAULT;
		case SesPackage.NUMBER_RANGE__RIGHT_CLOSED:
			return rightClosed != RIGHT_CLOSED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (leftClosed: ");
		result.append(leftClosed);
		result.append(", rightClosed: ");
		result.append(rightClosed);
		result.append(')');
		return result.toString();
	}

} //NumberRangeImpl
