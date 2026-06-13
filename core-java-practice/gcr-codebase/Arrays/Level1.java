package Arrays;

public class Level1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility:");

        for (int age : ages) {

            if (age < 0) {
                System.out.println("Invalid Age: " + age);
            }
            else if (age >= 18) {
                System.out.println("Student with age " + age + " can vote.");
            }
            else {
                System.out.println("Student with age " + age + " cannot vote.");
            }
        }

        sc.close();
    }
}


2QUESTION
public class NumberAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {

            if (num > 0) {

                if (num % 2 == 0) {
                    System.out.println(num + " is Positive Even");
                } else {
                    System.out.println(num + " is Positive Odd");
                }

            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater.");
        }
        else if (numbers[0] < numbers[4]) {
            System.out.println("Last element is greater.");
        }
        else {
            System.out.println("Both elements are equal.");
        }

        sc.close();
    }
}

3 QUESTION
public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        System.out.println("\nMultiplication Table:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i +
                    " = " + table[i - 1]);
        }

        sc.close();
    }
}

4 QUESTION
public class StoreNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;

        int index = 0;

        while (true) {

            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("\nNumbers Entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total Sum = " + total);

        sc.close();
    }
}

5 QUESTION
public class MultiplicationTable6to9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] result = new int[4];

        int index = 0;

        for (int i = 6; i <= 9; i++) {
            result[index++] = number * i;
        }

        System.out.println("\nMultiplication Table (6 to 9)");

        index = 0;

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i +
                    " = " + result[index++]);
        }

        sc.close();
    }
}

6 QUESTION
public class MeanHeight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.println("Mean Height = " + mean);

        sc.close();
    }
}

7 QUESTION
public class OddEvenArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Natural Number");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {

            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\n\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}

8 QUESTION
public class FactorsArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];

        int index = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                if (index == maxFactor) {

                    maxFactor *= 2;

                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[index++] = i;
            }
        }

        System.out.println("Factors:");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
