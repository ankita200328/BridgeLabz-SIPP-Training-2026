package methods;

public class Level3 {
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];

        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];

        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        System.out.println("Player Heights:");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\nMean Height = " + findMean(heights));
        System.out.println("Shortest Height = " + findShortest(heights));
        System.out.println("Tallest Height = " + findTallest(heights));
    }


    2 QUESTION
    import java.util.Scanner;

    public class NumberChecker1 {

        static int countDigits(int number) {
            int count = 0;

            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        }

        static int[] storeDigits(int number) {

            int count = countDigits(number);
            int[] digits = new int[count];

            for (int i = count - 1; i >= 0; i--) {
                digits[i] = number % 10;
                number /= 10;
            }
            return digits;
        }

        static boolean isDuckNumber(int[] digits) {

            for (int i = 1; i < digits.length; i++) {
                if (digits[i] == 0)
                    return true;
            }
            return false;
        }

        static boolean isArmstrong(int number, int[] digits) {

            int sum = 0;

            for (int digit : digits) {
                sum += Math.pow(digit, digits.length);
            }

            return sum == number;
        }

        static int[] largestAndSecondLargest(int[] digits) {

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int digit : digits) {

                if (digit > largest) {
                    secondLargest = largest;
                    largest = digit;
                } else if (digit > secondLargest && digit != largest) {
                    secondLargest = digit;
                }
            }

            return new int[]{largest, secondLargest};
        }

        static int[] smallestAndSecondSmallest(int[] digits) {

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int digit : digits) {

                if (digit < smallest) {
                    secondSmallest = smallest;
                    smallest = digit;
                } else if (digit < secondSmallest && digit != smallest) {
                    secondSmallest = digit;
                }
            }

            return new int[]{smallest, secondSmallest};
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Number: ");
            int number = sc.nextInt();

            int[] digits = storeDigits(number);

            System.out.println("Duck Number: " + isDuckNumber(digits));
            System.out.println("Armstrong Number: " + isArmstrong(number, digits));

            int[] largest = largestAndSecondLargest(digits);
            int[] smallest = smallestAndSecondSmallest(digits);

            System.out.println("Largest = " + largest[0]);
            System.out.println("Second Largest = " + largest[1]);

            System.out.println("Smallest = " + smallest[0]);
            System.out.println("Second Smallest = " + smallest[1]);
        }
    }


    3
    QUESTION
    import java.util.Scanner;

    public class NumberChecker2 {

        static int countDigits(int number) {
            return String.valueOf(number).length();
        }

        static int[] storeDigits(int number) {

            int[] digits = new int[countDigits(number)];

            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i] = number % 10;
                number /= 10;
            }

            return digits;
        }

        static int sumDigits(int[] digits) {

            int sum = 0;

            for (int digit : digits) {
                sum += digit;
            }

            return sum;
        }

        static double sumSquares(int[] digits) {

            double sum = 0;

            for (int digit : digits) {
                sum += Math.pow(digit, 2);
            }

            return sum;
        }

        static boolean isHarshad(int number, int[] digits) {
            return number % sumDigits(digits) == 0;
        }

        static int[][] frequency(int[] digits) {

            int[][] freq = new int[10][2];

            for (int i = 0; i < 10; i++) {
                freq[i][0] = i;
            }

            for (int digit : digits) {
                freq[digit][1]++;
            }

            return freq;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int number = sc.nextInt();

            int[] digits = storeDigits(number);

            System.out.println("Sum = " + sumDigits(digits));
            System.out.println("Sum Squares = " + sumSquares(digits));
            System.out.println("Harshad Number = " + isHarshad(number, digits));

            int[][] freq = frequency(digits);

            for (int i = 0; i < 10; i++) {
                if (freq[i][1] > 0)
                    System.out.println(i + " -> " + freq[i][1]);
            }
        }
    }




    4 QUESTION
    import java.util.Scanner;

    public class NumberChecker3 {

        static int[] storeDigits(int number) {

            String str = String.valueOf(number);

            int[] digits = new int[str.length()];

            for (int i = 0; i < str.length(); i++) {
                digits[i] = str.charAt(i) - '0';
            }

            return digits;
        }

        static int[] reverseArray(int[] digits) {

            int[] reversed = new int[digits.length];

            for (int i = 0; i < digits.length; i++) {
                reversed[i] = digits[digits.length - 1 - i];
            }

            return reversed;
        }

        static boolean compareArrays(int[] a, int[] b) {

            if (a.length != b.length)
                return false;

            for (int i = 0; i < a.length; i++) {

                if (a[i] != b[i])
                    return false;
            }

            return true;
        }

        static boolean isPalindrome(int[] digits) {
            return compareArrays(digits, reverseArray(digits));
        }

        static boolean isDuckNumber(int[] digits) {

            for (int i = 1; i < digits.length; i++) {
                if (digits[i] == 0)
                    return true;
            }

            return false;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int number = sc.nextInt();

            int[] digits = storeDigits(number);

            System.out.println("Palindrome = " + isPalindrome(digits));
            System.out.println("Duck Number = " + isDuckNumber(digits));
        }
    }



    5 QUESTION
    public class NumberChecker4 {

        static boolean isPrime(int number) {

            if (number <= 1)
                return false;

            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0)
                    return false;
            }

            return true;
        }

        static boolean isNeon(int number) {

            int square = number * number;
            int sum = 0;

            while (square > 0) {
                sum += square % 10;
                square /= 10;
            }

            return sum == number;
        }

        static boolean isSpy(int number) {

            int sum = 0;
            int product = 1;

            while (number > 0) {

                int digit = number % 10;

                sum += digit;
                product *= digit;

                number /= 10;
            }

            return sum == product;
        }

        static boolean isAutomorphic(int number) {

            int square = number * number;

            return String.valueOf(square)
                    .endsWith(String.valueOf(number));
        }

        static boolean isBuzz(int number) {

            return number % 7 == 0 || number % 10 == 7;
        }
    }



    6 QUESTION
    public class NumberChecker5 {

        static int sumProperDivisors(int number) {

            int sum = 0;

            for (int i = 1; i < number; i++) {

                if (number % i == 0)
                    sum += i;
            }

            return sum;
        }

        static boolean isPerfect(int number) {
            return sumProperDivisors(number) == number;
        }

        static boolean isAbundant(int number) {
            return sumProperDivisors(number) > number;
        }

        static boolean isDeficient(int number) {
            return sumProperDivisors(number) < number;
        }

        static int factorial(int n) {

            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            return fact;
        }

        static boolean isStrong(int number) {

            int temp = number;
            int sum = 0;

            while (temp > 0) {

                sum += factorial(temp % 10);
                temp /= 10;
            }

            return sum == number;
        }
    }


    7 QUESTION
    import java.util.*;

    public class FactorsOperations {

        static int[] findFactors(int number) {

            int count = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    count++;
            }

            int[] factors = new int[count];
            int index = 0;

            for (int i = 1; i <= number; i++) {

                if (number % i == 0)
                    factors[index++] = i;
            }

            return factors;
        }

        static int greatestFactor(int[] factors) {
            return factors[factors.length - 1];
        }

        static int sumFactors(int[] factors) {

            int sum = 0;

            for (int factor : factors)
                sum += factor;

            return sum;
        }

        static long productFactors(int[] factors) {

            long product = 1;

            for (int factor : factors)
                product *= factor;

            return product;
        }

        static double productCubeFactors(int[] factors) {

            double product = 1;

            for (int factor : factors)
                product *= Math.pow(factor, 3);

            return product;
        }
    }




    8 QUESTION
    import java.util.Arrays;

    public class OTPGenerator {

        static int generateOTP() {
            return (int)(Math.random() * 900000) + 100000;
        }

        static boolean areUnique(int[] otpArray) {

            for (int i = 0; i < otpArray.length; i++) {

                for (int j = i + 1; j < otpArray.length; j++) {

                    if (otpArray[i] == otpArray[j])
                        return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            int[] otpArray = new int[10];

            for (int i = 0; i < 10; i++) {
                otpArray[i] = generateOTP();
            }

            System.out.println("Generated OTPs:");

            for (int otp : otpArray) {
                System.out.println(otp);
            }

            System.out.println("All OTPs Unique: " +
                    areUnique(otpArray));
        }
    }

}
