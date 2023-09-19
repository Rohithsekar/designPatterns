package strategy.characters;

import strategy.movement_behaviours.Diagonal;
import strategy.weapon_behaviours.BowAndArrowBehaviour;
import strategy.abstract_constructs.Character;


public class Bishop extends Character {

    public Bishop() {
        /**
         When you put two classes together like this, you're using composition.Instead of inheriting
         their behaviour, the characters get their behaviour by being composed with the right behaviour object.
         */
        weapon = new BowAndArrowBehaviour();
        movement = new Diagonal();
    }


}
