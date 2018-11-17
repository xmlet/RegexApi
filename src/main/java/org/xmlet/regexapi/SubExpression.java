package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class SubExpression<Z extends Element> implements CustomAttributeGroup<SubExpression<Z>, Z>, MatchingOperationsAll1<SubExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public SubExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSubExpression(this);
   }

   public SubExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSubExpression(this);
   }

   protected SubExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSubExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSubExpression(this);
      return this.parent;
   }

   public final SubExpression<Z> dynamic(Consumer<SubExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final SubExpression<Z> of(Consumer<SubExpression<Z>> consumer) {
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
      return "subExpression";
   }

   public final SubExpression<Z> self() {
      return this;
   }

   public final SubExpression<Z> attrSubExpr(String attrSubExpr) {
      this.visitor.visitAttributeSubExpr(attrSubExpr);
      return this;
   }
}
