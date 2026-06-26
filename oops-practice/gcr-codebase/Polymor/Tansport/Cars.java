package Poly.Tansport;

public class Cars  extends Vehicle{

    public Cars(String vehicleNumber){
        super(vehicleNumber);
    }


    @Override

    public  double fuelCost(double km){
        return km*10;
    }
}
