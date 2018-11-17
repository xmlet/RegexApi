package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class RegexSubstitutionExpression<Z extends Element> implements CustomAttributeGroup<RegexSubstitutionExpression<Z>, Z>, SubstitutionOperationsAll1<RegexSubstitutionExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RegexSubstitutionExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRegexSubstitutionExpression(this);
   }

   public RegexSubstitutionExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRegexSubstitutionExpression(this);
   }

   protected RegexSubstitutionExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRegexSubstitutionExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRegexSubstitutionExpression(this);
      return this.parent;
   }

   public final RegexSubstitutionExpression<Z> dynamic(Consumer<RegexSubstitutionExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RegexSubstitutionExpression<Z> of(Consumer<RegexSubstitutionExpression<Z>> consumer) {
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
      return "regexSubstitutionExpression";
   }

   public final RegexSubstitutionExpression<Z> self() {
      return this;
   }
}
