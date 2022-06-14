package Vehicles;

public class GarageTest {

    public static void main(String[] args) {
        Vehicle[] cars = new Vehicle[3];
        cars[0] = new motorcycle();
        cars[0].setName("harley");
        cars[1] = new Truck();
        cars[1].setName("silverado");
        cars[2] = new Tractor();
        cars[2].setName("big blue");

        Garage rustys = new Garage();
        rustys.setCars(cars);
        rustys.retrieveCars();

    }
}
