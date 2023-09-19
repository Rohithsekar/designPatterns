package strategy.characters;

import strategy.abstract_constructs.Character;
import strategy.movement_behaviours.AllRoundExceptL;
import strategy.weapon_behaviours.SpearBehaviour;

public class Queen extends Character {

    public Queen() {
        /**
         When you put two classes together like this, you're using composition.Instead of inheriting
         their behaviour, the characters get their behaviour by being composed with the right behaviour object.
         */
        weapon = new SpearBehaviour();
        movement = new AllRoundExceptL();
    }


}
