// Generated from SESGrammar.g4 by ANTLR 4.13.1
package ses.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SESGrammarParser}.
 */
public interface SESGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#ses}.
	 * @param ctx the parse tree
	 */
	void enterSes(SESGrammarParser.SesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#ses}.
	 * @param ctx the parse tree
	 */
	void exitSes(SESGrammarParser.SesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SESGrammarParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SESGrammarParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#aspect}.
	 * @param ctx the parse tree
	 */
	void enterAspect(SESGrammarParser.AspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#aspect}.
	 * @param ctx the parse tree
	 */
	void exitAspect(SESGrammarParser.AspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#specialization}.
	 * @param ctx the parse tree
	 */
	void enterSpecialization(SESGrammarParser.SpecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#specialization}.
	 * @param ctx the parse tree
	 */
	void exitSpecialization(SESGrammarParser.SpecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#multiaspect}.
	 * @param ctx the parse tree
	 */
	void enterMultiaspect(SESGrammarParser.MultiaspectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#multiaspect}.
	 * @param ctx the parse tree
	 */
	void exitMultiaspect(SESGrammarParser.MultiaspectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SESGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SESGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(SESGrammarParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(SESGrammarParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#aspectReutil}.
	 * @param ctx the parse tree
	 */
	void enterAspectReutil(SESGrammarParser.AspectReutilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#aspectReutil}.
	 * @param ctx the parse tree
	 */
	void exitAspectReutil(SESGrammarParser.AspectReutilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#specReutil}.
	 * @param ctx the parse tree
	 */
	void enterSpecReutil(SESGrammarParser.SpecReutilContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#specReutil}.
	 * @param ctx the parse tree
	 */
	void exitSpecReutil(SESGrammarParser.SpecReutilContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#variableDependance}.
	 * @param ctx the parse tree
	 */
	void enterVariableDependance(SESGrammarParser.VariableDependanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#variableDependance}.
	 * @param ctx the parse tree
	 */
	void exitVariableDependance(SESGrammarParser.VariableDependanceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAnd}
	 * labeled alternative in {@link SESGrammarParser#identifierListAnd}.
	 * @param ctx the parse tree
	 */
	void enterIdAnd(SESGrammarParser.IdAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAnd}
	 * labeled alternative in {@link SESGrammarParser#identifierListAnd}.
	 * @param ctx the parse tree
	 */
	void exitIdAnd(SESGrammarParser.IdAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAndList}
	 * labeled alternative in {@link SESGrammarParser#identifierListAnd}.
	 * @param ctx the parse tree
	 */
	void enterIdAndList(SESGrammarParser.IdAndListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAndList}
	 * labeled alternative in {@link SESGrammarParser#identifierListAnd}.
	 * @param ctx the parse tree
	 */
	void exitIdAndList(SESGrammarParser.IdAndListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idOr}
	 * labeled alternative in {@link SESGrammarParser#identifierListOr}.
	 * @param ctx the parse tree
	 */
	void enterIdOr(SESGrammarParser.IdOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idOr}
	 * labeled alternative in {@link SESGrammarParser#identifierListOr}.
	 * @param ctx the parse tree
	 */
	void exitIdOr(SESGrammarParser.IdOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idOrList}
	 * labeled alternative in {@link SESGrammarParser#identifierListOr}.
	 * @param ctx the parse tree
	 */
	void enterIdOrList(SESGrammarParser.IdOrListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idOrList}
	 * labeled alternative in {@link SESGrammarParser#identifierListOr}.
	 * @param ctx the parse tree
	 */
	void exitIdOrList(SESGrammarParser.IdOrListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idListBaseCase}
	 * labeled alternative in {@link SESGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdListBaseCase(SESGrammarParser.IdListBaseCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idListBaseCase}
	 * labeled alternative in {@link SESGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdListBaseCase(SESGrammarParser.IdListBaseCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idListRecursion}
	 * labeled alternative in {@link SESGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdListRecursion(SESGrammarParser.IdListRecursionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idListRecursion}
	 * labeled alternative in {@link SESGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdListRecursion(SESGrammarParser.IdListRecursionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeTypeString}
	 * labeled alternative in {@link SESGrammarParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void enterRangeTypeString(SESGrammarParser.RangeTypeStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeTypeString}
	 * labeled alternative in {@link SESGrammarParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void exitRangeTypeString(SESGrammarParser.RangeTypeStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeTypeFloat}
	 * labeled alternative in {@link SESGrammarParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void enterRangeTypeFloat(SESGrammarParser.RangeTypeFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeTypeFloat}
	 * labeled alternative in {@link SESGrammarParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void exitRangeTypeFloat(SESGrammarParser.RangeTypeFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeTypeInteger}
	 * labeled alternative in {@link SESGrammarParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void enterRangeTypeInteger(SESGrammarParser.RangeTypeIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeTypeInteger}
	 * labeled alternative in {@link SESGrammarParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void exitRangeTypeInteger(SESGrammarParser.RangeTypeIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeTypeBoolean}
	 * labeled alternative in {@link SESGrammarParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void enterRangeTypeBoolean(SESGrammarParser.RangeTypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeTypeBoolean}
	 * labeled alternative in {@link SESGrammarParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void exitRangeTypeBoolean(SESGrammarParser.RangeTypeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeOfStringUnspecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfString}.
	 * @param ctx the parse tree
	 */
	void enterRangeOfStringUnspecified(SESGrammarParser.RangeOfStringUnspecifiedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeOfStringUnspecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfString}.
	 * @param ctx the parse tree
	 */
	void exitRangeOfStringUnspecified(SESGrammarParser.RangeOfStringUnspecifiedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeOfStringSpecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfString}.
	 * @param ctx the parse tree
	 */
	void enterRangeOfStringSpecified(SESGrammarParser.RangeOfStringSpecifiedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeOfStringSpecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfString}.
	 * @param ctx the parse tree
	 */
	void exitRangeOfStringSpecified(SESGrammarParser.RangeOfStringSpecifiedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeOfFloatUnspecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfFloat}.
	 * @param ctx the parse tree
	 */
	void enterRangeOfFloatUnspecified(SESGrammarParser.RangeOfFloatUnspecifiedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeOfFloatUnspecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfFloat}.
	 * @param ctx the parse tree
	 */
	void exitRangeOfFloatUnspecified(SESGrammarParser.RangeOfFloatUnspecifiedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeOfFloatSpecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfFloat}.
	 * @param ctx the parse tree
	 */
	void enterRangeOfFloatSpecified(SESGrammarParser.RangeOfFloatSpecifiedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeOfFloatSpecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfFloat}.
	 * @param ctx the parse tree
	 */
	void exitRangeOfFloatSpecified(SESGrammarParser.RangeOfFloatSpecifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#floatInterval}.
	 * @param ctx the parse tree
	 */
	void enterFloatInterval(SESGrammarParser.FloatIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#floatInterval}.
	 * @param ctx the parse tree
	 */
	void exitFloatInterval(SESGrammarParser.FloatIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#floatingPoint}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPoint(SESGrammarParser.FloatingPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#floatingPoint}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPoint(SESGrammarParser.FloatingPointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeOfIntegerUnspecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfInteger}.
	 * @param ctx the parse tree
	 */
	void enterRangeOfIntegerUnspecified(SESGrammarParser.RangeOfIntegerUnspecifiedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeOfIntegerUnspecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfInteger}.
	 * @param ctx the parse tree
	 */
	void exitRangeOfIntegerUnspecified(SESGrammarParser.RangeOfIntegerUnspecifiedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeOfIntegerSpecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfInteger}.
	 * @param ctx the parse tree
	 */
	void enterRangeOfIntegerSpecified(SESGrammarParser.RangeOfIntegerSpecifiedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeOfIntegerSpecified}
	 * labeled alternative in {@link SESGrammarParser#rangeOfInteger}.
	 * @param ctx the parse tree
	 */
	void exitRangeOfIntegerSpecified(SESGrammarParser.RangeOfIntegerSpecifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#intInterval}.
	 * @param ctx the parse tree
	 */
	void enterIntInterval(SESGrammarParser.IntIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#intInterval}.
	 * @param ctx the parse tree
	 */
	void exitIntInterval(SESGrammarParser.IntIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oneExistingVar}
	 * labeled alternative in {@link SESGrammarParser#existingVarListAnd}.
	 * @param ctx the parse tree
	 */
	void enterOneExistingVar(SESGrammarParser.OneExistingVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oneExistingVar}
	 * labeled alternative in {@link SESGrammarParser#existingVarListAnd}.
	 * @param ctx the parse tree
	 */
	void exitOneExistingVar(SESGrammarParser.OneExistingVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manyExistingVar}
	 * labeled alternative in {@link SESGrammarParser#existingVarListAnd}.
	 * @param ctx the parse tree
	 */
	void enterManyExistingVar(SESGrammarParser.ManyExistingVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manyExistingVar}
	 * labeled alternative in {@link SESGrammarParser#existingVarListAnd}.
	 * @param ctx the parse tree
	 */
	void exitManyExistingVar(SESGrammarParser.ManyExistingVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existingVarListRecursion}
	 * labeled alternative in {@link SESGrammarParser#existingVarList}.
	 * @param ctx the parse tree
	 */
	void enterExistingVarListRecursion(SESGrammarParser.ExistingVarListRecursionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existingVarListRecursion}
	 * labeled alternative in {@link SESGrammarParser#existingVarList}.
	 * @param ctx the parse tree
	 */
	void exitExistingVarListRecursion(SESGrammarParser.ExistingVarListRecursionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existingVarListBaseCase}
	 * labeled alternative in {@link SESGrammarParser#existingVarList}.
	 * @param ctx the parse tree
	 */
	void enterExistingVarListBaseCase(SESGrammarParser.ExistingVarListBaseCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existingVarListBaseCase}
	 * labeled alternative in {@link SESGrammarParser#existingVarList}.
	 * @param ctx the parse tree
	 */
	void exitExistingVarListBaseCase(SESGrammarParser.ExistingVarListBaseCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#existingVar}.
	 * @param ctx the parse tree
	 */
	void enterExistingVar(SESGrammarParser.ExistingVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#existingVar}.
	 * @param ctx the parse tree
	 */
	void exitExistingVar(SESGrammarParser.ExistingVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SESGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SESGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SESGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SESGrammarParser.IdentifierContext ctx);
}