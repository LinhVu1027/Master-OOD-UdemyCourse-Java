package observerpattern.clients;

import observerpattern.subjects.EmployeeManagementSystem;
import observerpattern.observers.HRDepartment;
import observerpattern.observers.IObserver;
import observerpattern.observers.PayrollDepartment;

public class App {

    public static void main(String[] args) {

        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

//        Employee bob = new Employee("Bob", new Date(), 35000, true);
//        ems.hireNewEmployee(bob);

        ems.modifyEmployeeName(5, "Cloud");
    }
}
