package openclosed;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class Nurse extends Employee {


    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action...");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

    private void checkVitalSigns() {
        System.out.println("Checking Vitals");
    }

    private void drawBlood() {
        System.out.println("Drawing Blood");
    }

    private void cleanPatientArea() {
        System.out.println("Cleaning Patient Area");
    }
}
