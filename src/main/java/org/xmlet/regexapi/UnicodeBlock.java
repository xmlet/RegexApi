package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class UnicodeBlock<Z extends Element> implements CustomAttributeGroup<UnicodeBlock<Z>, Z>, MatchingOperationsAll1<UnicodeBlock<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public UnicodeBlock(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementUnicodeBlock(this);
   }

   public UnicodeBlock(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementUnicodeBlock(this);
   }

   protected UnicodeBlock(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementUnicodeBlock(this);
      }

   }

   public Z __() {
      this.visitor.visitParentUnicodeBlock(this);
      return this.parent;
   }

   public final UnicodeBlock<Z> dynamic(Consumer<UnicodeBlock<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final UnicodeBlock<Z> of(Consumer<UnicodeBlock<Z>> consumer) {
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
      return "unicodeBlock";
   }

   public final UnicodeBlock<Z> self() {
      return this;
   }

   public final UnicodeBlock<Z> attrBlock(String attrBlock) {
      this.visitor.visitAttributeBlock(attrBlock);
      return this;
   }
}
