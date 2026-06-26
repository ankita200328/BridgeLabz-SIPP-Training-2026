package AdventureGameCharacter;

public class Archer extends GameCharacter {
    Archer(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " shoots Arrow.");
    }

}
