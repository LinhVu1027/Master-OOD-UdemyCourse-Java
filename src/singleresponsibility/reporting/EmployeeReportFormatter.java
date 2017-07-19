package singleresponsibility.reporting;

import singleresponsibility.domain.Employee;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class EmployeeReportFormatter extends  ReportFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormatterEmployee() {
        return getFormattedValue();
    }
}
