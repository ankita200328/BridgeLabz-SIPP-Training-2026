package AdventureGameCharacter;

public class GameDemo {
    static void startBattle(GameCharacter[] characters) {

        int warriors = 0;
        int mages = 0;
        int archers = 0;

        System.out.println("Battle Started\n");

        for (GameCharacter c : characters) {

            c.performAttack();

            if (c instanceof Warrior)
                warriors++;
            else if (c instanceof Mage)
                mages++;
            else if (c instanceof Archer)
                archers++;
        }

        System.out.println("\nParticipants:");
        System.out.println("Warriors : " + warriors);
        System.out.println("Mages    : " + mages);
        System.out.println("Archers  : " + archers);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Arjun"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Thor")
        };

        startBattle(characters);
    }

}
