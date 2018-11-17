package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ThenExpression<Z extends Element> implements CustomAttributeGroup<ThenExpression<Z>, Z>, TextGroup<ThenExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ThenExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementThenExpression(this);
   }

   public ThenExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementThenExpression(this);
   }

   protected ThenExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementThenExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentThenExpression(this);
      return this.parent;
   }

   public final ThenExpression<Z> dynamic(Consumer<ThenExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ThenExpression<Z> of(Consumer<ThenExpression<Z>> consumer) {
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
      return "thenExpression";
   }

   public final ThenExpression<Z> self() {
      return this;
   }
}
