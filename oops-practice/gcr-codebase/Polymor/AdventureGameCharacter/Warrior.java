package AdventureGameCharacter;

public class Warrior extends GameCharacter {
    Warrior(String name) {
        super(name);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " attacks with Sword.");
    }

}
