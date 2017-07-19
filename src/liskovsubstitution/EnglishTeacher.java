package liskovsubstitution;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class EnglishTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("taught English...");
    }
}
