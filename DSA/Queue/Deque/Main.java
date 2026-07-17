package Deque;

public class Main {
    public static void main(String[] args) {

        PrintQueue printer = new PrintQueue();

        printer.submitJob(101);
        printer.submitJob(102);

        printer.submitUrgentJob(999);

        System.out.println(printer.printNextJob());

        System.out.println(printer.printNextJob());

        System.out.println(printer.printNextJob());
    }

}
