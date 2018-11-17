package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NonBackTracking<Z extends Element> implements CustomAttributeGroup<NonBackTracking<Z>, Z>, MatchingOperationsAll1<NonBackTracking<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NonBackTracking(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNonBackTracking(this);
   }

   public NonBackTracking(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNonBackTracking(this);
   }

   protected NonBackTracking(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNonBackTracking(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNonBackTracking(this);
      return this.parent;
   }

   public final NonBackTracking<Z> dynamic(Consumer<NonBackTracking<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NonBackTracking<Z> of(Consumer<NonBackTracking<Z>> consumer) {
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
      return "nonBackTracking";
   }

   public final NonBackTracking<Z> self() {
      return this;
   }

   public final NonBackTracking<Z> attrSubExpr(String attrSubExpr) {
      this.visitor.visitAttributeSubExpr(attrSubExpr);
      return this;
   }
}
