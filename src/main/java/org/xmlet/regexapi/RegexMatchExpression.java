package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class RegexMatchExpression<Z extends Element> implements CustomAttributeGroup<RegexMatchExpression<Z>, Z>, MatchingOperationsAll1<RegexMatchExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RegexMatchExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRegexMatchExpression(this);
   }

   public RegexMatchExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRegexMatchExpression(this);
   }

   protected RegexMatchExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRegexMatchExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRegexMatchExpression(this);
      return this.parent;
   }

   public final RegexMatchExpression<Z> dynamic(Consumer<RegexMatchExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RegexMatchExpression<Z> of(Consumer<RegexMatchExpression<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "regexMatchExpression";
   }

   public final RegexMatchExpression<Z> self() {
      return this;
   }
}
