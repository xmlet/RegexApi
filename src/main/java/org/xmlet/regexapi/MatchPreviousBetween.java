package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MatchPreviousBetween<Z extends Element> implements CustomAttributeGroup<MatchPreviousBetween<Z>, Z>, TextGroup<MatchPreviousBetween<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MatchPreviousBetween(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMatchPreviousBetween(this);
   }

   public MatchPreviousBetween(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMatchPreviousBetween(this);
   }

   protected MatchPreviousBetween(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMatchPreviousBetween(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMatchPreviousBetween(this);
      return this.parent;
   }

   public final MatchPreviousBetween<Z> dynamic(Consumer<MatchPreviousBetween<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MatchPreviousBetween<Z> of(Consumer<MatchPreviousBetween<Z>> consumer) {
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
      return "matchPreviousBetween";
   }

   public final MatchPreviousBetween<Z> self() {
      return this;
   }

   public MatchPreviousBetweenN<Z> n(Integer n) {
      ((N)(new N(this, this.visitor, true)).text(n)).__();
      return new MatchPreviousBetweenN(this.parent, this.visitor, true);
   }
}
