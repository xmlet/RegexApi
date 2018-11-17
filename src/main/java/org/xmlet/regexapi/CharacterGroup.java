package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class CharacterGroup<Z extends Element> implements CustomAttributeGroup<CharacterGroup<Z>, Z>, MatchingOperationsAll1<CharacterGroup<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CharacterGroup(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCharacterGroup(this);
   }

   public CharacterGroup(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCharacterGroup(this);
   }

   protected CharacterGroup(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCharacterGroup(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCharacterGroup(this);
      return this.parent;
   }

   public final CharacterGroup<Z> dynamic(Consumer<CharacterGroup<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CharacterGroup<Z> of(Consumer<CharacterGroup<Z>> consumer) {
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
      return "characterGroup";
   }

   public final CharacterGroup<Z> self() {
      return this;
   }

   public final CharacterGroup<Z> attrCharGroup(String attrCharGroup) {
      this.visitor.visitAttributeCharGroup(attrCharGroup);
      return this;
   }
}
