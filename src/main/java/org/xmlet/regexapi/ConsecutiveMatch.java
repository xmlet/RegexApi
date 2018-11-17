package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ConsecutiveMatch<Z extends Element> implements CustomAttributeGroup<ConsecutiveMatch<Z>, Z>, MatchingOperationsAll1<ConsecutiveMatch<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ConsecutiveMatch(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementConsecutiveMatch(this);
   }

   public ConsecutiveMatch(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementConsecutiveMatch(this);
   }

   protected ConsecutiveMatch(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementConsecutiveMatch(this);
      }

   }

   public Z __() {
      this.visitor.visitParentConsecutiveMatch(this);
      return this.parent;
   }

   public final ConsecutiveMatch<Z> dynamic(Consumer<ConsecutiveMatch<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ConsecutiveMatch<Z> of(Consumer<ConsecutiveMatch<Z>> consumer) {
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
      return "consecutiveMatch";
   }

   public final ConsecutiveMatch<Z> self() {
      return this;
   }
}
