package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class CondExpressionSecond<Z extends Element> implements CustomAttributeGroup<CondExpressionSecond<Z>, Z>, TextGroup<CondExpressionSecond<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CondExpressionSecond(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCondExpressionSecond(this);
   }

   public CondExpressionSecond(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCondExpressionSecond(this);
   }

   protected CondExpressionSecond(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCondExpressionSecond(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCondExpressionSecond(this);
      return this.parent;
   }

   public final CondExpressionSecond<Z> dynamic(Consumer<CondExpressionSecond<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CondExpressionSecond<Z> of(Consumer<CondExpressionSecond<Z>> consumer) {
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
      return "condExpressionSecond";
   }

   public final CondExpressionSecond<Z> self() {
      return this;
   }
}
