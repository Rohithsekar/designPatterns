package strategy.weapon_behaviours;

import strategy.abstract_constructs.WeaponBehaviour;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Shoots arrow from the bow");
    }
}
