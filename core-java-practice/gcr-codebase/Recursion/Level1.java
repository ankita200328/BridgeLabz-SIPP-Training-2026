package Recursion;

public class Level1 {
    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }

}


2 QUESTION
public class Factorial {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

3 QUESTION
public class SumNaturalNumbers {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

4 QUESTION
public class ReverseString {
    static String reverse(String str) {
        if (str.isEmpty()) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}



5 QUESTION
public class Palindrome {
    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


6 QUESTION

public class Fibonacci {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}


7 QUESTION
public class Power {
    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}


8 QUESTION
import java.util.ArrayList;

public class Subsets {

    static void generateSubsets(int[] arr, int index,
                                ArrayList<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Exclude current element
        generateSubsets(arr, index + 1, current);

        // Include current element
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);

        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        generateSubsets(arr, 0, new ArrayList<>());
    }
}

