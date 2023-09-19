package strategy.abstract_constructs;

public abstract class Character {

    /**
     * The HAS-A relationship is an interesting one: each character object has a weapon behaviour(weapon)
     * and movement behaviour(movement) to which it delegates weilding weapon and moving respectively.
     */

    protected WeaponBehaviour weapon;

    protected MovementBehaviour movement;

    public void fight(){
        weapon.useWeapon();
    }

    public void move(){
        movement.move();
    }

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }

    public void setMovement(MovementBehaviour movement) {
        this.movement = movement;
    }
}
