package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AtStringEnd<Z extends Element> implements CustomAttributeGroup<AtStringEnd<Z>, Z>, MatchingOperationsAll1<AtStringEnd<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AtStringEnd(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAtStringEnd(this);
   }

   public AtStringEnd(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAtStringEnd(this);
   }

   protected AtStringEnd(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAtStringEnd(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAtStringEnd(this);
      return this.parent;
   }

   public final AtStringEnd<Z> dynamic(Consumer<AtStringEnd<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AtStringEnd<Z> of(Consumer<AtStringEnd<Z>> consumer) {
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
      return "atStringEnd";
   }

   public final AtStringEnd<Z> self() {
      return this;
   }
}
