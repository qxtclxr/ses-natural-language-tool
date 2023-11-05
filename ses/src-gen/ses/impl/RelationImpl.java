/**
 */
package ses.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ses.Entity;
import ses.NodeEntity;
import ses.Relation;
import ses.SES;
import ses.SesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ses.impl.RelationImpl#getParentEntity <em>Parent Entity</em>}</li>
 *   <li>{@link ses.impl.RelationImpl#getChildEntities <em>Child Entities</em>}</li>
 *   <li>{@link ses.impl.RelationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ses.impl.RelationImpl#getSes <em>Ses</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The cached value of the '{@link #getParentEntity() <em>Parent Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity parentEntity;

	/**
	 * The cached value of the '{@link #getChildEntities() <em>Child Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeEntity> childEntities;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getParentEntity() {
		if (parentEntity != null && parentEntity.eIsProxy()) {
			InternalEObject oldParentEntity = (InternalEObject) parentEntity;
			parentEntity = (Entity) eResolveProxy(oldParentEntity);
			if (parentEntity != oldParentEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.RELATION__PARENT_ENTITY,
							oldParentEntity, parentEntity));
			}
		}
		return parentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetParentEntity() {
		return parentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentEntity(Entity newParentEntity, NotificationChain msgs) {
		Entity oldParentEntity = parentEntity;
		parentEntity = newParentEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SesPackage.RELATION__PARENT_ENTITY, oldParentEntity, newParentEntity);
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
	public void setParentEntity(Entity newParentEntity) {
		if (newParentEntity != parentEntity) {
			NotificationChain msgs = null;
			if (parentEntity != null)
				msgs = ((InternalEObject) parentEntity).eInverseRemove(this, SesPackage.ENTITY__CHILD_RELATIONS,
						Entity.class, msgs);
			if (newParentEntity != null)
				msgs = ((InternalEObject) newParentEntity).eInverseAdd(this, SesPackage.ENTITY__CHILD_RELATIONS,
						Entity.class, msgs);
			msgs = basicSetParentEntity(newParentEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.RELATION__PARENT_ENTITY, newParentEntity,
					newParentEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodeEntity> getChildEntities() {
		if (childEntities == null) {
			childEntities = new EObjectWithInverseResolvingEList<NodeEntity>(NodeEntity.class, this,
					SesPackage.RELATION__CHILD_ENTITIES, SesPackage.NODE_ENTITY__PARENT_RELATION);
		}
		return childEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.RELATION__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.RELATION__SES, oldSes, ses));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SesPackage.RELATION__SES,
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
				msgs = ((InternalEObject) ses).eInverseRemove(this, SesPackage.SES__RELATIONS, SES.class, msgs);
			if (newSes != null)
				msgs = ((InternalEObject) newSes).eInverseAdd(this, SesPackage.SES__RELATIONS, SES.class, msgs);
			msgs = basicSetSes(newSes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.RELATION__SES, newSes, newSes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SesPackage.RELATION__PARENT_ENTITY:
			if (parentEntity != null)
				msgs = ((InternalEObject) parentEntity).eInverseRemove(this, SesPackage.ENTITY__CHILD_RELATIONS,
						Entity.class, msgs);
			return basicSetParentEntity((Entity) otherEnd, msgs);
		case SesPackage.RELATION__CHILD_ENTITIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildEntities()).basicAdd(otherEnd, msgs);
		case SesPackage.RELATION__SES:
			if (ses != null)
				msgs = ((InternalEObject) ses).eInverseRemove(this, SesPackage.SES__RELATIONS, SES.class, msgs);
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
		case SesPackage.RELATION__PARENT_ENTITY:
			return basicSetParentEntity(null, msgs);
		case SesPackage.RELATION__CHILD_ENTITIES:
			return ((InternalEList<?>) getChildEntities()).basicRemove(otherEnd, msgs);
		case SesPackage.RELATION__SES:
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
		case SesPackage.RELATION__PARENT_ENTITY:
			if (resolve)
				return getParentEntity();
			return basicGetParentEntity();
		case SesPackage.RELATION__CHILD_ENTITIES:
			return getChildEntities();
		case SesPackage.RELATION__NAME:
			return getName();
		case SesPackage.RELATION__SES:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SesPackage.RELATION__PARENT_ENTITY:
			setParentEntity((Entity) newValue);
			return;
		case SesPackage.RELATION__CHILD_ENTITIES:
			getChildEntities().clear();
			getChildEntities().addAll((Collection<? extends NodeEntity>) newValue);
			return;
		case SesPackage.RELATION__NAME:
			setName((String) newValue);
			return;
		case SesPackage.RELATION__SES:
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
		case SesPackage.RELATION__PARENT_ENTITY:
			setParentEntity((Entity) null);
			return;
		case SesPackage.RELATION__CHILD_ENTITIES:
			getChildEntities().clear();
			return;
		case SesPackage.RELATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SesPackage.RELATION__SES:
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
		case SesPackage.RELATION__PARENT_ENTITY:
			return parentEntity != null;
		case SesPackage.RELATION__CHILD_ENTITIES:
			return childEntities != null && !childEntities.isEmpty();
		case SesPackage.RELATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SesPackage.RELATION__SES:
			return ses != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
