package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NoUnnamedModes<Z extends Element> implements CustomAttributeGroup<NoUnnamedModes<Z>, Z>, TextGroup<NoUnnamedModes<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NoUnnamedModes(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNoUnnamedModes(this);
   }

   public NoUnnamedModes(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNoUnnamedModes(this);
   }

   protected NoUnnamedModes(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNoUnnamedModes(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNoUnnamedModes(this);
      return this.parent;
   }

   public final NoUnnamedModes<Z> dynamic(Consumer<NoUnnamedModes<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NoUnnamedModes<Z> of(Consumer<NoUnnamedModes<Z>> consumer) {
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
      return "noUnnamedModes";
   }

   public final NoUnnamedModes<Z> self() {
      return this;
   }
}
