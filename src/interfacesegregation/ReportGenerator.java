package interfacesegregation;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class ReportGenerator {

    private Reporting transactionObject;

    public void generateReport() {
        System.out.println(transactionObject.getName() + " " + transactionObject.getDate() + " " + transactionObject.productBreakDown());
    }
}
