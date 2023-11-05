/**
 */
package ses;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiaspect</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ses.SesPackage#getMultiaspect()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='restrictMultiaspectToOneChild'"
 * @generated
 */
public interface Multiaspect extends Relation {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.childEntities-&gt;size() = 1'"
	 * @generated
	 */
	boolean restrictMultiaspectToOneChild(DiagnosticChain diagnostics, Map<Object, Object> context);
} // Multiaspect
