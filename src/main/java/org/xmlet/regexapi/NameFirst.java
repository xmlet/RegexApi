package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NameFirst<Z extends Element> implements CustomAttributeGroup<NameFirst<Z>, Z>, TextGroup<NameFirst<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NameFirst(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNameFirst(this);
   }

   public NameFirst(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNameFirst(this);
   }

   protected NameFirst(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNameFirst(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNameFirst(this);
      return this.parent;
   }

   public final NameFirst<Z> dynamic(Consumer<NameFirst<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NameFirst<Z> of(Consumer<NameFirst<Z>> consumer) {
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
      return "nameFirst";
   }

   public final NameFirst<Z> self() {
      return this;
   }
}
