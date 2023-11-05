/**
 */
package ses.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ses.NodeEntity;
import ses.Relation;
import ses.SesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ses.impl.NodeEntityImpl#getParentRelation <em>Parent Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeEntityImpl extends EntityImpl implements NodeEntity {
	/**
	 * The cached value of the '{@link #getParentRelation() <em>Parent Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation parentRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.NODE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getParentRelation() {
		if (parentRelation != null && parentRelation.eIsProxy()) {
			InternalEObject oldParentRelation = (InternalEObject) parentRelation;
			parentRelation = (Relation) eResolveProxy(oldParentRelation);
			if (parentRelation != oldParentRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.NODE_ENTITY__PARENT_RELATION,
							oldParentRelation, parentRelation));
			}
		}
		return parentRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetParentRelation() {
		return parentRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRelation(Relation newParentRelation, NotificationChain msgs) {
		Relation oldParentRelation = parentRelation;
		parentRelation = newParentRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SesPackage.NODE_ENTITY__PARENT_RELATION, oldParentRelation, newParentRelation);
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
	public void setParentRelation(Relation newParentRelation) {
		if (newParentRelation != parentRelation) {
			NotificationChain msgs = null;
			if (parentRelation != null)
				msgs = ((InternalEObject) parentRelation).eInverseRemove(this, SesPackage.RELATION__CHILD_ENTITIES,
						Relation.class, msgs);
			if (newParentRelation != null)
				msgs = ((InternalEObject) newParentRelation).eInverseAdd(this, SesPackage.RELATION__CHILD_ENTITIES,
						Relation.class, msgs);
			msgs = basicSetParentRelation(newParentRelation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.NODE_ENTITY__PARENT_RELATION,
					newParentRelation, newParentRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SesPackage.NODE_ENTITY__PARENT_RELATION:
			if (parentRelation != null)
				msgs = ((InternalEObject) parentRelation).eInverseRemove(this, SesPackage.RELATION__CHILD_ENTITIES,
						Relation.class, msgs);
			return basicSetParentRelation((Relation) otherEnd, msgs);
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
		case SesPackage.NODE_ENTITY__PARENT_RELATION:
			return basicSetParentRelation(null, msgs);
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
		case SesPackage.NODE_ENTITY__PARENT_RELATION:
			if (resolve)
				return getParentRelation();
			return basicGetParentRelation();
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
		case SesPackage.NODE_ENTITY__PARENT_RELATION:
			setParentRelation((Relation) newValue);
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
		case SesPackage.NODE_ENTITY__PARENT_RELATION:
			setParentRelation((Relation) null);
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
		case SesPackage.NODE_ENTITY__PARENT_RELATION:
			return parentRelation != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeEntityImpl
