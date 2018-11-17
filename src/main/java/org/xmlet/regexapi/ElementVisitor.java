package org.xmlet.regexapi;

public abstract class ElementVisitor {
   public abstract void visitElement(Element var1);

   public abstract void visitAttribute(String var1, String var2);

   public abstract void visitParent(Element var1);

   public abstract <R> void visitText(Text<? extends Element, R> var1);

   public abstract <R> void visitComment(Text<? extends Element, R> var1);

   public void visitOpenDynamic() {
   }

   public void visitCloseDynamic() {
   }

   public <Z extends Element> void visitParentOr(Or<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentOtherChar(OtherChar<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfMatchSubExpression(IfMatchSubExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnyWhiteSpace(AnyWhiteSpace<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNumberSubstitution(NumberSubstitution<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentControlChar(ControlChar<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCondNameFirst(CondNameFirst<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCharacterNotGroup(CharacterNotGroup<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRegexComment(RegexComment<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentConditionalNamedExpressionComplete(ConditionalNamedExpressionComplete<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinMatchOneOrMore(MinMatchOneOrMore<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentVerticalTab(VerticalTab<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMatchPreviousBetweenN(MatchPreviousBetweenN<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNamedSubExpressionComplete(NamedSubExpressionComplete<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNamedBackReference(NamedBackReference<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCondExpressionSecond(CondExpressionSecond<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAtBeginning(AtBeginning<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentElseExpression(ElseExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMatchPreviousBetween(MatchPreviousBetween<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBell(Bell<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBackspace(Backspace<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnyNonDigit(AnyNonDigit<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAtEnd(AtEnd<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnyDigit(AnyDigit<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRegexSubstitutionExpression(RegexSubstitutionExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinMatchPreviousAtLeast(MinMatchPreviousAtLeast<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentUnicodeBlock(UnicodeBlock<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCaseInsensitive(CaseInsensitive<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnyLetterOrDigit(AnyLetterOrDigit<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentM(M<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNonCapturingGroup(NonCapturingGroup<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentN(N<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNonBackTracking(NonBackTracking<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentOneOrMore(OneOrMore<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentHexadecimal(Hexadecimal<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCarriageReturn(CarriageReturn<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfMatchIfMatchSubExpression(IfMatchIfMatchSubExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNameFirst(NameFirst<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinMatchPreviousNTimes(MinMatchPreviousNTimes<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentPositiveLookBehind(PositiveLookBehind<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinMatchPreviousBetweenN(MinMatchPreviousBetweenN<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentFromFirstUntilLast(FromFirstUntilLast<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMatchPreviousNTimes(MatchPreviousNTimes<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMatchPreviousBetweenComplete(MatchPreviousBetweenComplete<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfMatchThenExpression(IfMatchThenExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIgnoreUnescapedWhiteSpaces(IgnoreUnescapedWhiteSpaces<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnyNonWhiteSpace(AnyNonWhiteSpace<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentTab(Tab<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAtStringEnd(AtStringEnd<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentExpression(Expression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentActivateOption(ActivateOption<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNamedSubExpression(NamedSubExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfMatchComplete(IfMatchComplete<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinM(MinM<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentGroupName(GroupName<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentConsecutiveMatch(ConsecutiveMatch<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfGroupMatchGroupName(IfGroupMatchGroupName<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBackReference(BackReference<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentBoundary(Boundary<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMatchPreviousAtLeast(MatchPreviousAtLeast<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMultilineMode(MultilineMode<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSingleLineMode(SingleLineMode<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAtStringBeginning(AtStringBeginning<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentThenExpression(ThenExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentUnicode(Unicode<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinMatchPreviousBetweenComplete(MinMatchPreviousBetweenComplete<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentOctal(Octal<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfGroupMatchComplete(IfGroupMatchComplete<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNewLine(NewLine<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfGroupMatch(IfGroupMatch<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfMatch(IfMatch<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentConditionalNamedExpressionCondNameFirst(ConditionalNamedExpressionCondNameFirst<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentFormFeed(FormFeed<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentConditionalNamedExpression(ConditionalNamedExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnyChar(AnyChar<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNegativeLookBehind(NegativeLookBehind<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnd(And<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNoUnnamedModes(NoUnnamedModes<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRegexLineComment(RegexLineComment<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentIfGroupMatchThenExpression(IfGroupMatchThenExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentExpressionWithOptions(ExpressionWithOptions<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentCharacterGroup(CharacterGroup<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinMatchPreviousBetween(MinMatchPreviousBetween<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinMatchZeroOrMore(MinMatchZeroOrMore<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentPositiveLookAhead(PositiveLookAhead<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentSubExpression(SubExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentEscape(Escape<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentRegexMatchExpression(RegexMatchExpression<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentZeroOrMore(ZeroOrMore<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNamedSubExpressionNameFirst(NamedSubExpressionNameFirst<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAnyNonLetterOrDigit(AnyNonLetterOrDigit<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNegativeLookAhead(NegativeLookAhead<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentUnicodeNotBlock(UnicodeNotBlock<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentMinMatchZeroOrOne(MinMatchZeroOrOne<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNameSubstitution(NameSubstitution<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentAtStringEndOrNewline(AtStringEndOrNewline<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentNoBoundary(NoBoundary<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitParentZeroOrOne(ZeroOrOne<Z> var1) {
      this.visitParent(var1);
   }

   public <Z extends Element> void visitElementOr(Or<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementOtherChar(OtherChar<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfMatchSubExpression(IfMatchSubExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnyWhiteSpace(AnyWhiteSpace<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNumberSubstitution(NumberSubstitution<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementControlChar(ControlChar<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCondNameFirst(CondNameFirst<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCharacterNotGroup(CharacterNotGroup<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRegexComment(RegexComment<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementConditionalNamedExpressionComplete(ConditionalNamedExpressionComplete<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinMatchOneOrMore(MinMatchOneOrMore<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementVerticalTab(VerticalTab<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMatchPreviousBetweenN(MatchPreviousBetweenN<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNamedSubExpressionComplete(NamedSubExpressionComplete<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNamedBackReference(NamedBackReference<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCondExpressionSecond(CondExpressionSecond<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAtBeginning(AtBeginning<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementElseExpression(ElseExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMatchPreviousBetween(MatchPreviousBetween<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBell(Bell<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBackspace(Backspace<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnyNonDigit(AnyNonDigit<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAtEnd(AtEnd<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnyDigit(AnyDigit<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRegexSubstitutionExpression(RegexSubstitutionExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinMatchPreviousAtLeast(MinMatchPreviousAtLeast<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementUnicodeBlock(UnicodeBlock<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCaseInsensitive(CaseInsensitive<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnyLetterOrDigit(AnyLetterOrDigit<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementM(M<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNonCapturingGroup(NonCapturingGroup<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementN(N<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNonBackTracking(NonBackTracking<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementOneOrMore(OneOrMore<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementHexadecimal(Hexadecimal<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCarriageReturn(CarriageReturn<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfMatchIfMatchSubExpression(IfMatchIfMatchSubExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNameFirst(NameFirst<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinMatchPreviousNTimes(MinMatchPreviousNTimes<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementPositiveLookBehind(PositiveLookBehind<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinMatchPreviousBetweenN(MinMatchPreviousBetweenN<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementFromFirstUntilLast(FromFirstUntilLast<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMatchPreviousNTimes(MatchPreviousNTimes<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMatchPreviousBetweenComplete(MatchPreviousBetweenComplete<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfMatchThenExpression(IfMatchThenExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIgnoreUnescapedWhiteSpaces(IgnoreUnescapedWhiteSpaces<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnyNonWhiteSpace(AnyNonWhiteSpace<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementTab(Tab<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAtStringEnd(AtStringEnd<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementExpression(Expression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementActivateOption(ActivateOption<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNamedSubExpression(NamedSubExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfMatchComplete(IfMatchComplete<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinM(MinM<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementGroupName(GroupName<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementConsecutiveMatch(ConsecutiveMatch<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfGroupMatchGroupName(IfGroupMatchGroupName<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBackReference(BackReference<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementBoundary(Boundary<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMatchPreviousAtLeast(MatchPreviousAtLeast<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMultilineMode(MultilineMode<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSingleLineMode(SingleLineMode<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAtStringBeginning(AtStringBeginning<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementThenExpression(ThenExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementUnicode(Unicode<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinMatchPreviousBetweenComplete(MinMatchPreviousBetweenComplete<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementOctal(Octal<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfGroupMatchComplete(IfGroupMatchComplete<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNewLine(NewLine<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfGroupMatch(IfGroupMatch<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfMatch(IfMatch<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementConditionalNamedExpressionCondNameFirst(ConditionalNamedExpressionCondNameFirst<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementFormFeed(FormFeed<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementConditionalNamedExpression(ConditionalNamedExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnyChar(AnyChar<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNegativeLookBehind(NegativeLookBehind<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnd(And<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNoUnnamedModes(NoUnnamedModes<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRegexLineComment(RegexLineComment<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementIfGroupMatchThenExpression(IfGroupMatchThenExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementExpressionWithOptions(ExpressionWithOptions<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementCharacterGroup(CharacterGroup<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinMatchPreviousBetween(MinMatchPreviousBetween<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinMatchZeroOrMore(MinMatchZeroOrMore<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementPositiveLookAhead(PositiveLookAhead<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementSubExpression(SubExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementEscape(Escape<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementRegexMatchExpression(RegexMatchExpression<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementZeroOrMore(ZeroOrMore<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNamedSubExpressionNameFirst(NamedSubExpressionNameFirst<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAnyNonLetterOrDigit(AnyNonLetterOrDigit<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNegativeLookAhead(NegativeLookAhead<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementUnicodeNotBlock(UnicodeNotBlock<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementMinMatchZeroOrOne(MinMatchZeroOrOne<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNameSubstitution(NameSubstitution<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementAtStringEndOrNewline(AtStringEndOrNewline<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementNoBoundary(NoBoundary<Z> var1) {
      this.visitElement(var1);
   }

   public <Z extends Element> void visitElementZeroOrOne(ZeroOrOne<Z> var1) {
      this.visitElement(var1);
   }

   public void visitAttributeOneChar(String oneChar) {
      this.visitAttribute("oneChar", oneChar);
   }

   public void visitAttributeLast(String last) {
      this.visitAttribute("last", last);
   }

   public void visitAttributeFourDigits(String fourDigits) {
      this.visitAttribute("fourDigits", fourDigits);
   }

   public void visitAttributeSubExpr(String subExpr) {
      this.visitAttribute("subExpr", subExpr);
   }

   public void visitAttributeN(String n) {
      this.visitAttribute("n", n);
   }

   public void visitAttributeMinN(String minN) {
      this.visitAttribute("minN", minN);
   }

   public void visitAttributeTwoDigits(String twoDigits) {
      this.visitAttribute("twoDigits", twoDigits);
   }

   public void visitAttributeNumber(String number) {
      this.visitAttribute("number", number);
   }

   public void visitAttributeOptionsSubExpr(String optionsSubExpr) {
      this.visitAttribute("optionsSubExpr", optionsSubExpr);
   }

   public void visitAttributeSubstitutionName(String substitutionName) {
      this.visitAttribute("substitutionName", substitutionName);
   }

   public void visitAttributeName(String name) {
      this.visitAttribute("name", name);
   }

   public void visitAttributeThreeDigits(String threeDigits) {
      this.visitAttribute("threeDigits", threeDigits);
   }

   public void visitAttributeBlock(String block) {
      this.visitAttribute("block", block);
   }

   public void visitAttributeComment(String comment) {
      this.visitAttribute("comment", comment);
   }

   public void visitAttributeCharGroup(String charGroup) {
      this.visitAttribute("charGroup", charGroup);
   }

   public void visitAttributeMinNTimes(String minNTimes) {
      this.visitAttribute("minNTimes", minNTimes);
   }

   public void visitAttributeFirst(String first) {
      this.visitAttribute("first", first);
   }

   public void visitAttributeNTimes(String nTimes) {
      this.visitAttribute("nTimes", nTimes);
   }

   public void visitAttributeOption(String option) {
      this.visitAttribute("option", option);
   }
}
