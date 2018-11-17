package org.xmlet.regexapi;

import java.util.function.Consumer;

public class ConditionalNamedExpressionComplete<Z extends Element> implements CustomAttributeGroup<ConditionalNamedExpressionComplete<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ConditionalNamedExpressionComplete(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public ConditionalNamedExpressionComplete(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected ConditionalNamedExpressionComplete(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentConditionalNamedExpressionComplete(this);
      return this.parent;
   }

   public final ConditionalNamedExpressionComplete<Z> dynamic(Consumer<ConditionalNamedExpressionComplete<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ConditionalNamedExpressionComplete<Z> of(Consumer<ConditionalNamedExpressionComplete<Z>> consumer) {
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

   public final ConditionalNamedExpressionComplete<Z> self() {
      return this;
   }
}
