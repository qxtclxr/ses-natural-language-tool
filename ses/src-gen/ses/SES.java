/**
 */
package ses;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SES</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ses.SES#getVariables <em>Variables</em>}</li>
 *   <li>{@link ses.SES#getEntities <em>Entities</em>}</li>
 *   <li>{@link ses.SES#getRelations <em>Relations</em>}</li>
 *   <li>{@link ses.SES#getRanges <em>Ranges</em>}</li>
 * </ul>
 *
 * @see ses.SesPackage#getSES()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onlyOneRootEntity'"
 * @generated
 */
public interface SES extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link ses.Variable}.
	 * It is bidirectional and its opposite is '{@link ses.Variable#getSes <em>Ses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see ses.SesPackage#getSES_Variables()
	 * @see ses.Variable#getSes
	 * @model opposite="ses"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link ses.Entity}.
	 * It is bidirectional and its opposite is '{@link ses.Entity#getSes <em>Ses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see ses.SesPackage#getSES_Entities()
	 * @see ses.Entity#getSes
	 * @model opposite="ses" required="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link ses.Relation}.
	 * It is bidirectional and its opposite is '{@link ses.Relation#getSes <em>Ses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see ses.SesPackage#getSES_Relations()
	 * @see ses.Relation#getSes
	 * @model opposite="ses"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Ranges</b></em>' reference list.
	 * The list contents are of type {@link ses.Range}.
	 * It is bidirectional and its opposite is '{@link ses.Range#getSes <em>Ses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' reference list.
	 * @see ses.SesPackage#getSES_Ranges()
	 * @see ses.Range#getSes
	 * @model opposite="ses"
	 * @generated
	 */
	EList<Range> getRanges();

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='entities-&gt;one(e : Entity | e.oclIsKindOf(RootEntity))'"
	 * @generated
	 */
	boolean onlyOneRootEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SES
