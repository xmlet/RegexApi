package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class SingleLineMode<Z extends Element> implements CustomAttributeGroup<SingleLineMode<Z>, Z>, TextGroup<SingleLineMode<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public SingleLineMode(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementSingleLineMode(this);
   }

   public SingleLineMode(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementSingleLineMode(this);
   }

   protected SingleLineMode(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementSingleLineMode(this);
      }

   }

   public Z __() {
      this.visitor.visitParentSingleLineMode(this);
      return this.parent;
   }

   public final SingleLineMode<Z> dynamic(Consumer<SingleLineMode<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final SingleLineMode<Z> of(Consumer<SingleLineMode<Z>> consumer) {
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
      return "singleLineMode";
   }

   public final SingleLineMode<Z> self() {
      return this;
   }
}
