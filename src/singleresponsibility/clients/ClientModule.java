package singleresponsibility.clients;

import singleresponsibility.domain.Employee;
import singleresponsibility.domain.dao.EmployeeDAO;
import singleresponsibility.reporting.EmployeeReportFormatter;
import singleresponsibility.reporting.FormatType;

/**
 * Created by AllenWalker on 7/18/17.
 */
public class ClientModule {

    public static void main(String[] args) {
        Employee peggy = new Employee(1, "peggy", "accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee emp) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(emp);
    }

    public static void terminateEmployee(Employee emp) {
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.deleteEmplyee(emp);
    }

    public static void printEmployeeReport(Employee emp, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
        System.out.println(formatter.getFormatterEmployee());
    }
}
