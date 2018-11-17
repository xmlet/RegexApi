package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class UnicodeNotBlock<Z extends Element> implements CustomAttributeGroup<UnicodeNotBlock<Z>, Z>, MatchingOperationsAll1<UnicodeNotBlock<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public UnicodeNotBlock(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementUnicodeNotBlock(this);
   }

   public UnicodeNotBlock(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementUnicodeNotBlock(this);
   }

   protected UnicodeNotBlock(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementUnicodeNotBlock(this);
      }

   }

   public Z __() {
      this.visitor.visitParentUnicodeNotBlock(this);
      return this.parent;
   }

   public final UnicodeNotBlock<Z> dynamic(Consumer<UnicodeNotBlock<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final UnicodeNotBlock<Z> of(Consumer<UnicodeNotBlock<Z>> consumer) {
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
      return "unicodeNotBlock";
   }

   public final UnicodeNotBlock<Z> self() {
      return this;
   }

   public final UnicodeNotBlock<Z> attrBlock(String attrBlock) {
      this.visitor.visitAttributeBlock(attrBlock);
      return this;
   }
}
