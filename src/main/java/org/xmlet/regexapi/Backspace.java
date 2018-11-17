package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Backspace<Z extends Element> implements CustomAttributeGroup<Backspace<Z>, Z>, MatchingOperationsAll1<Backspace<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Backspace(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBackspace(this);
   }

   public Backspace(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBackspace(this);
   }

   protected Backspace(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBackspace(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBackspace(this);
      return this.parent;
   }

   public final Backspace<Z> dynamic(Consumer<Backspace<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Backspace<Z> of(Consumer<Backspace<Z>> consumer) {
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
      return "backspace";
   }

   public final Backspace<Z> self() {
      return this;
   }
}
