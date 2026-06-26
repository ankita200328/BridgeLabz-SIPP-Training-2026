package Poly.Tansport;

public  abstract class Vehicle {
    protected String VehicleNumber;
    public Vehicle(String vehicleNumber){
        VehicleNumber=vehicleNumber;
    }


    public abstract double fuelCost(double km);    //jb bhi abstract method ho aur abstract class ko extend kr rhe hai thoabstract method ko override kr do.




}
