package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MatchPreviousAtLeast<Z extends Element> implements CustomAttributeGroup<MatchPreviousAtLeast<Z>, Z>, MatchingOperationsAll1<MatchPreviousAtLeast<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MatchPreviousAtLeast(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMatchPreviousAtLeast(this);
   }

   public MatchPreviousAtLeast(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMatchPreviousAtLeast(this);
   }

   protected MatchPreviousAtLeast(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMatchPreviousAtLeast(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMatchPreviousAtLeast(this);
      return this.parent;
   }

   public final MatchPreviousAtLeast<Z> dynamic(Consumer<MatchPreviousAtLeast<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MatchPreviousAtLeast<Z> of(Consumer<MatchPreviousAtLeast<Z>> consumer) {
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
      return "matchPreviousAtLeast";
   }

   public final MatchPreviousAtLeast<Z> self() {
      return this;
   }

   public final MatchPreviousAtLeast<Z> attrNTimes(Integer attrNTimes) {
      this.visitor.visitAttributeNTimes(attrNTimes.toString());
      return this;
   }
}
