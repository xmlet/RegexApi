package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MinMatchPreviousBetween<Z extends Element> implements CustomAttributeGroup<MinMatchPreviousBetween<Z>, Z>, TextGroup<MinMatchPreviousBetween<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinMatchPreviousBetween(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMinMatchPreviousBetween(this);
   }

   public MinMatchPreviousBetween(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMinMatchPreviousBetween(this);
   }

   protected MinMatchPreviousBetween(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMinMatchPreviousBetween(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMinMatchPreviousBetween(this);
      return this.parent;
   }

   public final MinMatchPreviousBetween<Z> dynamic(Consumer<MinMatchPreviousBetween<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinMatchPreviousBetween<Z> of(Consumer<MinMatchPreviousBetween<Z>> consumer) {
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
      return "minMatchPreviousBetween";
   }

   public final MinMatchPreviousBetween<Z> self() {
      return this;
   }

   public MinMatchPreviousBetweenN<Z> n(Integer n) {
      ((N)(new N(this, this.visitor, true)).text(n)).__();
      return new MinMatchPreviousBetweenN(this.parent, this.visitor, true);
   }
}
