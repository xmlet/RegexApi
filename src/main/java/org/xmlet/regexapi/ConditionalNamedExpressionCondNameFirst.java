package org.xmlet.regexapi;

import java.util.function.Consumer;

public class ConditionalNamedExpressionCondNameFirst<Z extends Element> implements CustomAttributeGroup<ConditionalNamedExpressionCondNameFirst<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ConditionalNamedExpressionCondNameFirst(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public ConditionalNamedExpressionCondNameFirst(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected ConditionalNamedExpressionCondNameFirst(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentConditionalNamedExpressionCondNameFirst(this);
      return this.parent;
   }

   public final ConditionalNamedExpressionCondNameFirst<Z> dynamic(Consumer<ConditionalNamedExpressionCondNameFirst<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ConditionalNamedExpressionCondNameFirst<Z> of(Consumer<ConditionalNamedExpressionCondNameFirst<Z>> consumer) {
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

   public final ConditionalNamedExpressionCondNameFirst<Z> self() {
      return this;
   }

   public ConditionalNamedExpressionComplete<Z> condExpressionSecond(String condExpressionSecond) {
      ((CondExpressionSecond)(new CondExpressionSecond(this, this.visitor, true)).text(condExpressionSecond)).__();
      return new ConditionalNamedExpressionComplete(this.parent, this.visitor, true);
   }
}
