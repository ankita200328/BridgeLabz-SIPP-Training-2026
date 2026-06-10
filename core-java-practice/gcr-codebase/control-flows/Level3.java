package controlflow;

public class Level3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582");
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }

2 QUESTION
        public class LeapYearSingleIf {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a year: ");
                int year = sc.nextInt();

                if (year >= 1582 &&
                        ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {

                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is not a Leap Year");
                }
            }
        }

        4QUESTION
        public class PrimeNumber {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                boolean isPrime = true;

                if (number <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.println(number + " is a Prime Number");
                } else {
                    System.out.println(number + " is not a Prime Number");
                }
            }
        }


        5QUESTION
        public class CountDigits {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter an integer: ");
                int number = sc.nextInt();

                int count = 0;

                // Handle 0 separately
                if (number == 0) {
                    count = 1;
                } else {
                    // Convert negative number to positive
                    number = Math.abs(number);

                    while (number != 0) {
                        number = number / 10; // Remove last digit
                        count++;
                    }
                }

                System.out.println("Number of digits = " + count);
            }
        }



