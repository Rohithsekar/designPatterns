package strategy.movement_behaviours;

import strategy.abstract_constructs.MovementBehaviour;

public class AllRoundExceptL implements MovementBehaviour {
    @Override
    public void move() {
        System.out.println("Moves all around except in the L pattern");
    }
}
