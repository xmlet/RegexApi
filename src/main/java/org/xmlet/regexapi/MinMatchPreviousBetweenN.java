package org.xmlet.regexapi;

import java.util.function.Consumer;

public class MinMatchPreviousBetweenN<Z extends Element> implements CustomAttributeGroup<MinMatchPreviousBetweenN<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinMatchPreviousBetweenN(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public MinMatchPreviousBetweenN(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected MinMatchPreviousBetweenN(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentMinMatchPreviousBetweenN(this);
      return this.parent;
   }

   public final MinMatchPreviousBetweenN<Z> dynamic(Consumer<MinMatchPreviousBetweenN<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinMatchPreviousBetweenN<Z> of(Consumer<MinMatchPreviousBetweenN<Z>> consumer) {
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

   public final MinMatchPreviousBetweenN<Z> self() {
      return this;
   }

   public MinMatchPreviousBetweenComplete<Z> minM(Integer minM) {
      ((MinM)(new MinM(this, this.visitor, true)).text(minM)).__();
      return new MinMatchPreviousBetweenComplete(this.parent, this.visitor, true);
   }
}
