package PRACTICES;

public class Level {
    public static void main(String [] args){
        System.out.println("Welcome to Brizlab");
    }
}


public class Add{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number");
        int a = sc.nextInt();
        System.out.print("enter second number");
        int b= sc.nextInt();
        System.out.println("sum" +(a+b));

    }
}


import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}



public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + area);
    }
}


public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of Cylinder = " + volume);
    }
}



public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter = " + perimeter);
    }
}




public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.println("Distance in Miles = " + miles);
    }
}



