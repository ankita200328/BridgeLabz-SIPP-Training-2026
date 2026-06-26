package Poly.Tansport;

public class VehicleMain {
    public static void main(String[] args){
        double distance =100;
        Vehicle[] fleet={
                new Bike("BIKE101"),
                new Cars("CAR304"),
                new Bus("BUS201")

        };
        for(Vehicle v: fleet){
            System.out.println( "vehicle" +v.VehicleNumber);
        }

        System.out.println("Cost per" +distance+ "km is"+v.fuelCost(distance) );
        if(v instanseof Cars)
            System.out.println("this is a car");
    }    else if(v instanseof Bike)

    {
        System.out.println("this is a bike");
    }
}         else if(v instanseof Bus){
        System.out.println("this is bus");
             }
          else {
              System.out.println("invalid vehicle";)
                  }
