package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class PositiveLookAhead<Z extends Element> implements CustomAttributeGroup<PositiveLookAhead<Z>, Z>, MatchingOperationsAll1<PositiveLookAhead<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public PositiveLookAhead(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementPositiveLookAhead(this);
   }

   public PositiveLookAhead(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementPositiveLookAhead(this);
   }

   protected PositiveLookAhead(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementPositiveLookAhead(this);
      }

   }

   public Z __() {
      this.visitor.visitParentPositiveLookAhead(this);
      return this.parent;
   }

   public final PositiveLookAhead<Z> dynamic(Consumer<PositiveLookAhead<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final PositiveLookAhead<Z> of(Consumer<PositiveLookAhead<Z>> consumer) {
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
      return "positiveLookAhead";
   }

   public final PositiveLookAhead<Z> self() {
      return this;
   }

   public final PositiveLookAhead<Z> attrSubExpr(String attrSubExpr) {
      this.visitor.visitAttributeSubExpr(attrSubExpr);
      return this;
   }
}
