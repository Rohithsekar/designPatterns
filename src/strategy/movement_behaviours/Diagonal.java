package strategy.movement_behaviours;

import strategy.abstract_constructs.MovementBehaviour;

public class Diagonal implements MovementBehaviour {

    @Override
    public void move() {
        System.out.println("Moves diagonally");
    }
}
