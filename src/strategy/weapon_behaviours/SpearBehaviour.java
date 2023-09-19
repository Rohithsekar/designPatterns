package strategy.weapon_behaviours;

import strategy.abstract_constructs.WeaponBehaviour;

public class SpearBehaviour implements WeaponBehaviour {

    @Override
    public void useWeapon() {
        System.out.println("Charge with a spear");
    }
}
