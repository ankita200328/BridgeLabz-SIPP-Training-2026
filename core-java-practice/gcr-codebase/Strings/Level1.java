package Strings.Level1;

public class Level1 {
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean userResult = compareStrings(str1, str2);
        boolean builtInResult = str1.equals(str2);

        System.out.println("Using charAt(): " + userResult);
        System.out.println("Using equals(): " + builtInResult);
        System.out.println("Results same? " + (userResult == builtInResult));

        sc.close();
    }
}

2 QUESTION
public class SubstringDemo {

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String userSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("User Substring: " + userSub);
        System.out.println("Built-in Substring: " + builtInSub);

        System.out.println("Equal? " +
                compareStrings(userSub, builtInSub));

        sc.close();
    }
}


3 QUESTION
public class CharacterArrayDemo {

    public static char[] getCharacters(String text) {
        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }

        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Arrays Same? " +
                compareArrays(userArray, builtInArray));

        sc.close();
    }
}


4 QUESTION
public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        // generateException();

        handleException();
    }
}


5 QUESTION
public class StringIndexDemo {

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);

        sc.close();
    }
}


6 QUESTION
public class IllegalArgumentDemo {

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);

        sc.close();
    }
}


7 QUESTION
public class NumberFormatDemo {

    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);

        sc.close();
    }
}



8 QUESTION
public class ArrayIndexDemo {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e);
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        // generateException(names);

        handleException(names);

        sc.close();
    }
}


9 QUESTION
public class UpperCaseDemo {

    public static String convertToUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

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

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("User Uppercase: " + userUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        System.out.println("Same Result? " +
                compareStrings(userUpper, builtInUpper));

        sc.close();
    }
}


10 QUESTION
public class LowerCaseDemo {

    public static String convertToLower(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result += ch;
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

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

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userLower = convertToLower(text);
        String builtInLower = text.toLowerCase();

        System.out.println("User Lowercase: " + userLower);
        System.out.println("Built-in Lowercase: " + builtInLower);

        System.out.println("Same Result? " +
                compareStrings(userLower, builtInLower));

        sc.close();
    }
}
