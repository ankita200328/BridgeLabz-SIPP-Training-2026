package Arrays;

public class Level2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            years[i] = sc.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid Input! Enter Again");
                i--;
                continue;
            }
        }

        for (int i = 0; i < 10; i++) {

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nSalary Details");
        System.out.println("Old Salary\tBonus\tNew Salary");

        for (int i = 0; i < 10; i++) {
            System.out.println(
                    salary[i] + "\t" +
                            bonus[i] + "\t" +
                            newSalary[i]);
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}

2 QUESTION


public class FriendsDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter Age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter Height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: "
                + names[youngestIndex]);

        System.out.println("Tallest Friend: "
                + names[tallestIndex]);

        sc.close();
    }
}

3 QUESTION
public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        while (number != 0) {

            digits[index] = (int)(number % 10);
            number /= 10;

            index++;

            if (index == maxDigit) {
                break;
            }
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {

                secondLargest = largest;
                largest = digits[i];

            } else if (digits[i] > secondLargest
                    && digits[i] != largest) {

                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit = "
                + largest);

        System.out.println("Second Largest Digit = "
                + secondLargest);

        sc.close();
    }
}

4 QUESTION
public class DynamicLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        while (number != 0) {

            if (index == maxDigit) {

                maxDigit += 10;

                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp;
            }

            digits[index] = (int)(number % 10);

            number /= 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {

                secondLargest = largest;
                largest = digits[i];

            } else if (digits[i] > secondLargest
                    && digits[i] != largest) {

                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit = "
                + largest);

        System.out.println("Second Largest Digit = "
                + secondLargest);

        sc.close();
    }
}

5 QUESTION
public class ReverseNumberArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        temp = number;

        for (int i = 0; i < count; i++) {

            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed Number = ");

        for (int digit : reverse) {
            System.out.print(digit);
        }

        sc.close();
    }
}