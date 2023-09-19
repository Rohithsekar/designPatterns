package strategy.movement_behaviours;

import strategy.abstract_constructs.MovementBehaviour;

public class LMovement implements MovementBehaviour {
    @Override
    public void move() {
        System.out.println("Moves in a L pattern.");
    }
}
