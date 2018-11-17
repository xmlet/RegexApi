package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class CaseInsensitive<Z extends Element> implements CustomAttributeGroup<CaseInsensitive<Z>, Z>, TextGroup<CaseInsensitive<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CaseInsensitive(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCaseInsensitive(this);
   }

   public CaseInsensitive(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCaseInsensitive(this);
   }

   protected CaseInsensitive(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCaseInsensitive(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCaseInsensitive(this);
      return this.parent;
   }

   public final CaseInsensitive<Z> dynamic(Consumer<CaseInsensitive<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CaseInsensitive<Z> of(Consumer<CaseInsensitive<Z>> consumer) {
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
      return "caseInsensitive";
   }

   public final CaseInsensitive<Z> self() {
      return this;
   }
}
