package liskovsubstitution;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class SchoolStaff {
    private void makeAnnouncements() {
        System.out.println("make announcement..");
    }

    private void takeAttendence() {
        System.out.println("take attendence..");
    }

    private void collectPaperWork() {
        System.out.println("collect paperwork..");
    }

    private void conductHallwayDuties() {
        System.out.println("conduct hallway duties..");
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
    }
}
