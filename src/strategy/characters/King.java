package strategy.characters;

import strategy.abstract_constructs.Character;
import strategy.movement_behaviours.OneStepAdjoining;
import strategy.weapon_behaviours.SwordBehaviour;

public class King extends Character {

    public King() {
        /**
        When you put two classes together like this, you're using composition.Instead of inheriting
         their behaviour, the characters get their behaviour by being composed with the right behaviour object.
         */
        weapon = new SwordBehaviour();
        movement = new OneStepAdjoining();
    }



}
