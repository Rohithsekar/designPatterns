import strategy.abstract_constructs.Character;
import strategy.characters.King;
import strategy.movement_behaviours.Diagonal;
import strategy.weapon_behaviours.SpearBehaviour;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Character character = new King();

        character.fight();
        character.move();

        //As character instance is not rigidly(tightly) coupled to any particular behaviour implementation,
        //we can set it to whatever specific behaviour we want at runtime.
        character.setWeapon(new SpearBehaviour());
        character.fight();

        character.setMovement(new Diagonal());
        character.move();
    }
}