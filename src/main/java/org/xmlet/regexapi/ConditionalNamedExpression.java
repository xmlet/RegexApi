package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ConditionalNamedExpression<Z extends Element> implements CustomAttributeGroup<ConditionalNamedExpression<Z>, Z>, TextGroup<ConditionalNamedExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ConditionalNamedExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementConditionalNamedExpression(this);
   }

   public ConditionalNamedExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementConditionalNamedExpression(this);
   }

   protected ConditionalNamedExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementConditionalNamedExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentConditionalNamedExpression(this);
      return this.parent;
   }

   public final ConditionalNamedExpression<Z> dynamic(Consumer<ConditionalNamedExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ConditionalNamedExpression<Z> of(Consumer<ConditionalNamedExpression<Z>> consumer) {
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
      return "conditionalNamedExpression";
   }

   public final ConditionalNamedExpression<Z> self() {
      return this;
   }

   public ConditionalNamedExpressionCondNameFirst<Z> condNameFirst(String condNameFirst) {
      ((CondNameFirst)(new CondNameFirst(this, this.visitor, true)).text(condNameFirst)).__();
      return new ConditionalNamedExpressionCondNameFirst(this.parent, this.visitor, true);
   }
}
