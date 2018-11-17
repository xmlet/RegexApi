package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ExpressionWithOptions<Z extends Element> implements CustomAttributeGroup<ExpressionWithOptions<Z>, Z>, MatchingOperationsAll1<ExpressionWithOptions<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ExpressionWithOptions(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementExpressionWithOptions(this);
   }

   public ExpressionWithOptions(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementExpressionWithOptions(this);
   }

   protected ExpressionWithOptions(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementExpressionWithOptions(this);
      }

   }

   public Z __() {
      this.visitor.visitParentExpressionWithOptions(this);
      return this.parent;
   }

   public final ExpressionWithOptions<Z> dynamic(Consumer<ExpressionWithOptions<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ExpressionWithOptions<Z> of(Consumer<ExpressionWithOptions<Z>> consumer) {
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
      return "expressionWithOptions";
   }

   public final ExpressionWithOptions<Z> self() {
      return this;
   }

   public final ExpressionWithOptions<Z> attrOptionsSubExpr(String attrOptionsSubExpr) {
      this.visitor.visitAttributeOptionsSubExpr(attrOptionsSubExpr);
      return this;
   }
}
