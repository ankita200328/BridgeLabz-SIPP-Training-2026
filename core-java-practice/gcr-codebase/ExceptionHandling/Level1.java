package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Level1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}



2 QUESTION
public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");

        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only!");
        }

        sc.close();
    }
}

3 QUESTION
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Access granted!");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}


4 QUESTION
public class MultipleCatchExample {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}


5 QUESTION
public class TryWithResourcesExample {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {

            String firstLine = br.readLine();
            System.out.println(firstLine);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}


6 QUESTION
public class InterestCalculator {

    static double calculateInterest(double amount,
                                    double rate,
                                    int years) throws IllegalArgumentException {

        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException(
                    "Amount and rate must be positive");
        }

        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        try {
            double interest = calculateInterest(10000, 5, 2);
            System.out.println("Interest = " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Invalid input: Amount and rate must be positive");
        }
    }
}



7 QUESTION
public class FinallyExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");

        } finally {
            System.out.println("Operation completed");
        }

        sc.close();
    }
}


8 QUESTION
public class ExceptionPropagation {

    static void method1() {
        int result = 10 / 0;
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {

        try {
            method2();

        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}


9 QUESTION
import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            try {
                int value = arr[index];

                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                try {
                    int result = value / divisor;
                    System.out.println("Result = " + result);

                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } finally {
            sc.close();
        }
    }
}


10 QUESTION
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        balance -= amount;
        System.out.println(
                "Withdrawal successful, new balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(10000);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
