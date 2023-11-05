/**
 */
package ses.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import ses.NodeEntity;
import ses.SesPackage;
import ses.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecializationImpl extends RelationImpl implements Specialization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SesPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("{type: specialization, ");
		str.append("name: " + this.getName() + ", ");
		str.append("parent entity: " + this.getParentEntity().getName() + ", ");
		str.append("child entities: {");
		if (this.eIsSet(SesPackage.SPECIALIZATION__CHILD_ENTITIES)) {
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
		case SesPackage.SPECIALIZATION___TO_STRING:
			return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SpecializationImpl
