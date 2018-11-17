package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class RegexLineComment<Z extends Element> implements CustomAttributeGroup<RegexLineComment<Z>, Z>, MatchingOperationsAll1<RegexLineComment<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public RegexLineComment(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementRegexLineComment(this);
   }

   public RegexLineComment(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementRegexLineComment(this);
   }

   protected RegexLineComment(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementRegexLineComment(this);
      }

   }

   public Z __() {
      this.visitor.visitParentRegexLineComment(this);
      return this.parent;
   }

   public final RegexLineComment<Z> dynamic(Consumer<RegexLineComment<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final RegexLineComment<Z> of(Consumer<RegexLineComment<Z>> consumer) {
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
      return "regexLineComment";
   }

   public final RegexLineComment<Z> self() {
      return this;
   }

   public final RegexLineComment<Z> attrComment(String attrComment) {
      this.visitor.visitAttributeComment(attrComment);
      return this;
   }
}
