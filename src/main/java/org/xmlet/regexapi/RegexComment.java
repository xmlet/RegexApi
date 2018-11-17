package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class RegexComment<Z extends Element> implements CustomAttributeGroup<RegexComment<Z>, Z>, MatchingOperationsAll1<RegexComment<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RegexComment(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRegexComment(this);
   }

   public RegexComment(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRegexComment(this);
   }

   protected RegexComment(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRegexComment(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRegexComment(this);
      return this.parent;
   }

   public final RegexComment<Z> dynamic(Consumer<RegexComment<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RegexComment<Z> of(Consumer<RegexComment<Z>> consumer) {
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
      return "regexComment";
   }

   public final RegexComment<Z> self() {
      return this;
   }

   public final RegexComment<Z> attrComment(String attrComment) {
      this.visitor.visitAttributeComment(attrComment);
      return this;
   }
}
