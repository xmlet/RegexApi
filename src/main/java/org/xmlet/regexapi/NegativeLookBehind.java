package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NegativeLookBehind<Z extends Element> implements CustomAttributeGroup<NegativeLookBehind<Z>, Z>, MatchingOperationsAll1<NegativeLookBehind<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NegativeLookBehind(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNegativeLookBehind(this);
   }

   public NegativeLookBehind(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNegativeLookBehind(this);
   }

   protected NegativeLookBehind(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNegativeLookBehind(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNegativeLookBehind(this);
      return this.parent;
   }

   public final NegativeLookBehind<Z> dynamic(Consumer<NegativeLookBehind<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NegativeLookBehind<Z> of(Consumer<NegativeLookBehind<Z>> consumer) {
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
      return "negativeLookBehind";
   }

   public final NegativeLookBehind<Z> self() {
      return this;
   }

   public final NegativeLookBehind<Z> attrSubExpr(String attrSubExpr) {
      this.visitor.visitAttributeSubExpr(attrSubExpr);
      return this;
   }
}
