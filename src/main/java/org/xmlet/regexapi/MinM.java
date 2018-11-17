package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MinM<Z extends Element> implements CustomAttributeGroup<MinM<Z>, Z>, TextGroup<MinM<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinM(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMinM(this);
   }

   public MinM(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMinM(this);
   }

   protected MinM(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMinM(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMinM(this);
      return this.parent;
   }

   public final MinM<Z> dynamic(Consumer<MinM<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinM<Z> of(Consumer<MinM<Z>> consumer) {
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
      return "minM";
   }

   public final MinM<Z> self() {
      return this;
   }
}
