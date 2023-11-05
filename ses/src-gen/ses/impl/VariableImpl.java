/**
 */
package ses.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ses.Entity;
import ses.Range;
import ses.SES;
import ses.SesPackage;
import ses.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ses.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link ses.impl.VariableImpl#getSes <em>Ses</em>}</li>
 *   <li>{@link ses.impl.VariableImpl#getRange <em>Range</em>}</li>
 *   <li>{@link ses.impl.VariableImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link ses.impl.VariableImpl#getDependsOn <em>Depends On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable {
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
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> dependsOn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.VARIABLE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.VARIABLE__SES, oldSes, ses));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SesPackage.VARIABLE__SES,
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
				msgs = ((InternalEObject) ses).eInverseRemove(this, SesPackage.SES__VARIABLES, SES.class, msgs);
			if (newSes != null)
				msgs = ((InternalEObject) newSes).eInverseAdd(this, SesPackage.SES__VARIABLES, SES.class, msgs);
			msgs = basicSetSes(newSes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.VARIABLE__SES, newSes, newSes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getRange() {
		if (range != null && range.eIsProxy()) {
			InternalEObject oldRange = (InternalEObject) range;
			range = (Range) eResolveProxy(oldRange);
			if (range != oldRange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.VARIABLE__RANGE, oldRange,
							range));
			}
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range basicGetRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SesPackage.VARIABLE__RANGE,
					oldRange, newRange);
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
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject) range).eInverseRemove(this, SesPackage.RANGE__VARIABLE, Range.class, msgs);
			if (newRange != null)
				msgs = ((InternalEObject) newRange).eInverseAdd(this, SesPackage.RANGE__VARIABLE, Range.class, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.VARIABLE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject) entity;
			entity = (Entity) eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.VARIABLE__ENTITY, oldEntity,
							entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SesPackage.VARIABLE__ENTITY,
					oldEntity, newEntity);
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
	public void setEntity(Entity newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this, SesPackage.ENTITY__VARIABLES, Entity.class,
						msgs);
			if (newEntity != null)
				msgs = ((InternalEObject) newEntity).eInverseAdd(this, SesPackage.ENTITY__VARIABLES, Entity.class,
						msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.VARIABLE__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectResolvingEList<Variable>(Variable.class, this, SesPackage.VARIABLE__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SesPackage.VARIABLE__SES:
			if (ses != null)
				msgs = ((InternalEObject) ses).eInverseRemove(this, SesPackage.SES__VARIABLES, SES.class, msgs);
			return basicSetSes((SES) otherEnd, msgs);
		case SesPackage.VARIABLE__RANGE:
			if (range != null)
				msgs = ((InternalEObject) range).eInverseRemove(this, SesPackage.RANGE__VARIABLE, Range.class, msgs);
			return basicSetRange((Range) otherEnd, msgs);
		case SesPackage.VARIABLE__ENTITY:
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this, SesPackage.ENTITY__VARIABLES, Entity.class,
						msgs);
			return basicSetEntity((Entity) otherEnd, msgs);
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
		case SesPackage.VARIABLE__SES:
			return basicSetSes(null, msgs);
		case SesPackage.VARIABLE__RANGE:
			return basicSetRange(null, msgs);
		case SesPackage.VARIABLE__ENTITY:
			return basicSetEntity(null, msgs);
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
		case SesPackage.VARIABLE__NAME:
			return getName();
		case SesPackage.VARIABLE__SES:
			if (resolve)
				return getSes();
			return basicGetSes();
		case SesPackage.VARIABLE__RANGE:
			if (resolve)
				return getRange();
			return basicGetRange();
		case SesPackage.VARIABLE__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
		case SesPackage.VARIABLE__DEPENDS_ON:
			return getDependsOn();
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
		case SesPackage.VARIABLE__NAME:
			setName((String) newValue);
			return;
		case SesPackage.VARIABLE__SES:
			setSes((SES) newValue);
			return;
		case SesPackage.VARIABLE__RANGE:
			setRange((Range) newValue);
			return;
		case SesPackage.VARIABLE__ENTITY:
			setEntity((Entity) newValue);
			return;
		case SesPackage.VARIABLE__DEPENDS_ON:
			getDependsOn().clear();
			getDependsOn().addAll((Collection<? extends Variable>) newValue);
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
		case SesPackage.VARIABLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SesPackage.VARIABLE__SES:
			setSes((SES) null);
			return;
		case SesPackage.VARIABLE__RANGE:
			setRange((Range) null);
			return;
		case SesPackage.VARIABLE__ENTITY:
			setEntity((Entity) null);
			return;
		case SesPackage.VARIABLE__DEPENDS_ON:
			getDependsOn().clear();
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
		case SesPackage.VARIABLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SesPackage.VARIABLE__SES:
			return ses != null;
		case SesPackage.VARIABLE__RANGE:
			return range != null;
		case SesPackage.VARIABLE__ENTITY:
			return entity != null;
		case SesPackage.VARIABLE__DEPENDS_ON:
			return dependsOn != null && !dependsOn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SesPackage.VARIABLE___TO_STRING:
			return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("{name: " + this.getName() + ", ");
		str.append("entity: " + this.getEntity().getName() + ", ");
		if(this.eIsSet(SesPackage.VARIABLE__RANGE)) {
			str.append("range: " + this.getRange().toString() + ", ");
		}
		str.append("depends on: {");
		if (this.eIsSet(SesPackage.VARIABLE__DEPENDS_ON)) {
			for (Variable var : this.getDependsOn()) {
				str.append(var.getName() + ", ");
			}
			str.setLength(str.length() - 2);
		}
		str.append("}}");

		return str.toString();
	}

} //VariableImpl
