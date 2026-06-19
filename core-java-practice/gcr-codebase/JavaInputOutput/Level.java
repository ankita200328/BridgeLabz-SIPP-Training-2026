package JavaInputOutput;
import java.io.*;
import java.util.Scanner;

public class Level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("reportcard.txt", true); // append mode
            BufferedWriter bw = new BufferedWriter(fw);

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                String name = data[0];

                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double avg = (m1 + m2 + m3) / 3.0;

                bw.write("Name: " + name + ", Average: " + avg);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report card generated.");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found.");
        } catch (IOException e) {
            System.out.println("Error reading/writing file.");
        }
    }
}


2 QUESTION
public class FeedbackAnalyzer {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        System.out.println("Enter 5 feedback messages:");

        for (int i = 1; i <= 5; i++) {
            String feedback = br.readLine();

            if (feedback.toLowerCase().contains("good")) {
                count++;
            }
        }

        System.out.println("Good Feedback Count = " + count);
    }
}

3 QUESTION
public class ExpenseLogger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("expenses.txt", true);

            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            fw.write(category + " - " + amount + "\n");

            fw.close();

            System.out.println("Expense Saved Successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}


4 QUESTION
public class GroceryBillReader {
    public static void main(String[] args) {

        int count = 0;

        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }

            br.close();

            System.out.println("Total Lines = " + count);

        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}


ADDITIONAL QUESTION
class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name,
             String department, double salary) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp =
                new Employee(id, name, dept, salary);

        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream("employee.dat"));

        oos.writeObject(emp);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream("employee.dat"));

        Employee e = (Employee) ois.readObject();

        System.out.println("\nRecovered Employee Data");
        System.out.println(e.employeeId);
        System.out.println(e.name);
        System.out.println(e.department);
        System.out.println(e.salary);

        ois.close();
    }
}


2 QUESTION
public class EmailDomainCounter {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new FileReader("emails.txt"));

        String email;

        int gmail = 0;
        int yahoo = 0;
        int others = 0;

        while ((email = br.readLine()) != null) {

            String domain =
                    email.substring(email.indexOf("@") + 1);

            if (domain.equals("gmail.com"))
                gmail++;
            else if (domain.equals("yahoo.com"))
                yahoo++;
            else
                others++;
        }

        br.close();

        System.out.println("Gmail Users = " + gmail);
        System.out.println("Yahoo Users = " + yahoo);
        System.out.println("Others = " + others);
    }
}


