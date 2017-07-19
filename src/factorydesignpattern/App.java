package factorydesignpattern;

public class App {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle = factory.getVehicle(VehicleType.CAR);
        vehicle.startEngine();
    }
}
