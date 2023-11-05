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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ses.Entity;
import ses.Relation;
import ses.SES;
import ses.SesPackage;
import ses.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ses.impl.EntityImpl#getChildRelations <em>Child Relations</em>}</li>
 *   <li>{@link ses.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link ses.impl.EntityImpl#getSes <em>Ses</em>}</li>
 *   <li>{@link ses.impl.EntityImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The cached value of the '{@link #getChildRelations() <em>Child Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> childRelations;

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
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getChildRelations() {
		if (childRelations == null) {
			childRelations = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this,
					SesPackage.ENTITY__CHILD_RELATIONS, SesPackage.RELATION__PARENT_ENTITY);
		}
		return childRelations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.ENTITY__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SesPackage.ENTITY__SES, oldSes, ses));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SesPackage.ENTITY__SES,
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
				msgs = ((InternalEObject) ses).eInverseRemove(this, SesPackage.SES__ENTITIES, SES.class, msgs);
			if (newSes != null)
				msgs = ((InternalEObject) newSes).eInverseAdd(this, SesPackage.SES__ENTITIES, SES.class, msgs);
			msgs = basicSetSes(newSes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SesPackage.ENTITY__SES, newSes, newSes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectWithInverseResolvingEList<Variable>(Variable.class, this,
					SesPackage.ENTITY__VARIABLES, SesPackage.VARIABLE__ENTITY);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("{name: " + this.getName() + ", ");
		str.append("relations: {");
		if (this.eIsSet(SesPackage.ENTITY__CHILD_RELATIONS)) {
			for (Relation rel : this.getChildRelations()) {
				str.append(rel.getName() + ", ");
			}
			str.setLength(str.length() - 2);
		}
		str.append("}, ");
		str.append("variables: {");
		if (this.eIsSet(SesPackage.ENTITY__VARIABLES)) {
			for (Variable var : this.getVariables()) {
				str.append(var.getName() + ", ");
			}
			str.setLength(str.length() - 2);
		}
		str.append("}}");
		return str.toString();
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
		case SesPackage.ENTITY__CHILD_RELATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildRelations()).basicAdd(otherEnd, msgs);
		case SesPackage.ENTITY__SES:
			if (ses != null)
				msgs = ((InternalEObject) ses).eInverseRemove(this, SesPackage.SES__ENTITIES, SES.class, msgs);
			return basicSetSes((SES) otherEnd, msgs);
		case SesPackage.ENTITY__VARIABLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables()).basicAdd(otherEnd, msgs);
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
		case SesPackage.ENTITY__CHILD_RELATIONS:
			return ((InternalEList<?>) getChildRelations()).basicRemove(otherEnd, msgs);
		case SesPackage.ENTITY__SES:
			return basicSetSes(null, msgs);
		case SesPackage.ENTITY__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
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
		case SesPackage.ENTITY__CHILD_RELATIONS:
			return getChildRelations();
		case SesPackage.ENTITY__NAME:
			return getName();
		case SesPackage.ENTITY__SES:
			if (resolve)
				return getSes();
			return basicGetSes();
		case SesPackage.ENTITY__VARIABLES:
			return getVariables();
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
		case SesPackage.ENTITY__CHILD_RELATIONS:
			getChildRelations().clear();
			getChildRelations().addAll((Collection<? extends Relation>) newValue);
			return;
		case SesPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case SesPackage.ENTITY__SES:
			setSes((SES) newValue);
			return;
		case SesPackage.ENTITY__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends Variable>) newValue);
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
		case SesPackage.ENTITY__CHILD_RELATIONS:
			getChildRelations().clear();
			return;
		case SesPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SesPackage.ENTITY__SES:
			setSes((SES) null);
			return;
		case SesPackage.ENTITY__VARIABLES:
			getVariables().clear();
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
		case SesPackage.ENTITY__CHILD_RELATIONS:
			return childRelations != null && !childRelations.isEmpty();
		case SesPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SesPackage.ENTITY__SES:
			return ses != null;
		case SesPackage.ENTITY__VARIABLES:
			return variables != null && !variables.isEmpty();
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
		case SesPackage.ENTITY___TO_STRING:
			return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntityImpl
