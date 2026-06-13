package Strings.Level1;

public class Level3 {

}

2 QUESTION
public class UniqueCharacters {

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

    public static char[] uniqueCharacters(String text) {

        int len = findLength(text);

        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {

            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);

        System.out.print("Unique Characters: ");

        for (char ch : unique) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}

3 QUESTION
public class FirstNonRepeating {

    public static char firstNonRepeating(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {

            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        char result = firstNonRepeating(text);

        if (result != '\0') {
            System.out.println(
                    "First Non-Repeating Character: "
                            + result);
        } else {
            System.out.println(
                    "No Non-Repeating Character Found");
        }

        sc.close();
    }
}

4 QUESTION
public class CharacterFrequency {

    public static String[][] frequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int unique = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                unique++;
            }
        }

        String[][] result = new String[unique][2];

        int index = 0;

        for (int i = 0; i < 256; i++) {

            if (freq[i] > 0) {

                result[index][0] =
                        String.valueOf((char) i);

                result[index][1] =
                        String.valueOf(freq[i]);

                index++;
            }
        }

        return result;
    }

    public static void display(String[][] arr) {

        System.out.println("Character\tFrequency");

        for (String[] row : arr) {
            System.out.println(
                    row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] result = frequency(text);

        display(result);

        sc.close();
    }
}


5 QUESTION
public class FrequencyUsingUnique {

    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean unique = true;

            for (int j = 0; j < count; j++) {

                if (temp[j] == text.charAt(i)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[count++] = text.charAt(i);
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] frequency(String text) {

        char[] unique = uniqueCharacters(text);

        String[][] result =
                new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            int count = 0;

            for (int j = 0; j < text.length(); j++) {

                if (unique[i] == text.charAt(j)) {
                    count++;
                }
            }

            result[i][0] =
                    String.valueOf(unique[i]);

            result[i][1] =
                    String.valueOf(count);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[][] result = frequency(text);

        System.out.println("Character\tFrequency");

        for (String[] row : result) {
            System.out.println(
                    row[0] + "\t\t" + row[1]);
        }

        sc.close();
    }
}

6 QUESTION
public class FrequencyNestedLoop {

    public static void frequency(String text) {

        char[] chars = text.toCharArray();

        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            freq[i] = 1;

            for (int j = i + 1;
                 j < chars.length;
                 j++) {

                if (chars[i] == chars[j]
                        && chars[i] != '0') {

                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        System.out.println(
                "Character\tFrequency");

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {

                System.out.println(
                        chars[i] + "\t\t"
                                + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        frequency(text);

        sc.close();
    }
}


7 QUESTION
public class PalindromeDemo {

    // Method 1
    public static boolean palindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start)
                    != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method 2
    public static boolean palindromeRecursion(
            String text,
            int start,
            int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start)
                != text.charAt(end)) {
            return false;
        }

        return palindromeRecursion(
                text,
                start + 1,
                end - 1);
    }

    // Method 3
    public static char[] reverse(String text) {

        char[] rev =
                new char[text.length()];

        int index = 0;

        for (int i = text.length() - 1;
             i >= 0;
             i--) {

            rev[index++] =
                    text.charAt(i);
        }

        return rev;
    }

    public static boolean palindromeArray(
            String text) {

        char[] original =
                text.toCharArray();

        char[] reverse =
                reverse(text);

        for (int i = 0;
             i < original.length;
             i++) {

            if (original[i]
                    != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.next();

        System.out.println(
                "Method 1: "
                        + palindromeLoop(text));

        System.out.println(
                "Method 2: "
                        + palindromeRecursion(
                        text,
                        0,
                        text.length() - 1));

        System.out.println(
                "Method 3: "
                        + palindromeArray(text));

        sc.close();
    }
}

8 QUESTION
public class AnagramCheck {

    public static boolean isAnagram(
            String text1,
            String text2) {

        if (text1.length()
                != text2.length()) {
            return false;
        }

        int[] freq = new int[256];

        for (int i = 0;
             i < text1.length();
             i++) {

            freq[text1.charAt(i)]++;
            freq[text2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {

            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter First Text: ");
        String text1 = sc.next();

        System.out.print(
                "Enter Second Text: ");
        String text2 = sc.next();

        if (isAnagram(text1, text2)) {
            System.out.println(
                    "Strings are Anagrams");
        } else {
            System.out.println(
                    "Strings are Not Anagrams");
        }

        sc.close();
    }
}

