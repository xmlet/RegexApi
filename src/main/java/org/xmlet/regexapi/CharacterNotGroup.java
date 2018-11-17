package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class CharacterNotGroup<Z extends Element> implements CustomAttributeGroup<CharacterNotGroup<Z>, Z>, MatchingOperationsAll1<CharacterNotGroup<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CharacterNotGroup(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCharacterNotGroup(this);
   }

   public CharacterNotGroup(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCharacterNotGroup(this);
   }

   protected CharacterNotGroup(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCharacterNotGroup(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCharacterNotGroup(this);
      return this.parent;
   }

   public final CharacterNotGroup<Z> dynamic(Consumer<CharacterNotGroup<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CharacterNotGroup<Z> of(Consumer<CharacterNotGroup<Z>> consumer) {
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
      return "characterNotGroup";
   }

   public final CharacterNotGroup<Z> self() {
      return this;
   }

   public final CharacterNotGroup<Z> attrCharGroup(String attrCharGroup) {
      this.visitor.visitAttributeCharGroup(attrCharGroup);
      return this;
   }
}
