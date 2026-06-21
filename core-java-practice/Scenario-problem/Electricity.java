class Electricity {
    double Units;
    public double electricitybill(double units){
        double amount= (units<=50)?5:(units<=100)?10:(units<=200)?15:(units<=300)?20:30;
        return amount;
    }
    public void generateBill(double units,double amount){
        System.out.println("WELCOME TO ELECTRICITY BOARD");
        System.out.println("Total Units consumed" +units);
        System.out.println("to " +amount);
    }
    public static void main(String[]args){
        Electricity ele=new Electricity();
        Scanner sc = new Scanner (System.in);
        //electricityBill.Units=sc.nextDouble();
         double amt= ele.electricityBill(ele.Units=sc.nextDouble());
         double totalAmount=ele.Units*amount;
         ele.generateBill(ele.Units, totalAmount);

    }
}