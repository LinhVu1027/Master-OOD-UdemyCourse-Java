package singleresponsibility.reporting;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class ReportFormatter {

    String formatterOutput;

    public ReportFormatter(Object object, FormatType formatType) {
        switch (formatType) {
            case XML:
                formatterOutput = convertObjectToXML(object);
                break;
            case CSV:
                formatterOutput = convertObjectToCSV(object);
                break;
        }
    }

    private String convertObjectToXML(Object object) {
        return "XML: <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCSV(Object object) {
        return "CSV: ,,, " + object.toString() + ",,,,";
    }

    protected String getFormattedValue() {
        return formatterOutput;
    }
}
