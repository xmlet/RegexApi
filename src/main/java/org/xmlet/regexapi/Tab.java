package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Tab<Z extends Element> implements CustomAttributeGroup<Tab<Z>, Z>, MatchingOperationsAll1<Tab<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Tab(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementTab(this);
   }

   public Tab(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementTab(this);
   }

   protected Tab(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementTab(this);
      }

   }

   public Z __() {
      this.visitor.visitParentTab(this);
      return this.parent;
   }

   public final Tab<Z> dynamic(Consumer<Tab<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Tab<Z> of(Consumer<Tab<Z>> consumer) {
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
      return "tab";
   }

   public final Tab<Z> self() {
      return this;
   }
}
