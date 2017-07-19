package dependencyinversion.processes;

/**
 * Created by AllenWalker on 7/18/17.
 */
public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String name) {
        this.processName = name;
    }

    protected abstract void assembleDevice();
    protected abstract void testDevice();
    protected abstract void packageDevice();
    protected abstract void storeDevice();

    public void launchProcess() {
        if (processName != null && !processName.isEmpty()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("No process name was specified");
        }
    }
}
