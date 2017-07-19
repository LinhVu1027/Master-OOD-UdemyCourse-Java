package dependencyinjection;

/**
 * Created by AllenWalker on 7/19/17.
 */
public class Vehicle {

    private Engine racingEngine;

    public Vehicle(Engine racingEngine) {
        this.racingEngine = racingEngine;
    }

    public void crankIgnition() {
        racingEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
