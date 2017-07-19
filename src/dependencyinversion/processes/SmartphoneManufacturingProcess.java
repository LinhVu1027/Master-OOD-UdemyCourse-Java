package dependencyinversion.processes;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assemble Phone");
    }

    @Override
    protected void testDevice() {
        System.out.println("Test Phone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Package Phone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Store Phone");
    }
}
