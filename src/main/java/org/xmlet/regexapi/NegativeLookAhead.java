package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NegativeLookAhead<Z extends Element> implements CustomAttributeGroup<NegativeLookAhead<Z>, Z>, MatchingOperationsAll1<NegativeLookAhead<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NegativeLookAhead(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNegativeLookAhead(this);
   }

   public NegativeLookAhead(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNegativeLookAhead(this);
   }

   protected NegativeLookAhead(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNegativeLookAhead(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNegativeLookAhead(this);
      return this.parent;
   }

   public final NegativeLookAhead<Z> dynamic(Consumer<NegativeLookAhead<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NegativeLookAhead<Z> of(Consumer<NegativeLookAhead<Z>> consumer) {
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
      return "negativeLookAhead";
   }

   public final NegativeLookAhead<Z> self() {
      return this;
   }

   public final NegativeLookAhead<Z> attrSubExpr(String attrSubExpr) {
      this.visitor.visitAttributeSubExpr(attrSubExpr);
      return this;
   }
}
