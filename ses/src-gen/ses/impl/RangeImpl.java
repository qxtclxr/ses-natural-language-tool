/**
 */
package ses.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ses.Range;
import ses.SES;
import ses.SesPackage;
import ses.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ses.impl.RangeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link ses.impl.RangeImpl#getSes <em>Ses</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RangeImpl extends MinimalEObjectImpl.Container implements Range {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The cached value of the '{@link #getSes() <em>Ses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSes()
	 * @generated
	 * @ordered
	 */
	protected SES ses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject) variable;
			variable = (Variable) eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.RANGE__VARIABLE, oldVariable,
							variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SesPackage.RANGE__VARIABLE,
					oldVariable, newVariable);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(Variable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject) variable).eInverseRemove(this, SesPackage.VARIABLE__RANGE, Variable.class,
						msgs);
			if (newVariable != null)
				msgs = ((InternalEObject) newVariable).eInverseAdd(this, SesPackage.VARIABLE__RANGE, Variable.class,
						msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.RANGE__VARIABLE, newVariable,
					newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SES getSes() {
		if (ses != null && ses.eIsProxy()) {
			InternalEObject oldSes = (InternalEObject) ses;
			ses = (SES) eResolveProxy(oldSes);
			if (ses != oldSes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.RANGE__SES, oldSes, ses));
			}
		}
		return ses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SES basicGetSes() {
		return ses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSes(SES newSes, NotificationChain msgs) {
		SES oldSes = ses;
		ses = newSes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SesPackage.RANGE__SES,
					oldSes, newSes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSes(SES newSes) {
		if (newSes != ses) {
			NotificationChain msgs = null;
			if (ses != null)
				msgs = ((InternalEObject) ses).eInverseRemove(this, SesPackage.SES__RANGES, SES.class, msgs);
			if (newSes != null)
				msgs = ((InternalEObject) newSes).eInverseAdd(this, SesPackage.SES__RANGES, SES.class, msgs);
			msgs = basicSetSes(newSes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.RANGE__SES, newSes, newSes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SesPackage.RANGE__VARIABLE:
			if (variable != null)
				msgs = ((InternalEObject) variable).eInverseRemove(this, SesPackage.VARIABLE__RANGE, Variable.class,
						msgs);
			return basicSetVariable((Variable) otherEnd, msgs);
		case SesPackage.RANGE__SES:
			if (ses != null)
				msgs = ((InternalEObject) ses).eInverseRemove(this, SesPackage.SES__RANGES, SES.class, msgs);
			return basicSetSes((SES) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SesPackage.RANGE__VARIABLE:
			return basicSetVariable(null, msgs);
		case SesPackage.RANGE__SES:
			return basicSetSes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SesPackage.RANGE__VARIABLE:
			if (resolve)
				return getVariable();
			return basicGetVariable();
		case SesPackage.RANGE__SES:
			if (resolve)
				return getSes();
			return basicGetSes();
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
		case SesPackage.RANGE__VARIABLE:
			setVariable((Variable) newValue);
			return;
		case SesPackage.RANGE__SES:
			setSes((SES) newValue);
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
		case SesPackage.RANGE__VARIABLE:
			setVariable((Variable) null);
			return;
		case SesPackage.RANGE__SES:
			setSes((SES) null);
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
		case SesPackage.RANGE__VARIABLE:
			return variable != null;
		case SesPackage.RANGE__SES:
			return ses != null;
		}
		return super.eIsSet(featureID);
	}

} //RangeImpl
