/**
 */
package ses.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ses.IntegerRange;
import ses.SesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ses.impl.IntegerRangeImpl#getLeftBound <em>Left Bound</em>}</li>
 *   <li>{@link ses.impl.IntegerRangeImpl#getRightBound <em>Right Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerRangeImpl extends NumberRangeImpl implements IntegerRange {
	/**
	 * The default value of the '{@link #getLeftBound() <em>Left Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBound()
	 * @generated
	 * @ordered
	 */
	protected static final int LEFT_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLeftBound() <em>Left Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftBound()
	 * @generated
	 * @ordered
	 */
	protected int leftBound = LEFT_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightBound() <em>Right Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBound()
	 * @generated
	 * @ordered
	 */
	protected static final int RIGHT_BOUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRightBound() <em>Right Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightBound()
	 * @generated
	 * @ordered
	 */
	protected int rightBound = RIGHT_BOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.INTEGER_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLeftBound() {
		return leftBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftBound(int newLeftBound) {
		int oldLeftBound = leftBound;
		leftBound = newLeftBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.INTEGER_RANGE__LEFT_BOUND, oldLeftBound,
					leftBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRightBound() {
		return rightBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRightBound(int newRightBound) {
		int oldRightBound = rightBound;
		rightBound = newRightBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.INTEGER_RANGE__RIGHT_BOUND, oldRightBound,
					rightBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SesPackage.INTEGER_RANGE__LEFT_BOUND:
			return getLeftBound();
		case SesPackage.INTEGER_RANGE__RIGHT_BOUND:
			return getRightBound();
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
		case SesPackage.INTEGER_RANGE__LEFT_BOUND:
			setLeftBound((Integer) newValue);
			return;
		case SesPackage.INTEGER_RANGE__RIGHT_BOUND:
			setRightBound((Integer) newValue);
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
		case SesPackage.INTEGER_RANGE__LEFT_BOUND:
			setLeftBound(LEFT_BOUND_EDEFAULT);
			return;
		case SesPackage.INTEGER_RANGE__RIGHT_BOUND:
			setRightBound(RIGHT_BOUND_EDEFAULT);
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
		case SesPackage.INTEGER_RANGE__LEFT_BOUND:
			return leftBound != LEFT_BOUND_EDEFAULT;
		case SesPackage.INTEGER_RANGE__RIGHT_BOUND:
			return rightBound != RIGHT_BOUND_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("{type: integer, ");
		str.append("interval: ");
		if (this.isLeftClosed()) {
			str.append("[");
		} else {
			str.append("(");
		}
		str.append(this.getLeftBound() + "," + this.getRightBound());
		if (this.isRightClosed()) {
			str.append("]");
		} else {
			str.append(")");
		}
		str.append("}");
		return str.toString();
	}

} //IntegerRangeImpl
