package AdventureGameCharacter;

public class Mage extends GameCharacter{
    Mage(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " casts Fireball.");
    }
}
