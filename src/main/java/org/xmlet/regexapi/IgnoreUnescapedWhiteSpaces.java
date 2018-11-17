package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class IgnoreUnescapedWhiteSpaces<Z extends Element> implements CustomAttributeGroup<IgnoreUnescapedWhiteSpaces<Z>, Z>, TextGroup<IgnoreUnescapedWhiteSpaces<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IgnoreUnescapedWhiteSpaces(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementIgnoreUnescapedWhiteSpaces(this);
   }

   public IgnoreUnescapedWhiteSpaces(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementIgnoreUnescapedWhiteSpaces(this);
   }

   protected IgnoreUnescapedWhiteSpaces(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementIgnoreUnescapedWhiteSpaces(this);
      }

   }

   public Z __() {
      this.visitor.visitParentIgnoreUnescapedWhiteSpaces(this);
      return this.parent;
   }

   public final IgnoreUnescapedWhiteSpaces<Z> dynamic(Consumer<IgnoreUnescapedWhiteSpaces<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IgnoreUnescapedWhiteSpaces<Z> of(Consumer<IgnoreUnescapedWhiteSpaces<Z>> consumer) {
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
      return "ignoreUnescapedWhiteSpaces";
   }

   public final IgnoreUnescapedWhiteSpaces<Z> self() {
      return this;
   }
}
