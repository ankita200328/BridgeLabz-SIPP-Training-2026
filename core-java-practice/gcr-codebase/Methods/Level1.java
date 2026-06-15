package methods;

public class Level1 {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}


2 QUESTION
import java.util.Scanner;

public class Handshakes {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("Maximum possible handshakes: " +
                calculateHandshakes(n));
    }
}

3 QUESTION
public class AthleteRun {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        System.out.println("Rounds required: " +
                calculateRounds(side1, side2, side3));
    }
}

4 QUESTION
import java.util.Scanner;

public class NumberCheck {

    public static int checkNumber(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = checkNumber(num);

        if (result == 1)
            System.out.println("Positive Number");
        else if (result == -1)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }
}

5 QUESTION
import java.util.Scanner;

public class SpringSeason {

    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        if (isSpringSeason(month, day))
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}


6 QUESTION
import java.util.Scanner;

public class SumNaturalNumbers {

    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + findSum(n));
    }
}


7 QUESTION
import java.util.Scanner;

public class SmallestLargest {

    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {

        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        int[] result = findSmallestAndLargest(n1, n2, n3);

        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
    }
}


8 QUESTION
import java.util.Scanner;

public class QuotientRemainder {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient = " + result[0]);
        System.out.println("Remainder = " + result[1]);
    }
}


9 QUESTION
import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int eachChildGets = chocolates / children;
        int remaining = chocolates % children;

        return new int[]{eachChildGets, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets = " + result[0]);
        System.out.println("Remaining chocolates = " + result[1]);
    }
}


10 QUESTION
import java.util.Scanner;

public class WindChill {

    public static double calculateWindChill(double temperature, double windSpeed) {

        return 35.74 + (0.6215 * temperature)
                - (35.75 * Math.pow(windSpeed, 0.16))
                + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = sc.nextDouble();

        System.out.println("Wind Chill Temperature = " +
                calculateWindChill(temperature, windSpeed));
    }
}

11 QUESTION
import java.util.Scanner;

public class TrigonometricFunctions {

    public static double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + result[0]);
        System.out.println("Cos = " + result[1]);
        System.out.println("Tan = " + result[2]);
    }
}
