package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class IfMatchSubExpression<Z extends Element> implements CustomAttributeGroup<IfMatchSubExpression<Z>, Z>, TextGroup<IfMatchSubExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfMatchSubExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementIfMatchSubExpression(this);
   }

   public IfMatchSubExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementIfMatchSubExpression(this);
   }

   protected IfMatchSubExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementIfMatchSubExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentIfMatchSubExpression(this);
      return this.parent;
   }

   public final IfMatchSubExpression<Z> dynamic(Consumer<IfMatchSubExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfMatchSubExpression<Z> of(Consumer<IfMatchSubExpression<Z>> consumer) {
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
      return "ifMatchSubExpression";
   }

   public final IfMatchSubExpression<Z> self() {
      return this;
   }
}
