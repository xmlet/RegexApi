package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Bell<Z extends Element> implements CustomAttributeGroup<Bell<Z>, Z>, MatchingOperationsAll1<Bell<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Bell(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBell(this);
   }

   public Bell(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBell(this);
   }

   protected Bell(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBell(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBell(this);
      return this.parent;
   }

   public final Bell<Z> dynamic(Consumer<Bell<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Bell<Z> of(Consumer<Bell<Z>> consumer) {
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
      return "bell";
   }

   public final Bell<Z> self() {
      return this;
   }
}
