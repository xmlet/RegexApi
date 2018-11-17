package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Escape<Z extends Element> implements CustomAttributeGroup<Escape<Z>, Z>, MatchingOperationsAll1<Escape<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Escape(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementEscape(this);
   }

   public Escape(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementEscape(this);
   }

   protected Escape(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementEscape(this);
      }

   }

   public Z __() {
      this.visitor.visitParentEscape(this);
      return this.parent;
   }

   public final Escape<Z> dynamic(Consumer<Escape<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Escape<Z> of(Consumer<Escape<Z>> consumer) {
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
      return "escape";
   }

   public final Escape<Z> self() {
      return this;
   }
}
