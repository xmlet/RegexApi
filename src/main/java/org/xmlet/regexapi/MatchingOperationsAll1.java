package org.xmlet.regexapi;

public interface MatchingOperationsAll1<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default Bell<T> bell() {
      return new Bell(this.self());
   }

   default Backspace<T> backspace() {
      return new Backspace(this.self());
   }

   default Tab<T> tab() {
      return new Tab(this.self());
   }

   default CarriageReturn<T> carriageReturn() {
      return new CarriageReturn(this.self());
   }

   default VerticalTab<T> verticalTab() {
      return new VerticalTab(this.self());
   }

   default FormFeed<T> formFeed() {
      return new FormFeed(this.self());
   }

   default NewLine<T> newLine() {
      return new NewLine(this.self());
   }

   default Escape<T> escape() {
      return new Escape(this.self());
   }

   default Octal<T> octal() {
      return new Octal(this.self());
   }

   default Hexadecimal<T> hexadecimal() {
      return new Hexadecimal(this.self());
   }

   default ControlChar<T> controlChar() {
      return new ControlChar(this.self());
   }

   default Unicode<T> unicode() {
      return new Unicode(this.self());
   }

   default OtherChar<T> otherChar() {
      return new OtherChar(this.self());
   }

   default CharacterGroup<T> characterGroup() {
      return new CharacterGroup(this.self());
   }

   default CharacterNotGroup<T> characterNotGroup() {
      return new CharacterNotGroup(this.self());
   }

   default FromFirstUntilLast<T> fromFirstUntilLast() {
      return new FromFirstUntilLast(this.self());
   }

   default AnyChar<T> anyChar() {
      return new AnyChar(this.self());
   }

   default UnicodeBlock<T> unicodeBlock() {
      return new UnicodeBlock(this.self());
   }

   default UnicodeNotBlock<T> unicodeNotBlock() {
      return new UnicodeNotBlock(this.self());
   }

   default AnyLetterOrDigit<T> anyLetterOrDigit() {
      return new AnyLetterOrDigit(this.self());
   }

   default AnyNonLetterOrDigit<T> anyNonLetterOrDigit() {
      return new AnyNonLetterOrDigit(this.self());
   }

   default AnyWhiteSpace<T> anyWhiteSpace() {
      return new AnyWhiteSpace(this.self());
   }

   default AnyNonWhiteSpace<T> anyNonWhiteSpace() {
      return new AnyNonWhiteSpace(this.self());
   }

   default AnyDigit<T> anyDigit() {
      return new AnyDigit(this.self());
   }

   default AnyNonDigit<T> anyNonDigit() {
      return new AnyNonDigit(this.self());
   }

   default AtBeginning<T> atBeginning() {
      return new AtBeginning(this.self());
   }

   default AtEnd<T> atEnd() {
      return new AtEnd(this.self());
   }

   default AtStringBeginning<T> atStringBeginning() {
      return new AtStringBeginning(this.self());
   }

   default AtStringEndOrNewline<T> atStringEndOrNewline() {
      return new AtStringEndOrNewline(this.self());
   }

   default AtStringEnd<T> atStringEnd() {
      return new AtStringEnd(this.self());
   }

   default ConsecutiveMatch<T> consecutiveMatch() {
      return new ConsecutiveMatch(this.self());
   }

   default Boundary<T> boundary() {
      return new Boundary(this.self());
   }

   default NoBoundary<T> noBoundary() {
      return new NoBoundary(this.self());
   }

   default ZeroOrMore<T> zeroOrMore() {
      return new ZeroOrMore(this.self());
   }

   default OneOrMore<T> oneOrMore() {
      return new OneOrMore(this.self());
   }

   default ZeroOrOne<T> zeroOrOne() {
      return new ZeroOrOne(this.self());
   }

   default MatchPreviousNTimes<T> matchPreviousNTimes() {
      return new MatchPreviousNTimes(this.self());
   }

   default MatchPreviousAtLeast<T> matchPreviousAtLeast() {
      return new MatchPreviousAtLeast(this.self());
   }

   default MatchPreviousBetween<T> matchPreviousBetween() {
      return new MatchPreviousBetween(this.self());
   }

   default MinMatchZeroOrMore<T> minMatchZeroOrMore() {
      return new MinMatchZeroOrMore(this.self());
   }

   default MinMatchOneOrMore<T> minMatchOneOrMore() {
      return new MinMatchOneOrMore(this.self());
   }

   default MinMatchZeroOrOne<T> minMatchZeroOrOne() {
      return new MinMatchZeroOrOne(this.self());
   }

   default MinMatchPreviousNTimes<T> minMatchPreviousNTimes() {
      return new MinMatchPreviousNTimes(this.self());
   }

   default MinMatchPreviousAtLeast<T> minMatchPreviousAtLeast() {
      return new MinMatchPreviousAtLeast(this.self());
   }

   default MinMatchPreviousBetween<T> minMatchPreviousBetween() {
      return new MinMatchPreviousBetween(this.self());
   }

   default BackReference<T> backReference() {
      return new BackReference(this.self());
   }

   default NamedBackReference<T> namedBackReference() {
      return new NamedBackReference(this.self());
   }

   default And<T> and() {
      return new And(this.self());
   }

   default Or<T> or() {
      return new Or(this.self());
   }

   default IfMatch<T> ifMatch() {
      return new IfMatch(this.self());
   }

   default IfGroupMatch<T> ifGroupMatch() {
      return new IfGroupMatch(this.self());
   }

   default CaseInsensitive<T> caseInsensitive() {
      return new CaseInsensitive(this.self());
   }

   default MultilineMode<T> multilineMode() {
      return new MultilineMode(this.self());
   }

   default NoUnnamedModes<T> noUnnamedModes() {
      return new NoUnnamedModes(this.self());
   }

   default SingleLineMode<T> singleLineMode() {
      return new SingleLineMode(this.self());
   }

   default IgnoreUnescapedWhiteSpaces<T> ignoreUnescapedWhiteSpaces() {
      return new IgnoreUnescapedWhiteSpaces(this.self());
   }

   default ActivateOption<T> activateOption() {
      return new ActivateOption(this.self());
   }

   default RegexComment<T> regexComment() {
      return new RegexComment(this.self());
   }

   default RegexLineComment<T> regexLineComment() {
      return new RegexLineComment(this.self());
   }

   default SubExpression<T> subExpression() {
      return new SubExpression(this.self());
   }

   default NamedSubExpression<T> namedSubExpression() {
      return new NamedSubExpression(this.self());
   }

   default ConditionalNamedExpression<T> conditionalNamedExpression() {
      return new ConditionalNamedExpression(this.self());
   }

   default NonCapturingGroup<T> nonCapturingGroup() {
      return new NonCapturingGroup(this.self());
   }

   default PositiveLookAhead<T> positiveLookAhead() {
      return new PositiveLookAhead(this.self());
   }

   default PositiveLookBehind<T> positiveLookBehind() {
      return new PositiveLookBehind(this.self());
   }

   default NegativeLookAhead<T> negativeLookAhead() {
      return new NegativeLookAhead(this.self());
   }

   default NegativeLookBehind<T> negativeLookBehind() {
      return new NegativeLookBehind(this.self());
   }

   default NonBackTracking<T> nonBackTracking() {
      return new NonBackTracking(this.self());
   }

   default ExpressionWithOptions<T> expressionWithOptions() {
      return new ExpressionWithOptions(this.self());
   }
}
