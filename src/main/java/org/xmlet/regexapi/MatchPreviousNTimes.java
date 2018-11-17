package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MatchPreviousNTimes<Z extends Element> implements CustomAttributeGroup<MatchPreviousNTimes<Z>, Z>, MatchingOperationsAll1<MatchPreviousNTimes<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MatchPreviousNTimes(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMatchPreviousNTimes(this);
   }

   public MatchPreviousNTimes(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMatchPreviousNTimes(this);
   }

   protected MatchPreviousNTimes(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMatchPreviousNTimes(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMatchPreviousNTimes(this);
      return this.parent;
   }

   public final MatchPreviousNTimes<Z> dynamic(Consumer<MatchPreviousNTimes<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MatchPreviousNTimes<Z> of(Consumer<MatchPreviousNTimes<Z>> consumer) {
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
      return "matchPreviousNTimes";
   }

   public final MatchPreviousNTimes<Z> self() {
      return this;
   }

   public final MatchPreviousNTimes<Z> attrN(Integer attrN) {
      this.visitor.visitAttributeN(attrN.toString());
      return this;
   }
}
