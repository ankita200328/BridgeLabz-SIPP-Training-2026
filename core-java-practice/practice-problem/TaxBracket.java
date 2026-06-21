public class TaxBracket {
    public static void main(String[]args) {
        double tax;
        double income;
        String tax_bracket=" ";
        Scanner sc = ner Scanner(Syetem.in);
        income=sc.nextDouble();

        if (income<=5000) {
            tax=income*0.05;
            tax_bracket="Tax of 5%";

        } else if (income<=10000) {
            tax=income*0.10;
            tax_bracket="Tax of 10%";

        }
        else if (income<=15000) {
            tax=income*0.15;
            tax_bracket="Tax of 15%";

        }
        else if (income<=20000) {
            tax=income*0.20;
            tax_bracket="Tax of 20%";

        }
        else if (income<=25000) {
            tax=income*0.25;
            tax_bracket="Tax of 25%";

        }
        else if (income<=30000) {
            tax=income*0.30;
            tax_bracket="Tax of 30%";

        }
        else if (income<=35000) {
            tax=income*0.35;
            tax_bracket="Tax of 35%";

        }
        else if (income<=40000) {
            tax=income*0.40;
            tax_bracket="Tax of 40%";

        }
        else if (income<=45000) {
            tax=income*0.45;
            tax_bracket="Tax of 45%";

        }
        else  (income<=50000) {
            tax=income*0.50;
            tax_bracket="Tax of 50%";

        }
        System.out.println(income="->"+TaxBracket);




    }
}