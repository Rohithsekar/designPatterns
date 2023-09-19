package strategy.characters;

import strategy.movement_behaviours.LMovement;
import strategy.weapon_behaviours.AxeBehaviour;
import strategy.abstract_constructs.Character;

public class Knight extends Character {

    public Knight() {
        /**
         When you put two classes together like this, you're using composition.Instead of inheriting
         their behaviour, the characters get their behaviour by being composed with the right behaviour object.
         */
        weapon = new AxeBehaviour();
        movement = new LMovement();
    }
}
