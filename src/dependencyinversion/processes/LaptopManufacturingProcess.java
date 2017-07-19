package dependencyinversion.processes;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assemble Laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("Test Laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Package Laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Store Laptop");
    }
}
