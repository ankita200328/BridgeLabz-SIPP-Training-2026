package methods;

public class Level2 {
    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nSum = " + findSum(factors));
        System.out.println("Product = " + findProduct(factors));
        System.out.println("Sum of Squares = " + findSumOfSquares(factors));
    }
}

2 QUESTION
import java.util.Scanner;

public class RecursiveSum {

    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;

        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int recursionResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Recursion Sum = " + recursionResult);
        System.out.println("Formula Sum = " + formulaResult);

        if (recursionResult == formulaResult) {
            System.out.println("Both results are correct.");
        }
    }
}

3 QUESTION

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1582)
            return false;

        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (isLeapYear(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}



4 QUESTION
public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {

        System.out.println("10 Km = " + convertKmToMiles(10) + " Miles");
        System.out.println("10 Miles = " + convertMilesToKm(10) + " Km");
        System.out.println("10 Meters = " + convertMetersToFeet(10) + " Feet");
        System.out.println("10 Feet = " + convertFeetToMeters(10) + " Meters");
    }
}


5 QUESTION
public class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {

        System.out.println("5 Yards = " + convertYardsToFeet(5) + " Feet");
        System.out.println("15 Feet = " + convertFeetToYards(15) + " Yards");
        System.out.println("2 Meters = " + convertMetersToInches(2) + " Inches");
        System.out.println("20 Inches = " + convertInchesToMeters(20) + " Meters");
        System.out.println("20 Inches = " + convertInchesToCm(20) + " Cm");
    }
}


6 QUESTION
public class UnitConverter3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        System.out.println("100°F = " +
                convertFahrenheitToCelsius(100) + "°C");

        System.out.println("37°C = " +
                convertCelsiusToFahrenheit(37) + "°F");

        System.out.println("10 Pounds = " +
                convertPoundsToKilograms(10) + " Kg");

        System.out.println("10 Kg = " +
                convertKilogramsToPounds(10) + " Pounds");

        System.out.println("5 Gallons = " +
                convertGallonsToLiters(5) + " Liters");

        System.out.println("10 Liters = " +
                convertLitersToGallons(10) + " Gallons");
    }
}



7 QUESTION
import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {

        if (age < 0)
            return false;

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (checker.canStudentVote(ages[i]))
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
    }
}


8 QUESTION
import java.util.Scanner;

public class FriendsInfo {

    public static String findYoungest(int[] ages, String[] names) {

        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }

        return names[minIndex];
    }

    public static String findTallest(double[] heights, String[] names) {

        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }

        return names[maxIndex];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest Friend: " +
                findYoungest(ages, names));

        System.out.println("Tallest Friend: " +
                findTallest(heights, names));
    }
}


9 QUESTION
import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {

        if (number1 > number2)
            return 1;
        else if (number1 == number2)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int number : numbers) {

            if (isPositive(number)) {

                if (isEven(number))
                    System.out.println(number + " is Positive Even");
                else
                    System.out.println(number + " is Positive Odd");

            } else {
                System.out.println(number + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        if (result == 1)
            System.out.println("First element is Greater");
        else if (result == 0)
            System.out.println("First and Last elements are Equal");
        else
            System.out.println("First element is Smaller");
    }
}
