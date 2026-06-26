package Poly.Tansport;

public  class Bike extends Vehicle{
   // protected  String VehicleNumber();

    public Bike(String vehicleNumber){
        super(vehicleNumber);
    }


    @Override

    public  double fuelCost(double km){
        return km*3;
    }
}
