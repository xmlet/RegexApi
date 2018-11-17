package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AtEnd<Z extends Element> implements CustomAttributeGroup<AtEnd<Z>, Z>, MatchingOperationsAll1<AtEnd<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AtEnd(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAtEnd(this);
   }

   public AtEnd(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAtEnd(this);
   }

   protected AtEnd(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAtEnd(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAtEnd(this);
      return this.parent;
   }

   public final AtEnd<Z> dynamic(Consumer<AtEnd<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AtEnd<Z> of(Consumer<AtEnd<Z>> consumer) {
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
      return "atEnd";
   }

   public final AtEnd<Z> self() {
      return this;
   }
}
