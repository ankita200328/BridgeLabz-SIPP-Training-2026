public class MetroFare {
    public static void main(String[]args) {
        double balance=600.00;

        while(balance>0){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter distance in km or Type -1 to exit");
            double distance= sc.nextDouble();
            if(distance==-1){
                break;
            }
            System.out.println("your balance ")

            //Fare calculation
            double fare=(distance<=5)?10:(distance<=10)?20:(distance<=20)?30:50;

            //balance calculation
            if(balance>fare){
                fare*=pasenger;
                balance=balance-fare;
                System.out.println("Avilable balance in your  card is :-"+balance);
            }
            else {
                System.out.println("insufficent balance please check your card balance ")
            }





        }
        System.out.println("card time exceded or balance is zero!!!");

    }
}