package dependencyinversion.clients;

import dependencyinversion.processes.GeneralManufacturingProcess;
import dependencyinversion.processes.SmartphoneManufacturingProcess;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone");
        manufacturer.launchProcess();
    }
}
