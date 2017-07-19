package dependencyinjection;

/**
 * Created by AllenWalker on 7/19/17.
 */
public class SmallEngine implements Engine {

    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("started small " + horsePower + "hp engine");
    }
}
