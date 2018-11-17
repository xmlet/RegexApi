package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NonCapturingGroup<Z extends Element> implements CustomAttributeGroup<NonCapturingGroup<Z>, Z>, MatchingOperationsAll1<NonCapturingGroup<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NonCapturingGroup(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNonCapturingGroup(this);
   }

   public NonCapturingGroup(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNonCapturingGroup(this);
   }

   protected NonCapturingGroup(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNonCapturingGroup(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNonCapturingGroup(this);
      return this.parent;
   }

   public final NonCapturingGroup<Z> dynamic(Consumer<NonCapturingGroup<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NonCapturingGroup<Z> of(Consumer<NonCapturingGroup<Z>> consumer) {
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
      return "nonCapturingGroup";
   }

   public final NonCapturingGroup<Z> self() {
      return this;
   }

   public final NonCapturingGroup<Z> attrSubExpr(String attrSubExpr) {
      this.visitor.visitAttributeSubExpr(attrSubExpr);
      return this;
   }
}
