/**
 */
package ses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ses.SesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface SesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ses";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SesPackage eINSTANCE = ses.impl.SesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ses.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.EntityImpl
	 * @see ses.impl.SesPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Child Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CHILD_RELATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SES = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VARIABLES = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ses.impl.RootEntityImpl <em>Root Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.RootEntityImpl
	 * @see ses.impl.SesPackageImpl#getRootEntity()
	 * @generated
	 */
	int ROOT_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Child Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ENTITY__CHILD_RELATIONS = ENTITY__CHILD_RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ENTITY__SES = ENTITY__SES;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ENTITY__VARIABLES = ENTITY__VARIABLES;

	/**
	 * The number of structural features of the '<em>Root Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ENTITY___TO_STRING = ENTITY___TO_STRING;

	/**
	 * The number of operations of the '<em>Root Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ses.impl.NodeEntityImpl <em>Node Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.NodeEntityImpl
	 * @see ses.impl.SesPackageImpl#getNodeEntity()
	 * @generated
	 */
	int NODE_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Child Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__CHILD_RELATIONS = ENTITY__CHILD_RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__SES = ENTITY__SES;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__VARIABLES = ENTITY__VARIABLES;

	/**
	 * The feature id for the '<em><b>Parent Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY__PARENT_RELATION = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY___TO_STRING = ENTITY___TO_STRING;

	/**
	 * The number of operations of the '<em>Node Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ses.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.RelationImpl
	 * @see ses.impl.SesPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 6;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PARENT_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Child Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CHILD_ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SES = 3;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ses.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.AspectImpl
	 * @see ses.impl.SesPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 3;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__PARENT_ENTITY = RELATION__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Child Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__CHILD_ENTITIES = RELATION__CHILD_ENTITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__SES = RELATION__SES;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT___TO_STRING = RELATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ses.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.SpecializationImpl
	 * @see ses.impl.SesPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PARENT_ENTITY = RELATION__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Child Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__CHILD_ENTITIES = RELATION__CHILD_ENTITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SES = RELATION__SES;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION___TO_STRING = RELATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ses.impl.MultiaspectImpl <em>Multiaspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.MultiaspectImpl
	 * @see ses.impl.SesPackageImpl#getMultiaspect()
	 * @generated
	 */
	int MULTIASPECT = 5;

	/**
	 * The feature id for the '<em><b>Parent Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIASPECT__PARENT_ENTITY = RELATION__PARENT_ENTITY;

	/**
	 * The feature id for the '<em><b>Child Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIASPECT__CHILD_ENTITIES = RELATION__CHILD_ENTITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIASPECT__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIASPECT__SES = RELATION__SES;

	/**
	 * The number of structural features of the '<em>Multiaspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIASPECT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIASPECT___TO_STRING = RELATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Restrict Multiaspect To One Child</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIASPECT___RESTRICT_MULTIASPECT_TO_ONE_CHILD__DIAGNOSTICCHAIN_MAP = RELATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiaspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIASPECT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link ses.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.VariableImpl
	 * @see ses.impl.SesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SES = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEPENDS_ON = 4;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ses.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.RangeImpl
	 * @see ses.impl.SesPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 8;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__SES = 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ses.impl.NumberRangeImpl <em>Number Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.NumberRangeImpl
	 * @see ses.impl.SesPackageImpl#getNumberRange()
	 * @generated
	 */
	int NUMBER_RANGE = 9;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__VARIABLE = RANGE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__SES = RANGE__SES;

	/**
	 * The feature id for the '<em><b>Left Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__LEFT_CLOSED = RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__RIGHT_CLOSED = RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Number Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE_OPERATION_COUNT = RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ses.impl.StringRangeImpl <em>String Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.StringRangeImpl
	 * @see ses.impl.SesPackageImpl#getStringRange()
	 * @generated
	 */
	int STRING_RANGE = 10;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE__VARIABLE = RANGE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE__SES = RANGE__SES;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE__RANGE = RANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE___TO_STRING = RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_RANGE_OPERATION_COUNT = RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ses.impl.BooleanRangeImpl <em>Boolean Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.BooleanRangeImpl
	 * @see ses.impl.SesPackageImpl#getBooleanRange()
	 * @generated
	 */
	int BOOLEAN_RANGE = 11;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RANGE__VARIABLE = RANGE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RANGE__SES = RANGE__SES;

	/**
	 * The number of structural features of the '<em>Boolean Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RANGE_FEATURE_COUNT = RANGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RANGE___TO_STRING = RANGE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_RANGE_OPERATION_COUNT = RANGE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ses.impl.IntegerRangeImpl <em>Integer Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.IntegerRangeImpl
	 * @see ses.impl.SesPackageImpl#getIntegerRange()
	 * @generated
	 */
	int INTEGER_RANGE = 12;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__VARIABLE = NUMBER_RANGE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__SES = NUMBER_RANGE__SES;

	/**
	 * The feature id for the '<em><b>Left Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__LEFT_CLOSED = NUMBER_RANGE__LEFT_CLOSED;

	/**
	 * The feature id for the '<em><b>Right Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__RIGHT_CLOSED = NUMBER_RANGE__RIGHT_CLOSED;

	/**
	 * The feature id for the '<em><b>Left Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__LEFT_BOUND = NUMBER_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE__RIGHT_BOUND = NUMBER_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_FEATURE_COUNT = NUMBER_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_RANGE_OPERATION_COUNT = NUMBER_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ses.impl.SESImpl <em>SES</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.SESImpl
	 * @see ses.impl.SesPackageImpl#getSES()
	 * @generated
	 */
	int SES = 13;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SES__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SES__ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SES__RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Ranges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SES__RANGES = 3;

	/**
	 * The number of structural features of the '<em>SES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SES_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SES___TO_STRING = 0;

	/**
	 * The operation id for the '<em>Only One Root Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SES___ONLY_ONE_ROOT_ENTITY__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>SES</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link ses.impl.FloatingPointRangeImpl <em>Floating Point Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ses.impl.FloatingPointRangeImpl
	 * @see ses.impl.SesPackageImpl#getFloatingPointRange()
	 * @generated
	 */
	int FLOATING_POINT_RANGE = 14;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_RANGE__VARIABLE = NUMBER_RANGE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Ses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_RANGE__SES = NUMBER_RANGE__SES;

	/**
	 * The feature id for the '<em><b>Left Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_RANGE__LEFT_CLOSED = NUMBER_RANGE__LEFT_CLOSED;

	/**
	 * The feature id for the '<em><b>Right Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_RANGE__RIGHT_CLOSED = NUMBER_RANGE__RIGHT_CLOSED;

	/**
	 * The feature id for the '<em><b>Left Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_RANGE__LEFT_BOUND = NUMBER_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_RANGE__RIGHT_BOUND = NUMBER_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Floating Point Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_RANGE_FEATURE_COUNT = NUMBER_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Floating Point Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_POINT_RANGE_OPERATION_COUNT = NUMBER_RANGE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ses.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see ses.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference list '{@link ses.Entity#getChildRelations <em>Child Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Relations</em>'.
	 * @see ses.Entity#getChildRelations()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_ChildRelations();

	/**
	 * Returns the meta object for the attribute '{@link ses.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ses.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link ses.Entity#getSes <em>Ses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ses</em>'.
	 * @see ses.Entity#getSes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Ses();

	/**
	 * Returns the meta object for the reference list '{@link ses.Entity#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see ses.Entity#getVariables()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Variables();

	/**
	 * Returns the meta object for the '{@link ses.Entity#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ses.Entity#toString()
	 * @generated
	 */
	EOperation getEntity__ToString();

	/**
	 * Returns the meta object for class '{@link ses.RootEntity <em>Root Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Entity</em>'.
	 * @see ses.RootEntity
	 * @generated
	 */
	EClass getRootEntity();

	/**
	 * Returns the meta object for class '{@link ses.NodeEntity <em>Node Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Entity</em>'.
	 * @see ses.NodeEntity
	 * @generated
	 */
	EClass getNodeEntity();

	/**
	 * Returns the meta object for the reference '{@link ses.NodeEntity#getParentRelation <em>Parent Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Relation</em>'.
	 * @see ses.NodeEntity#getParentRelation()
	 * @see #getNodeEntity()
	 * @generated
	 */
	EReference getNodeEntity_ParentRelation();

	/**
	 * Returns the meta object for class '{@link ses.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see ses.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the '{@link ses.Aspect#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ses.Aspect#toString()
	 * @generated
	 */
	EOperation getAspect__ToString();

	/**
	 * Returns the meta object for class '{@link ses.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see ses.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the '{@link ses.Specialization#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ses.Specialization#toString()
	 * @generated
	 */
	EOperation getSpecialization__ToString();

	/**
	 * Returns the meta object for class '{@link ses.Multiaspect <em>Multiaspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiaspect</em>'.
	 * @see ses.Multiaspect
	 * @generated
	 */
	EClass getMultiaspect();

	/**
	 * Returns the meta object for the '{@link ses.Multiaspect#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ses.Multiaspect#toString()
	 * @generated
	 */
	EOperation getMultiaspect__ToString();

	/**
	 * Returns the meta object for the '{@link ses.Multiaspect#restrictMultiaspectToOneChild(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Restrict Multiaspect To One Child</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restrict Multiaspect To One Child</em>' operation.
	 * @see ses.Multiaspect#restrictMultiaspectToOneChild(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMultiaspect__RestrictMultiaspectToOneChild__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ses.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see ses.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link ses.Relation#getParentEntity <em>Parent Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Entity</em>'.
	 * @see ses.Relation#getParentEntity()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_ParentEntity();

	/**
	 * Returns the meta object for the reference list '{@link ses.Relation#getChildEntities <em>Child Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child Entities</em>'.
	 * @see ses.Relation#getChildEntities()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_ChildEntities();

	/**
	 * Returns the meta object for the attribute '{@link ses.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ses.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the reference '{@link ses.Relation#getSes <em>Ses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ses</em>'.
	 * @see ses.Relation#getSes()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Ses();

	/**
	 * Returns the meta object for class '{@link ses.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ses.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link ses.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ses.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link ses.Variable#getSes <em>Ses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ses</em>'.
	 * @see ses.Variable#getSes()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Ses();

	/**
	 * Returns the meta object for the reference '{@link ses.Variable#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see ses.Variable#getRange()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Range();

	/**
	 * Returns the meta object for the reference '{@link ses.Variable#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see ses.Variable#getEntity()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Entity();

	/**
	 * Returns the meta object for the reference list '{@link ses.Variable#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see ses.Variable#getDependsOn()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_DependsOn();

	/**
	 * Returns the meta object for the '{@link ses.Variable#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ses.Variable#toString()
	 * @generated
	 */
	EOperation getVariable__ToString();

	/**
	 * Returns the meta object for class '{@link ses.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see ses.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the reference '{@link ses.Range#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see ses.Range#getVariable()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Variable();

	/**
	 * Returns the meta object for the reference '{@link ses.Range#getSes <em>Ses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ses</em>'.
	 * @see ses.Range#getSes()
	 * @see #getRange()
	 * @generated
	 */
	EReference getRange_Ses();

	/**
	 * Returns the meta object for class '{@link ses.NumberRange <em>Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Range</em>'.
	 * @see ses.NumberRange
	 * @generated
	 */
	EClass getNumberRange();

	/**
	 * Returns the meta object for the attribute '{@link ses.NumberRange#isLeftClosed <em>Left Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Closed</em>'.
	 * @see ses.NumberRange#isLeftClosed()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_LeftClosed();

	/**
	 * Returns the meta object for the attribute '{@link ses.NumberRange#isRightClosed <em>Right Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Closed</em>'.
	 * @see ses.NumberRange#isRightClosed()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_RightClosed();

	/**
	 * Returns the meta object for class '{@link ses.StringRange <em>String Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Range</em>'.
	 * @see ses.StringRange
	 * @generated
	 */
	EClass getStringRange();

	/**
	 * Returns the meta object for the attribute list '{@link ses.StringRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Range</em>'.
	 * @see ses.StringRange#getRange()
	 * @see #getStringRange()
	 * @generated
	 */
	EAttribute getStringRange_Range();

	/**
	 * Returns the meta object for the '{@link ses.StringRange#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ses.StringRange#toString()
	 * @generated
	 */
	EOperation getStringRange__ToString();

	/**
	 * Returns the meta object for class '{@link ses.BooleanRange <em>Boolean Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Range</em>'.
	 * @see ses.BooleanRange
	 * @generated
	 */
	EClass getBooleanRange();

	/**
	 * Returns the meta object for the '{@link ses.BooleanRange#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ses.BooleanRange#toString()
	 * @generated
	 */
	EOperation getBooleanRange__ToString();

	/**
	 * Returns the meta object for class '{@link ses.IntegerRange <em>Integer Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Range</em>'.
	 * @see ses.IntegerRange
	 * @generated
	 */
	EClass getIntegerRange();

	/**
	 * Returns the meta object for the attribute '{@link ses.IntegerRange#getLeftBound <em>Left Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Bound</em>'.
	 * @see ses.IntegerRange#getLeftBound()
	 * @see #getIntegerRange()
	 * @generated
	 */
	EAttribute getIntegerRange_LeftBound();

	/**
	 * Returns the meta object for the attribute '{@link ses.IntegerRange#getRightBound <em>Right Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Bound</em>'.
	 * @see ses.IntegerRange#getRightBound()
	 * @see #getIntegerRange()
	 * @generated
	 */
	EAttribute getIntegerRange_RightBound();

	/**
	 * Returns the meta object for class '{@link ses.SES <em>SES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SES</em>'.
	 * @see ses.SES
	 * @generated
	 */
	EClass getSES();

	/**
	 * Returns the meta object for the reference list '{@link ses.SES#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see ses.SES#getVariables()
	 * @see #getSES()
	 * @generated
	 */
	EReference getSES_Variables();

	/**
	 * Returns the meta object for the reference list '{@link ses.SES#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see ses.SES#getEntities()
	 * @see #getSES()
	 * @generated
	 */
	EReference getSES_Entities();

	/**
	 * Returns the meta object for the reference list '{@link ses.SES#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see ses.SES#getRelations()
	 * @see #getSES()
	 * @generated
	 */
	EReference getSES_Relations();

	/**
	 * Returns the meta object for the reference list '{@link ses.SES#getRanges <em>Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ranges</em>'.
	 * @see ses.SES#getRanges()
	 * @see #getSES()
	 * @generated
	 */
	EReference getSES_Ranges();

	/**
	 * Returns the meta object for the '{@link ses.SES#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see ses.SES#toString()
	 * @generated
	 */
	EOperation getSES__ToString();

	/**
	 * Returns the meta object for the '{@link ses.SES#onlyOneRootEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only One Root Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Only One Root Entity</em>' operation.
	 * @see ses.SES#onlyOneRootEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSES__OnlyOneRootEntity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link ses.FloatingPointRange <em>Floating Point Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Point Range</em>'.
	 * @see ses.FloatingPointRange
	 * @generated
	 */
	EClass getFloatingPointRange();

	/**
	 * Returns the meta object for the attribute '{@link ses.FloatingPointRange#getLeftBound <em>Left Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Bound</em>'.
	 * @see ses.FloatingPointRange#getLeftBound()
	 * @see #getFloatingPointRange()
	 * @generated
	 */
	EAttribute getFloatingPointRange_LeftBound();

	/**
	 * Returns the meta object for the attribute '{@link ses.FloatingPointRange#getRightBound <em>Right Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Bound</em>'.
	 * @see ses.FloatingPointRange#getRightBound()
	 * @see #getFloatingPointRange()
	 * @generated
	 */
	EAttribute getFloatingPointRange_RightBound();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SesFactory getSesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ses.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.EntityImpl
		 * @see ses.impl.SesPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Child Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CHILD_RELATIONS = eINSTANCE.getEntity_ChildRelations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Ses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SES = eINSTANCE.getEntity_Ses();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__VARIABLES = eINSTANCE.getEntity_Variables();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY___TO_STRING = eINSTANCE.getEntity__ToString();

		/**
		 * The meta object literal for the '{@link ses.impl.RootEntityImpl <em>Root Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.RootEntityImpl
		 * @see ses.impl.SesPackageImpl#getRootEntity()
		 * @generated
		 */
		EClass ROOT_ENTITY = eINSTANCE.getRootEntity();

		/**
		 * The meta object literal for the '{@link ses.impl.NodeEntityImpl <em>Node Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.NodeEntityImpl
		 * @see ses.impl.SesPackageImpl#getNodeEntity()
		 * @generated
		 */
		EClass NODE_ENTITY = eINSTANCE.getNodeEntity();

		/**
		 * The meta object literal for the '<em><b>Parent Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_ENTITY__PARENT_RELATION = eINSTANCE.getNodeEntity_ParentRelation();

		/**
		 * The meta object literal for the '{@link ses.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.AspectImpl
		 * @see ses.impl.SesPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASPECT___TO_STRING = eINSTANCE.getAspect__ToString();

		/**
		 * The meta object literal for the '{@link ses.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.SpecializationImpl
		 * @see ses.impl.SesPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPECIALIZATION___TO_STRING = eINSTANCE.getSpecialization__ToString();

		/**
		 * The meta object literal for the '{@link ses.impl.MultiaspectImpl <em>Multiaspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.MultiaspectImpl
		 * @see ses.impl.SesPackageImpl#getMultiaspect()
		 * @generated
		 */
		EClass MULTIASPECT = eINSTANCE.getMultiaspect();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIASPECT___TO_STRING = eINSTANCE.getMultiaspect__ToString();

		/**
		 * The meta object literal for the '<em><b>Restrict Multiaspect To One Child</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTIASPECT___RESTRICT_MULTIASPECT_TO_ONE_CHILD__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getMultiaspect__RestrictMultiaspectToOneChild__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ses.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.RelationImpl
		 * @see ses.impl.SesPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Parent Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__PARENT_ENTITY = eINSTANCE.getRelation_ParentEntity();

		/**
		 * The meta object literal for the '<em><b>Child Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__CHILD_ENTITIES = eINSTANCE.getRelation_ChildEntities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Ses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SES = eINSTANCE.getRelation_Ses();

		/**
		 * The meta object literal for the '{@link ses.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.VariableImpl
		 * @see ses.impl.SesPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Ses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SES = eINSTANCE.getVariable_Ses();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__RANGE = eINSTANCE.getVariable_Range();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__ENTITY = eINSTANCE.getVariable_Entity();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DEPENDS_ON = eINSTANCE.getVariable_DependsOn();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___TO_STRING = eINSTANCE.getVariable__ToString();

		/**
		 * The meta object literal for the '{@link ses.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.RangeImpl
		 * @see ses.impl.SesPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__VARIABLE = eINSTANCE.getRange_Variable();

		/**
		 * The meta object literal for the '<em><b>Ses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE__SES = eINSTANCE.getRange_Ses();

		/**
		 * The meta object literal for the '{@link ses.impl.NumberRangeImpl <em>Number Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.NumberRangeImpl
		 * @see ses.impl.SesPackageImpl#getNumberRange()
		 * @generated
		 */
		EClass NUMBER_RANGE = eINSTANCE.getNumberRange();

		/**
		 * The meta object literal for the '<em><b>Left Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__LEFT_CLOSED = eINSTANCE.getNumberRange_LeftClosed();

		/**
		 * The meta object literal for the '<em><b>Right Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__RIGHT_CLOSED = eINSTANCE.getNumberRange_RightClosed();

		/**
		 * The meta object literal for the '{@link ses.impl.StringRangeImpl <em>String Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.StringRangeImpl
		 * @see ses.impl.SesPackageImpl#getStringRange()
		 * @generated
		 */
		EClass STRING_RANGE = eINSTANCE.getStringRange();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_RANGE__RANGE = eINSTANCE.getStringRange_Range();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRING_RANGE___TO_STRING = eINSTANCE.getStringRange__ToString();

		/**
		 * The meta object literal for the '{@link ses.impl.BooleanRangeImpl <em>Boolean Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.BooleanRangeImpl
		 * @see ses.impl.SesPackageImpl#getBooleanRange()
		 * @generated
		 */
		EClass BOOLEAN_RANGE = eINSTANCE.getBooleanRange();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_RANGE___TO_STRING = eINSTANCE.getBooleanRange__ToString();

		/**
		 * The meta object literal for the '{@link ses.impl.IntegerRangeImpl <em>Integer Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.IntegerRangeImpl
		 * @see ses.impl.SesPackageImpl#getIntegerRange()
		 * @generated
		 */
		EClass INTEGER_RANGE = eINSTANCE.getIntegerRange();

		/**
		 * The meta object literal for the '<em><b>Left Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGE__LEFT_BOUND = eINSTANCE.getIntegerRange_LeftBound();

		/**
		 * The meta object literal for the '<em><b>Right Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_RANGE__RIGHT_BOUND = eINSTANCE.getIntegerRange_RightBound();

		/**
		 * The meta object literal for the '{@link ses.impl.SESImpl <em>SES</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.SESImpl
		 * @see ses.impl.SesPackageImpl#getSES()
		 * @generated
		 */
		EClass SES = eINSTANCE.getSES();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SES__VARIABLES = eINSTANCE.getSES_Variables();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SES__ENTITIES = eINSTANCE.getSES_Entities();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SES__RELATIONS = eINSTANCE.getSES_Relations();

		/**
		 * The meta object literal for the '<em><b>Ranges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SES__RANGES = eINSTANCE.getSES_Ranges();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SES___TO_STRING = eINSTANCE.getSES__ToString();

		/**
		 * The meta object literal for the '<em><b>Only One Root Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SES___ONLY_ONE_ROOT_ENTITY__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSES__OnlyOneRootEntity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link ses.impl.FloatingPointRangeImpl <em>Floating Point Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ses.impl.FloatingPointRangeImpl
		 * @see ses.impl.SesPackageImpl#getFloatingPointRange()
		 * @generated
		 */
		EClass FLOATING_POINT_RANGE = eINSTANCE.getFloatingPointRange();

		/**
		 * The meta object literal for the '<em><b>Left Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_POINT_RANGE__LEFT_BOUND = eINSTANCE.getFloatingPointRange_LeftBound();

		/**
		 * The meta object literal for the '<em><b>Right Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_POINT_RANGE__RIGHT_BOUND = eINSTANCE.getFloatingPointRange_RightBound();

	}

} //SesPackage
