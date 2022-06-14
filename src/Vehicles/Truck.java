package Vehicles;

public class Truck extends Vehicle{

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("POW!!! ...Throws rod into atmosphere.");
    }
}
