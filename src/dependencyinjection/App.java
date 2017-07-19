package dependencyinjection;

/**
 * Created by AllenWalker on 7/19/17.
 */
public class App {

    public static void main(String[] args) {
        Vehicle raceCar = new Vehicle(new SmallEngine(11));
        raceCar.crankIgnition();
    }
}
