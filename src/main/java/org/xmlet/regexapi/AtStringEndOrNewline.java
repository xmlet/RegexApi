package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AtStringEndOrNewline<Z extends Element> implements CustomAttributeGroup<AtStringEndOrNewline<Z>, Z>, MatchingOperationsAll1<AtStringEndOrNewline<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AtStringEndOrNewline(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAtStringEndOrNewline(this);
   }

   public AtStringEndOrNewline(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAtStringEndOrNewline(this);
   }

   protected AtStringEndOrNewline(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAtStringEndOrNewline(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAtStringEndOrNewline(this);
      return this.parent;
   }

   public final AtStringEndOrNewline<Z> dynamic(Consumer<AtStringEndOrNewline<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AtStringEndOrNewline<Z> of(Consumer<AtStringEndOrNewline<Z>> consumer) {
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
      return "atStringEndOrNewline";
   }

   public final AtStringEndOrNewline<Z> self() {
      return this;
   }
}
