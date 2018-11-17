package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MinMatchPreviousAtLeast<Z extends Element> implements CustomAttributeGroup<MinMatchPreviousAtLeast<Z>, Z>, MatchingOperationsAll1<MinMatchPreviousAtLeast<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinMatchPreviousAtLeast(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMinMatchPreviousAtLeast(this);
   }

   public MinMatchPreviousAtLeast(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMinMatchPreviousAtLeast(this);
   }

   protected MinMatchPreviousAtLeast(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMinMatchPreviousAtLeast(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMinMatchPreviousAtLeast(this);
      return this.parent;
   }

   public final MinMatchPreviousAtLeast<Z> dynamic(Consumer<MinMatchPreviousAtLeast<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinMatchPreviousAtLeast<Z> of(Consumer<MinMatchPreviousAtLeast<Z>> consumer) {
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
      return "minMatchPreviousAtLeast";
   }

   public final MinMatchPreviousAtLeast<Z> self() {
      return this;
   }

   public final MinMatchPreviousAtLeast<Z> attrMinNTimes(Integer attrMinNTimes) {
      this.visitor.visitAttributeMinNTimes(attrMinNTimes.toString());
      return this;
   }
}
