class Coffeeshop {
    String CoffeeTypes;
    int Quantity;

    //creating methods
    public void calculatePrice( double price){
        double bill=price*Quantity;
        double gst=price*0.18;
        double finalBill=Bill+gst;
        return finalBill;
    }
    public void generateBill(double bill){
        System.out.println("COFFEE TYPE -> " +Coffee Types);
        System.out.println("QUANTITY  -> " +Quantity);
        System.out.println("BILL AMOUNT -> " +bill);
        System.out.println("THANK YOU  FOR VISIT");

    }


    public static void main(String[]args){
        System.out.println("choose coffe Type or Exit !! ");
        System.out.println("1. Cappaccino:- 250\n2.Latte:-300\n3.Esspreso:-270");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("enter the quantity");
        Coffeeshop coffee=new Coffeeshop();
        coffee.Quantity=sc.nextInt();
        coffee.CoffeeTypes=sc.nextInt();
        switch (choice){
            case 1:
                coffee.generateBill(coffee.calculatePrice(250));
                coffee.CoffeeTypes="Cappaccino";

                break;
            case 2:
                coffee.generateBill(coffee.calculatePrice(300));
                coffee.CoffeeTypes="Latte";

                break;

            case 3:
                coffee.generateBill(coffee.calculatePrice(270));
                coffee.CoffeeTypes="Esspreso";

                break;
        }



    }
}