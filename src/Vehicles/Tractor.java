package Vehicles;

public class Tractor extends Vehicle{

    @Override//just to show what is overridden
    public void makeNoise(){
        System.out.println(this.getName() + " goes clack clack");
    }
}
