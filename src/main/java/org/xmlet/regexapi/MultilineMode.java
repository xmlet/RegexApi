package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MultilineMode<Z extends Element> implements CustomAttributeGroup<MultilineMode<Z>, Z>, TextGroup<MultilineMode<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MultilineMode(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMultilineMode(this);
   }

   public MultilineMode(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMultilineMode(this);
   }

   protected MultilineMode(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMultilineMode(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMultilineMode(this);
      return this.parent;
   }

   public final MultilineMode<Z> dynamic(Consumer<MultilineMode<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MultilineMode<Z> of(Consumer<MultilineMode<Z>> consumer) {
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
      return "multilineMode";
   }

   public final MultilineMode<Z> self() {
      return this;
   }
}
