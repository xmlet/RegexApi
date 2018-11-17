package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MinMatchPreviousNTimes<Z extends Element> implements CustomAttributeGroup<MinMatchPreviousNTimes<Z>, Z>, MatchingOperationsAll1<MinMatchPreviousNTimes<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinMatchPreviousNTimes(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMinMatchPreviousNTimes(this);
   }

   public MinMatchPreviousNTimes(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMinMatchPreviousNTimes(this);
   }

   protected MinMatchPreviousNTimes(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMinMatchPreviousNTimes(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMinMatchPreviousNTimes(this);
      return this.parent;
   }

   public final MinMatchPreviousNTimes<Z> dynamic(Consumer<MinMatchPreviousNTimes<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinMatchPreviousNTimes<Z> of(Consumer<MinMatchPreviousNTimes<Z>> consumer) {
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
      return "minMatchPreviousNTimes";
   }

   public final MinMatchPreviousNTimes<Z> self() {
      return this;
   }

   public final MinMatchPreviousNTimes<Z> attrMinN(Object attrMinN) {
      this.visitor.visitAttributeMinN(attrMinN.toString());
      return this;
   }
}
