package Strings.Level1;

public class Level2 {
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using charAt(): " + userLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}


2 QUESTION
public class SplitWordsDemo {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {

        int length = findLength(text);

        int words = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= length; i++) {

            if (i == length || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                result[index++] = word;
                start = i + 1;
            }
        }

        return result;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {

            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Arrays Same : " +
                compareArrays(userWords, builtInWords));

        sc.close();
    }
}

3 QUESTION
public class WordLength2D {

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {

        int length = findLength(text);

        int words = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= length; i++) {

            if (i == length || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                result[index++] = word;
                start = i + 1;
            }
        }

        return result;
    }

    public static String[][] wordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void display(String[][] arr) {

        System.out.println("Word\t\tLength");

        for (int i = 0; i < arr.length; i++) {

            int len = Integer.parseInt(arr[i][1]);

            System.out.println(arr[i][0] + "\t\t" + len);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = wordLengthArray(words);

        display(result);

        sc.close();
    }
}

4 QUESTION
public class ShortestLongestWord {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (i == text.length() || text.charAt(i) == ' ') {

                String word = "";

                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }

                result[index++] = word;
                start = i + 1;
            }
        }

        return result;
    }

    public static String[][] wordLengthArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static int[] shortestLongest(String[][] arr) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < arr.length; i++) {

            int len = Integer.parseInt(arr[i][1]);

            if (len < Integer.parseInt(arr[shortest][1])) {
                shortest = i;
            }

            if (len > Integer.parseInt(arr[longest][1])) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = wordLengthArray(words);

        int[] result = shortestLongest(data);

        System.out.println("Shortest Word : " + data[result[0]][0]);
        System.out.println("Longest Word  : " + data[result[1]][0]);

        sc.close();
    }
}

5 QUESTION
public class VowelConsonantCount {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            }

            return "Consonant";
        }

        return "Not a Letter";
    }

    public static int[] countVC(String text) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            String type = checkCharacter(text.charAt(i));

            if (type.equals("Vowel")) {
                vowels++;
            }
            else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        int[] result = countVC(text);

        System.out.println("Vowels     : " + result[0]);
        System.out.println("Consonants : " + result[1]);

        sc.close();
    }
}


6 QUESTION
public class CharacterType {

    public static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            }

            return "Consonant";
        }

        return "Not a Letter";
    }

    public static String[][] getCharacterTypes(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacter(text.charAt(i));
        }

        return result;
    }

    public static void display(String[][] arr) {

        System.out.println("Character\tType");

        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] result = getCharacterTypes(text);

        display(result);

        sc.close();
    }
}


7 QUESTION
public class TrimString {

    public static int[] trimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() &&
                text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 &&
                text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substring(String text,
                                   int start,
                                   int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compare(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);

        String userTrim =
                substring(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();

        System.out.println("User Trim   : " + userTrim);
        System.out.println("Built-in    : " + builtInTrim);

        System.out.println("Same Result : "
                + compare(userTrim, builtInTrim));

        sc.close();
    }
}

8 QUESTION
public class VotingEligibility {

    public static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void display(String[][] arr) {

        System.out.println("Age\tCan Vote");

        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter age of student "
                    + (i + 1) + ": ");

            ages[i] = sc.nextInt();
        }

        String[][] result = checkVoting(ages);

        display(result);

        sc.close();
    }
}


9 QUESTION
public class RockPaperScissors {

    public static String computerChoice() {

        int choice = (int)(Math.random() * 3);

        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";

        return "Scissors";
    }

    public static String winner(String user,
                                String computer) {

        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if ((user.equalsIgnoreCase("Rock")
                && computer.equals("Scissors"))
                ||
                (user.equalsIgnoreCase("Paper")
                        && computer.equals("Rock"))
                ||
                (user.equalsIgnoreCase("Scissors")
                        && computer.equals("Paper"))) {

            return "User";
        }

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0;
        int computerWins = 0;

        System.out.println("\nGame\tUser\tComputer\tWinner");

        for (int i = 1; i <= games; i++) {

            System.out.print("\nEnter Rock/Paper/Scissors: ");
            String user = sc.next();

            String computer = computerChoice();

            String result = winner(user, computer);

            if (result.equals("User")) {
                userWins++;
            }
            else if (result.equals("Computer")) {
                computerWins++;
            }

            System.out.println(i + "\t" + user
                    + "\t" + computer
                    + "\t\t" + result);
        }

        double userPercent =
                (userWins * 100.0) / games;

        double computerPercent =
                (computerWins * 100.0) / games;

        System.out.println("\n----- Statistics -----");

        System.out.println("User Wins      : "
                + userWins);

        System.out.println("Computer Wins  : "
                + computerWins);

        System.out.printf("User %%        : %.2f%%\n",
                userPercent);

        System.out.printf("Computer %%    : %.2f%%\n",
                computerPercent);

        sc.close();
    }
}


