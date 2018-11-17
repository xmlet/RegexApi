package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class PositiveLookBehind<Z extends Element> implements CustomAttributeGroup<PositiveLookBehind<Z>, Z>, MatchingOperationsAll1<PositiveLookBehind<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public PositiveLookBehind(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementPositiveLookBehind(this);
   }

   public PositiveLookBehind(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementPositiveLookBehind(this);
   }

   protected PositiveLookBehind(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementPositiveLookBehind(this);
      }

   }

   public Z __() {
      this.visitor.visitParentPositiveLookBehind(this);
      return this.parent;
   }

   public final PositiveLookBehind<Z> dynamic(Consumer<PositiveLookBehind<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final PositiveLookBehind<Z> of(Consumer<PositiveLookBehind<Z>> consumer) {
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
      return "positiveLookBehind";
   }

   public final PositiveLookBehind<Z> self() {
      return this;
   }

   public final PositiveLookBehind<Z> attrSubExpr(String attrSubExpr) {
      this.visitor.visitAttributeSubExpr(attrSubExpr);
      return this;
   }
}
