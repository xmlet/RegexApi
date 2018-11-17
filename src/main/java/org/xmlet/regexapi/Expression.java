package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Expression<Z extends Element> implements CustomAttributeGroup<Expression<Z>, Z>, TextGroup<Expression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Expression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementExpression(this);
   }

   public Expression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementExpression(this);
   }

   protected Expression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentExpression(this);
      return this.parent;
   }

   public final Expression<Z> dynamic(Consumer<Expression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Expression<Z> of(Consumer<Expression<Z>> consumer) {
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
      return "expression";
   }

   public final Expression<Z> self() {
      return this;
   }
}
