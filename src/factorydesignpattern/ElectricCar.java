package factorydesignpattern;

public class ElectricCar implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Start electric car engine");
    }
}
