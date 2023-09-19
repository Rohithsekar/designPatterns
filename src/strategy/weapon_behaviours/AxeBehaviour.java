package strategy.weapon_behaviours;

import strategy.abstract_constructs.WeaponBehaviour;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Chop with the axe");
    }
}
