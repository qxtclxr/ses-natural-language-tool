/**
 */
package ses.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import ses.Aspect;
import ses.NodeEntity;
import ses.SesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AspectImpl extends RelationImpl implements Aspect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("{type: aspect, ");
		str.append("name: " + this.getName() + ", ");
		str.append("parent entity: " + this.getParentEntity().getName() + ", ");
		str.append("child entities: {");
		if (this.eIsSet(SesPackage.ASPECT__CHILD_ENTITIES)) {
			for (NodeEntity ent : this.getChildEntities()) {
				str.append(ent.getName() + ", ");
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
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SesPackage.ASPECT___TO_STRING:
			return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AspectImpl
