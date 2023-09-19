package strategy.weapon_behaviours;

import strategy.abstract_constructs.WeaponBehaviour;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("uses sword to cut");
    }
}
