package org.xmlet.regexapi;

import java.util.function.Consumer;

public class MatchPreviousBetweenN<Z extends Element> implements CustomAttributeGroup<MatchPreviousBetweenN<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MatchPreviousBetweenN(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public MatchPreviousBetweenN(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected MatchPreviousBetweenN(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentMatchPreviousBetweenN(this);
      return this.parent;
   }

   public final MatchPreviousBetweenN<Z> dynamic(Consumer<MatchPreviousBetweenN<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MatchPreviousBetweenN<Z> of(Consumer<MatchPreviousBetweenN<Z>> consumer) {
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

   public final MatchPreviousBetweenN<Z> self() {
      return this;
   }

   public MatchPreviousBetweenComplete<Z> m(Integer m) {
      ((M)(new M(this, this.visitor, true)).text(m)).__();
      return new MatchPreviousBetweenComplete(this.parent, this.visitor, true);
   }
}
