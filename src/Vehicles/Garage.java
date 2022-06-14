package Vehicles;

public class Garage {

   private Vehicle[] cars;


    public void retrieveCars(){
        for(int i = 0; i < this.getCars().length; i++){
            cars[i].makeNoise();
        }
    }

    public Vehicle[] getCars() {
        return cars;
    }

    public void setCars(Vehicle[] cars) {
        this.cars = cars;
    }
}
