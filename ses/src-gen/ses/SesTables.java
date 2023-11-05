/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /ses/model/ses.ecore
 * using:
 *   /ses/model/ses.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package ses;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import ses.SesPackage;
// import ses.SesTables;

/**
 * SesTables provides the dispatch tables for the ses for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SesTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SesPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_ses = IdManager.getNsURIPackageId("http://www.example.org/ses", null, SesPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = SesTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = SesTables.PACKid_http_c_s_s_www_example_org_s_ses.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Multiaspect = SesTables.PACKid_http_c_s_s_www_example_org_s_ses.getClassId("Multiaspect", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NodeEntity = SesTables.PACKid_http_c_s_s_www_example_org_s_ses.getClassId("NodeEntity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Range = SesTables.PACKid_http_c_s_s_www_example_org_s_ses.getClassId("Range", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Relation = SesTables.PACKid_http_c_s_s_www_example_org_s_ses.getClassId("Relation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RootEntity = SesTables.PACKid_http_c_s_s_www_example_org_s_ses.getClassId("RootEntity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SES = SesTables.PACKid_http_c_s_s_www_example_org_s_ses.getClassId("SES", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Variable = SesTables.PACKid_http_c_s_s_www_example_org_s_ses.getClassId("Variable", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = SesTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = SesTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Variable = TypeId.BAG.getSpecializedId(SesTables.CLSSid_Variable, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Entity = TypeId.ORDERED_SET.getSpecializedId(SesTables.CLSSid_Entity, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_NodeEntity = TypeId.ORDERED_SET.getSpecializedId(SesTables.CLSSid_NodeEntity, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Range = TypeId.ORDERED_SET.getSpecializedId(SesTables.CLSSid_Range, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Relation = TypeId.ORDERED_SET.getSpecializedId(SesTables.CLSSid_Relation, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Variable = TypeId.ORDERED_SET.getSpecializedId(SesTables.CLSSid_Variable, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SesTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Aspect = new EcoreExecutorType(SesPackage.Literals.ASPECT, PACKAGE, 0);
		public static final EcoreExecutorType _BooleanRange = new EcoreExecutorType(SesPackage.Literals.BOOLEAN_RANGE, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(SesPackage.Literals.ENTITY, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _FloatingPointRange = new EcoreExecutorType(SesPackage.Literals.FLOATING_POINT_RANGE, PACKAGE, 0);
		public static final EcoreExecutorType _IntegerRange = new EcoreExecutorType(SesPackage.Literals.INTEGER_RANGE, PACKAGE, 0);
		public static final EcoreExecutorType _Multiaspect = new EcoreExecutorType(SesPackage.Literals.MULTIASPECT, PACKAGE, 0);
		public static final EcoreExecutorType _NodeEntity = new EcoreExecutorType(SesPackage.Literals.NODE_ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _NumberRange = new EcoreExecutorType(SesPackage.Literals.NUMBER_RANGE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Range = new EcoreExecutorType(SesPackage.Literals.RANGE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Relation = new EcoreExecutorType(SesPackage.Literals.RELATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _RootEntity = new EcoreExecutorType(SesPackage.Literals.ROOT_ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _SES = new EcoreExecutorType(SesPackage.Literals.SES, PACKAGE, 0);
		public static final EcoreExecutorType _Specialization = new EcoreExecutorType(SesPackage.Literals.SPECIALIZATION, PACKAGE, 0);
		public static final EcoreExecutorType _StringRange = new EcoreExecutorType(SesPackage.Literals.STRING_RANGE, PACKAGE, 0);
		public static final EcoreExecutorType _Variable = new EcoreExecutorType(SesPackage.Literals.VARIABLE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Aspect,
			_BooleanRange,
			_Entity,
			_FloatingPointRange,
			_IntegerRange,
			_Multiaspect,
			_NodeEntity,
			_NumberRange,
			_Range,
			_Relation,
			_RootEntity,
			_SES,
			_Specialization,
			_StringRange,
			_Variable
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Aspect__Aspect = new ExecutorFragment(Types._Aspect, SesTables.Types._Aspect);
		private static final ExecutorFragment _Aspect__OclAny = new ExecutorFragment(Types._Aspect, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Aspect__OclElement = new ExecutorFragment(Types._Aspect, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Aspect__Relation = new ExecutorFragment(Types._Aspect, SesTables.Types._Relation);

		private static final ExecutorFragment _BooleanRange__BooleanRange = new ExecutorFragment(Types._BooleanRange, SesTables.Types._BooleanRange);
		private static final ExecutorFragment _BooleanRange__OclAny = new ExecutorFragment(Types._BooleanRange, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _BooleanRange__OclElement = new ExecutorFragment(Types._BooleanRange, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _BooleanRange__Range = new ExecutorFragment(Types._BooleanRange, SesTables.Types._Range);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, SesTables.Types._Entity);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FloatingPointRange__FloatingPointRange = new ExecutorFragment(Types._FloatingPointRange, SesTables.Types._FloatingPointRange);
		private static final ExecutorFragment _FloatingPointRange__NumberRange = new ExecutorFragment(Types._FloatingPointRange, SesTables.Types._NumberRange);
		private static final ExecutorFragment _FloatingPointRange__OclAny = new ExecutorFragment(Types._FloatingPointRange, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FloatingPointRange__OclElement = new ExecutorFragment(Types._FloatingPointRange, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _FloatingPointRange__Range = new ExecutorFragment(Types._FloatingPointRange, SesTables.Types._Range);

		private static final ExecutorFragment _IntegerRange__IntegerRange = new ExecutorFragment(Types._IntegerRange, SesTables.Types._IntegerRange);
		private static final ExecutorFragment _IntegerRange__NumberRange = new ExecutorFragment(Types._IntegerRange, SesTables.Types._NumberRange);
		private static final ExecutorFragment _IntegerRange__OclAny = new ExecutorFragment(Types._IntegerRange, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _IntegerRange__OclElement = new ExecutorFragment(Types._IntegerRange, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _IntegerRange__Range = new ExecutorFragment(Types._IntegerRange, SesTables.Types._Range);

		private static final ExecutorFragment _Multiaspect__Multiaspect = new ExecutorFragment(Types._Multiaspect, SesTables.Types._Multiaspect);
		private static final ExecutorFragment _Multiaspect__OclAny = new ExecutorFragment(Types._Multiaspect, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Multiaspect__OclElement = new ExecutorFragment(Types._Multiaspect, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Multiaspect__Relation = new ExecutorFragment(Types._Multiaspect, SesTables.Types._Relation);

		private static final ExecutorFragment _NodeEntity__Entity = new ExecutorFragment(Types._NodeEntity, SesTables.Types._Entity);
		private static final ExecutorFragment _NodeEntity__NodeEntity = new ExecutorFragment(Types._NodeEntity, SesTables.Types._NodeEntity);
		private static final ExecutorFragment _NodeEntity__OclAny = new ExecutorFragment(Types._NodeEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NodeEntity__OclElement = new ExecutorFragment(Types._NodeEntity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NumberRange__NumberRange = new ExecutorFragment(Types._NumberRange, SesTables.Types._NumberRange);
		private static final ExecutorFragment _NumberRange__OclAny = new ExecutorFragment(Types._NumberRange, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NumberRange__OclElement = new ExecutorFragment(Types._NumberRange, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _NumberRange__Range = new ExecutorFragment(Types._NumberRange, SesTables.Types._Range);

		private static final ExecutorFragment _Range__OclAny = new ExecutorFragment(Types._Range, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Range__OclElement = new ExecutorFragment(Types._Range, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Range__Range = new ExecutorFragment(Types._Range, SesTables.Types._Range);

		private static final ExecutorFragment _Relation__OclAny = new ExecutorFragment(Types._Relation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Relation__OclElement = new ExecutorFragment(Types._Relation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Relation__Relation = new ExecutorFragment(Types._Relation, SesTables.Types._Relation);

		private static final ExecutorFragment _RootEntity__Entity = new ExecutorFragment(Types._RootEntity, SesTables.Types._Entity);
		private static final ExecutorFragment _RootEntity__OclAny = new ExecutorFragment(Types._RootEntity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RootEntity__OclElement = new ExecutorFragment(Types._RootEntity, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RootEntity__RootEntity = new ExecutorFragment(Types._RootEntity, SesTables.Types._RootEntity);

		private static final ExecutorFragment _SES__OclAny = new ExecutorFragment(Types._SES, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SES__OclElement = new ExecutorFragment(Types._SES, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SES__SES = new ExecutorFragment(Types._SES, SesTables.Types._SES);

		private static final ExecutorFragment _Specialization__OclAny = new ExecutorFragment(Types._Specialization, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Specialization__OclElement = new ExecutorFragment(Types._Specialization, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Specialization__Relation = new ExecutorFragment(Types._Specialization, SesTables.Types._Relation);
		private static final ExecutorFragment _Specialization__Specialization = new ExecutorFragment(Types._Specialization, SesTables.Types._Specialization);

		private static final ExecutorFragment _StringRange__OclAny = new ExecutorFragment(Types._StringRange, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _StringRange__OclElement = new ExecutorFragment(Types._StringRange, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _StringRange__Range = new ExecutorFragment(Types._StringRange, SesTables.Types._Range);
		private static final ExecutorFragment _StringRange__StringRange = new ExecutorFragment(Types._StringRange, SesTables.Types._StringRange);

		private static final ExecutorFragment _Variable__OclAny = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Variable__OclElement = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Variable__Variable = new ExecutorFragment(Types._Variable, SesTables.Types._Variable);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Aspect__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Aspect,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _BooleanRange__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._BooleanRange,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Entity__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Entity,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Multiaspect__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Multiaspect,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _SES__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._SES,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Specialization__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Specialization,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _StringRange__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._StringRange,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Variable__toString = new ExecutorOperation("toString", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Variable,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final ExecutorProperty _Entity__childRelations = new EcoreExecutorProperty(SesPackage.Literals.ENTITY__CHILD_RELATIONS, Types._Entity, 0);
		public static final ExecutorProperty _Entity__name = new EcoreExecutorProperty(SesPackage.Literals.ENTITY__NAME, Types._Entity, 1);
		public static final ExecutorProperty _Entity__ses = new EcoreExecutorProperty(SesPackage.Literals.ENTITY__SES, Types._Entity, 2);
		public static final ExecutorProperty _Entity__variables = new EcoreExecutorProperty(SesPackage.Literals.ENTITY__VARIABLES, Types._Entity, 3);

		public static final ExecutorProperty _FloatingPointRange__leftBound = new EcoreExecutorProperty(SesPackage.Literals.FLOATING_POINT_RANGE__LEFT_BOUND, Types._FloatingPointRange, 0);
		public static final ExecutorProperty _FloatingPointRange__rightBound = new EcoreExecutorProperty(SesPackage.Literals.FLOATING_POINT_RANGE__RIGHT_BOUND, Types._FloatingPointRange, 1);

		public static final ExecutorProperty _IntegerRange__leftBound = new EcoreExecutorProperty(SesPackage.Literals.INTEGER_RANGE__LEFT_BOUND, Types._IntegerRange, 0);
		public static final ExecutorProperty _IntegerRange__rightBound = new EcoreExecutorProperty(SesPackage.Literals.INTEGER_RANGE__RIGHT_BOUND, Types._IntegerRange, 1);

		public static final ExecutorProperty _NodeEntity__parentRelation = new EcoreExecutorProperty(SesPackage.Literals.NODE_ENTITY__PARENT_RELATION, Types._NodeEntity, 0);

		public static final ExecutorProperty _NumberRange__leftClosed = new EcoreExecutorProperty(SesPackage.Literals.NUMBER_RANGE__LEFT_CLOSED, Types._NumberRange, 0);
		public static final ExecutorProperty _NumberRange__rightClosed = new EcoreExecutorProperty(SesPackage.Literals.NUMBER_RANGE__RIGHT_CLOSED, Types._NumberRange, 1);

		public static final ExecutorProperty _Range__ses = new EcoreExecutorProperty(SesPackage.Literals.RANGE__SES, Types._Range, 0);
		public static final ExecutorProperty _Range__variable = new EcoreExecutorProperty(SesPackage.Literals.RANGE__VARIABLE, Types._Range, 1);

		public static final ExecutorProperty _Relation__childEntities = new EcoreExecutorProperty(SesPackage.Literals.RELATION__CHILD_ENTITIES, Types._Relation, 0);
		public static final ExecutorProperty _Relation__name = new EcoreExecutorProperty(SesPackage.Literals.RELATION__NAME, Types._Relation, 1);
		public static final ExecutorProperty _Relation__parentEntity = new EcoreExecutorProperty(SesPackage.Literals.RELATION__PARENT_ENTITY, Types._Relation, 2);
		public static final ExecutorProperty _Relation__ses = new EcoreExecutorProperty(SesPackage.Literals.RELATION__SES, Types._Relation, 3);

		public static final ExecutorProperty _SES__entities = new EcoreExecutorProperty(SesPackage.Literals.SES__ENTITIES, Types._SES, 0);
		public static final ExecutorProperty _SES__ranges = new EcoreExecutorProperty(SesPackage.Literals.SES__RANGES, Types._SES, 1);
		public static final ExecutorProperty _SES__relations = new EcoreExecutorProperty(SesPackage.Literals.SES__RELATIONS, Types._SES, 2);
		public static final ExecutorProperty _SES__variables = new EcoreExecutorProperty(SesPackage.Literals.SES__VARIABLES, Types._SES, 3);

		public static final ExecutorProperty _StringRange__range = new EcoreExecutorProperty(SesPackage.Literals.STRING_RANGE__RANGE, Types._StringRange, 0);

		public static final ExecutorProperty _Variable__dependsOn = new EcoreExecutorProperty(SesPackage.Literals.VARIABLE__DEPENDS_ON, Types._Variable, 0);
		public static final ExecutorProperty _Variable__entity = new EcoreExecutorProperty(SesPackage.Literals.VARIABLE__ENTITY, Types._Variable, 1);
		public static final ExecutorProperty _Variable__name = new EcoreExecutorProperty(SesPackage.Literals.VARIABLE__NAME, Types._Variable, 2);
		public static final ExecutorProperty _Variable__range = new EcoreExecutorProperty(SesPackage.Literals.VARIABLE__RANGE, Types._Variable, 3);
		public static final ExecutorProperty _Variable__ses = new EcoreExecutorProperty(SesPackage.Literals.VARIABLE__SES, Types._Variable, 4);
		public static final ExecutorProperty _Variable__Variable__dependsOn = new ExecutorPropertyWithImplementation("Variable", Types._Variable, 5, new EcoreLibraryOppositeProperty(SesPackage.Literals.VARIABLE__DEPENDS_ON));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Aspect =
			{
				Fragments._Aspect__OclAny /* 0 */,
				Fragments._Aspect__OclElement /* 1 */,
				Fragments._Aspect__Relation /* 2 */,
				Fragments._Aspect__Aspect /* 3 */
			};
		private static final int /*@NonNull*/ [] __Aspect = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _BooleanRange =
			{
				Fragments._BooleanRange__OclAny /* 0 */,
				Fragments._BooleanRange__OclElement /* 1 */,
				Fragments._BooleanRange__Range /* 2 */,
				Fragments._BooleanRange__BooleanRange /* 3 */
			};
		private static final int /*@NonNull*/ [] __BooleanRange = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__Entity /* 2 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FloatingPointRange =
			{
				Fragments._FloatingPointRange__OclAny /* 0 */,
				Fragments._FloatingPointRange__OclElement /* 1 */,
				Fragments._FloatingPointRange__Range /* 2 */,
				Fragments._FloatingPointRange__NumberRange /* 3 */,
				Fragments._FloatingPointRange__FloatingPointRange /* 4 */
			};
		private static final int /*@NonNull*/ [] __FloatingPointRange = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _IntegerRange =
			{
				Fragments._IntegerRange__OclAny /* 0 */,
				Fragments._IntegerRange__OclElement /* 1 */,
				Fragments._IntegerRange__Range /* 2 */,
				Fragments._IntegerRange__NumberRange /* 3 */,
				Fragments._IntegerRange__IntegerRange /* 4 */
			};
		private static final int /*@NonNull*/ [] __IntegerRange = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Multiaspect =
			{
				Fragments._Multiaspect__OclAny /* 0 */,
				Fragments._Multiaspect__OclElement /* 1 */,
				Fragments._Multiaspect__Relation /* 2 */,
				Fragments._Multiaspect__Multiaspect /* 3 */
			};
		private static final int /*@NonNull*/ [] __Multiaspect = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NodeEntity =
			{
				Fragments._NodeEntity__OclAny /* 0 */,
				Fragments._NodeEntity__OclElement /* 1 */,
				Fragments._NodeEntity__Entity /* 2 */,
				Fragments._NodeEntity__NodeEntity /* 3 */
			};
		private static final int /*@NonNull*/ [] __NodeEntity = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NumberRange =
			{
				Fragments._NumberRange__OclAny /* 0 */,
				Fragments._NumberRange__OclElement /* 1 */,
				Fragments._NumberRange__Range /* 2 */,
				Fragments._NumberRange__NumberRange /* 3 */
			};
		private static final int /*@NonNull*/ [] __NumberRange = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Range =
			{
				Fragments._Range__OclAny /* 0 */,
				Fragments._Range__OclElement /* 1 */,
				Fragments._Range__Range /* 2 */
			};
		private static final int /*@NonNull*/ [] __Range = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Relation =
			{
				Fragments._Relation__OclAny /* 0 */,
				Fragments._Relation__OclElement /* 1 */,
				Fragments._Relation__Relation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Relation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RootEntity =
			{
				Fragments._RootEntity__OclAny /* 0 */,
				Fragments._RootEntity__OclElement /* 1 */,
				Fragments._RootEntity__Entity /* 2 */,
				Fragments._RootEntity__RootEntity /* 3 */
			};
		private static final int /*@NonNull*/ [] __RootEntity = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SES =
			{
				Fragments._SES__OclAny /* 0 */,
				Fragments._SES__OclElement /* 1 */,
				Fragments._SES__SES /* 2 */
			};
		private static final int /*@NonNull*/ [] __SES = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Specialization =
			{
				Fragments._Specialization__OclAny /* 0 */,
				Fragments._Specialization__OclElement /* 1 */,
				Fragments._Specialization__Relation /* 2 */,
				Fragments._Specialization__Specialization /* 3 */
			};
		private static final int /*@NonNull*/ [] __Specialization = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _StringRange =
			{
				Fragments._StringRange__OclAny /* 0 */,
				Fragments._StringRange__OclElement /* 1 */,
				Fragments._StringRange__Range /* 2 */,
				Fragments._StringRange__StringRange /* 3 */
			};
		private static final int /*@NonNull*/ [] __StringRange = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Variable =
			{
				Fragments._Variable__OclAny /* 0 */,
				Fragments._Variable__OclElement /* 1 */,
				Fragments._Variable__Variable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Variable = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Aspect.initFragments(_Aspect, __Aspect);
			Types._BooleanRange.initFragments(_BooleanRange, __BooleanRange);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._FloatingPointRange.initFragments(_FloatingPointRange, __FloatingPointRange);
			Types._IntegerRange.initFragments(_IntegerRange, __IntegerRange);
			Types._Multiaspect.initFragments(_Multiaspect, __Multiaspect);
			Types._NodeEntity.initFragments(_NodeEntity, __NodeEntity);
			Types._NumberRange.initFragments(_NumberRange, __NumberRange);
			Types._Range.initFragments(_Range, __Range);
			Types._Relation.initFragments(_Relation, __Relation);
			Types._RootEntity.initFragments(_RootEntity, __RootEntity);
			Types._SES.initFragments(_SES, __SES);
			Types._Specialization.initFragments(_Specialization, __Specialization);
			Types._StringRange.initFragments(_StringRange, __StringRange);
			Types._Variable.initFragments(_Variable, __Variable);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Aspect__Aspect = {
			SesTables.Operations._Aspect__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Aspect__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._Aspect__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Aspect__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Aspect__Relation = {};

		private static final ExecutorOperation /*@NonNull*/ [] _BooleanRange__BooleanRange = {
			SesTables.Operations._BooleanRange__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanRange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._BooleanRange__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanRange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _BooleanRange__Range = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {
			SesTables.Operations._Entity__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._Entity__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FloatingPointRange__FloatingPointRange = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatingPointRange__NumberRange = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatingPointRange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatingPointRange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FloatingPointRange__Range = {};

		private static final ExecutorOperation /*@NonNull*/ [] _IntegerRange__IntegerRange = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerRange__NumberRange = {};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerRange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerRange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _IntegerRange__Range = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Multiaspect__Multiaspect = {
			SesTables.Operations._Multiaspect__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Multiaspect__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._Multiaspect__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Multiaspect__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Multiaspect__Relation = {};

		private static final ExecutorOperation /*@NonNull*/ [] _NodeEntity__NodeEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeEntity__Entity = {
			SesTables.Operations._Entity__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeEntity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._Entity__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NodeEntity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NumberRange__NumberRange = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NumberRange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NumberRange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NumberRange__Range = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Range__Range = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Range__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Range__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Relation__Relation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Relation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Relation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RootEntity__RootEntity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RootEntity__Entity = {
			SesTables.Operations._Entity__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RootEntity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._Entity__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RootEntity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SES__SES = {
			SesTables.Operations._SES__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SES__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._SES__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SES__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Specialization__Specialization = {
			SesTables.Operations._Specialization__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Specialization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._Specialization__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Specialization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Specialization__Relation = {};

		private static final ExecutorOperation /*@NonNull*/ [] _StringRange__StringRange = {
			SesTables.Operations._StringRange__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringRange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._StringRange__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringRange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _StringRange__Range = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Variable__Variable = {
			SesTables.Operations._Variable__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			SesTables.Operations._Variable__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Aspect__Aspect.initOperations(_Aspect__Aspect);
			Fragments._Aspect__OclAny.initOperations(_Aspect__OclAny);
			Fragments._Aspect__OclElement.initOperations(_Aspect__OclElement);
			Fragments._Aspect__Relation.initOperations(_Aspect__Relation);

			Fragments._BooleanRange__BooleanRange.initOperations(_BooleanRange__BooleanRange);
			Fragments._BooleanRange__OclAny.initOperations(_BooleanRange__OclAny);
			Fragments._BooleanRange__OclElement.initOperations(_BooleanRange__OclElement);
			Fragments._BooleanRange__Range.initOperations(_BooleanRange__Range);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._FloatingPointRange__FloatingPointRange.initOperations(_FloatingPointRange__FloatingPointRange);
			Fragments._FloatingPointRange__NumberRange.initOperations(_FloatingPointRange__NumberRange);
			Fragments._FloatingPointRange__OclAny.initOperations(_FloatingPointRange__OclAny);
			Fragments._FloatingPointRange__OclElement.initOperations(_FloatingPointRange__OclElement);
			Fragments._FloatingPointRange__Range.initOperations(_FloatingPointRange__Range);

			Fragments._IntegerRange__IntegerRange.initOperations(_IntegerRange__IntegerRange);
			Fragments._IntegerRange__NumberRange.initOperations(_IntegerRange__NumberRange);
			Fragments._IntegerRange__OclAny.initOperations(_IntegerRange__OclAny);
			Fragments._IntegerRange__OclElement.initOperations(_IntegerRange__OclElement);
			Fragments._IntegerRange__Range.initOperations(_IntegerRange__Range);

			Fragments._Multiaspect__Multiaspect.initOperations(_Multiaspect__Multiaspect);
			Fragments._Multiaspect__OclAny.initOperations(_Multiaspect__OclAny);
			Fragments._Multiaspect__OclElement.initOperations(_Multiaspect__OclElement);
			Fragments._Multiaspect__Relation.initOperations(_Multiaspect__Relation);

			Fragments._NodeEntity__Entity.initOperations(_NodeEntity__Entity);
			Fragments._NodeEntity__NodeEntity.initOperations(_NodeEntity__NodeEntity);
			Fragments._NodeEntity__OclAny.initOperations(_NodeEntity__OclAny);
			Fragments._NodeEntity__OclElement.initOperations(_NodeEntity__OclElement);

			Fragments._NumberRange__NumberRange.initOperations(_NumberRange__NumberRange);
			Fragments._NumberRange__OclAny.initOperations(_NumberRange__OclAny);
			Fragments._NumberRange__OclElement.initOperations(_NumberRange__OclElement);
			Fragments._NumberRange__Range.initOperations(_NumberRange__Range);

			Fragments._Range__OclAny.initOperations(_Range__OclAny);
			Fragments._Range__OclElement.initOperations(_Range__OclElement);
			Fragments._Range__Range.initOperations(_Range__Range);

			Fragments._Relation__OclAny.initOperations(_Relation__OclAny);
			Fragments._Relation__OclElement.initOperations(_Relation__OclElement);
			Fragments._Relation__Relation.initOperations(_Relation__Relation);

			Fragments._RootEntity__Entity.initOperations(_RootEntity__Entity);
			Fragments._RootEntity__OclAny.initOperations(_RootEntity__OclAny);
			Fragments._RootEntity__OclElement.initOperations(_RootEntity__OclElement);
			Fragments._RootEntity__RootEntity.initOperations(_RootEntity__RootEntity);

			Fragments._SES__OclAny.initOperations(_SES__OclAny);
			Fragments._SES__OclElement.initOperations(_SES__OclElement);
			Fragments._SES__SES.initOperations(_SES__SES);

			Fragments._Specialization__OclAny.initOperations(_Specialization__OclAny);
			Fragments._Specialization__OclElement.initOperations(_Specialization__OclElement);
			Fragments._Specialization__Relation.initOperations(_Specialization__Relation);
			Fragments._Specialization__Specialization.initOperations(_Specialization__Specialization);

			Fragments._StringRange__OclAny.initOperations(_StringRange__OclAny);
			Fragments._StringRange__OclElement.initOperations(_StringRange__OclElement);
			Fragments._StringRange__Range.initOperations(_StringRange__Range);
			Fragments._StringRange__StringRange.initOperations(_StringRange__StringRange);

			Fragments._Variable__OclAny.initOperations(_Variable__OclAny);
			Fragments._Variable__OclElement.initOperations(_Variable__OclElement);
			Fragments._Variable__Variable.initOperations(_Variable__Variable);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Aspect = {
			SesTables.Properties._Relation__childEntities,
			SesTables.Properties._Relation__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Relation__parentEntity,
			SesTables.Properties._Relation__ses
		};

		private static final ExecutorProperty /*@NonNull*/ [] _BooleanRange = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Range__ses,
			SesTables.Properties._Range__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			SesTables.Properties._Entity__childRelations,
			SesTables.Properties._Entity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Entity__ses,
			SesTables.Properties._Entity__variables
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FloatingPointRange = {
			SesTables.Properties._FloatingPointRange__leftBound,
			SesTables.Properties._NumberRange__leftClosed,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._FloatingPointRange__rightBound,
			SesTables.Properties._NumberRange__rightClosed,
			SesTables.Properties._Range__ses,
			SesTables.Properties._Range__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _IntegerRange = {
			SesTables.Properties._IntegerRange__leftBound,
			SesTables.Properties._NumberRange__leftClosed,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._IntegerRange__rightBound,
			SesTables.Properties._NumberRange__rightClosed,
			SesTables.Properties._Range__ses,
			SesTables.Properties._Range__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Multiaspect = {
			SesTables.Properties._Relation__childEntities,
			SesTables.Properties._Relation__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Relation__parentEntity,
			SesTables.Properties._Relation__ses
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NodeEntity = {
			SesTables.Properties._Entity__childRelations,
			SesTables.Properties._Entity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._NodeEntity__parentRelation,
			SesTables.Properties._Entity__ses,
			SesTables.Properties._Entity__variables
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NumberRange = {
			SesTables.Properties._NumberRange__leftClosed,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._NumberRange__rightClosed,
			SesTables.Properties._Range__ses,
			SesTables.Properties._Range__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Range = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Range__ses,
			SesTables.Properties._Range__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Relation = {
			SesTables.Properties._Relation__childEntities,
			SesTables.Properties._Relation__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Relation__parentEntity,
			SesTables.Properties._Relation__ses
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RootEntity = {
			SesTables.Properties._Entity__childRelations,
			SesTables.Properties._Entity__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Entity__ses,
			SesTables.Properties._Entity__variables
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SES = {
			SesTables.Properties._SES__entities,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._SES__ranges,
			SesTables.Properties._SES__relations,
			SesTables.Properties._SES__variables
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Specialization = {
			SesTables.Properties._Relation__childEntities,
			SesTables.Properties._Relation__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Relation__parentEntity,
			SesTables.Properties._Relation__ses
		};

		private static final ExecutorProperty /*@NonNull*/ [] _StringRange = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._StringRange__range,
			SesTables.Properties._Range__ses,
			SesTables.Properties._Range__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Variable = {
			SesTables.Properties._Variable__dependsOn,
			SesTables.Properties._Variable__entity,
			SesTables.Properties._Variable__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SesTables.Properties._Variable__range,
			SesTables.Properties._Variable__ses
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Aspect__Aspect.initProperties(_Aspect);
			Fragments._BooleanRange__BooleanRange.initProperties(_BooleanRange);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._FloatingPointRange__FloatingPointRange.initProperties(_FloatingPointRange);
			Fragments._IntegerRange__IntegerRange.initProperties(_IntegerRange);
			Fragments._Multiaspect__Multiaspect.initProperties(_Multiaspect);
			Fragments._NodeEntity__NodeEntity.initProperties(_NodeEntity);
			Fragments._NumberRange__NumberRange.initProperties(_NumberRange);
			Fragments._Range__Range.initProperties(_Range);
			Fragments._Relation__Relation.initProperties(_Relation);
			Fragments._RootEntity__RootEntity.initProperties(_RootEntity);
			Fragments._SES__SES.initProperties(_SES);
			Fragments._Specialization__Specialization.initProperties(_Specialization);
			Fragments._StringRange__StringRange.initProperties(_StringRange);
			Fragments._Variable__Variable.initProperties(_Variable);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SesTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new SesTables();
	}

	private SesTables() {
		super(SesPackage.eNS_URI);
	}
}
