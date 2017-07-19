package factorydesignpattern;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Start car engine");
    }
}
