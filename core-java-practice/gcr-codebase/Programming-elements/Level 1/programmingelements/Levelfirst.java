package programmingelements;

public class Levelfirst {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear= 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " +age);
    }
}


2 QUESTION
public class Average {
    public static void main (String []args){
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam's average mark in PCM is " + average);

    }
}

3 QUESTION
public class KmToMiles {
    public static void main(String[] args) {
        double km = 10.8;
        double miles = km / 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}

4 QUESTION
public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;

        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;

        System.out.println("The Cost Price is INR " + costPrice +
                " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercent);
    }
}

5 QUESTION
public class PensDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent +
                " and the remaining pen not distributed is " + remainingPens);
    }
}


6 QUESTION
public class FeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}

8 QUESTION


public class UserKmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("The total miles is " + miles +
                " mile for the given " + km + " km");
    }
}

9 QUESTION
public class UserDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}

12 QUESTION
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of triangle is " + area + " square units");
    }
}

13 QUESTION
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);
    }
}

14 QUESTION
public class FeetConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in feet is " + feet +
                ", yards is " + yards +
                " and miles is " + miles);
    }
}






