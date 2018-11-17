package org.xmlet.regexapi;

import java.util.function.Consumer;

public class MatchPreviousBetweenComplete<Z extends Element> implements CustomAttributeGroup<MatchPreviousBetweenComplete<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MatchPreviousBetweenComplete(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public MatchPreviousBetweenComplete(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected MatchPreviousBetweenComplete(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentMatchPreviousBetweenComplete(this);
      return this.parent;
   }

   public final MatchPreviousBetweenComplete<Z> dynamic(Consumer<MatchPreviousBetweenComplete<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MatchPreviousBetweenComplete<Z> of(Consumer<MatchPreviousBetweenComplete<Z>> consumer) {
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

   public final MatchPreviousBetweenComplete<Z> self() {
      return this;
   }
}
