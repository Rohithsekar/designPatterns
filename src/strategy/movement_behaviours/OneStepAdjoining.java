package strategy.movement_behaviours;

import strategy.abstract_constructs.MovementBehaviour;

public class OneStepAdjoining implements MovementBehaviour {

    @Override
    public void move() {
        System.out.println("Moves one step in all neighbouring directions");
    }
}
