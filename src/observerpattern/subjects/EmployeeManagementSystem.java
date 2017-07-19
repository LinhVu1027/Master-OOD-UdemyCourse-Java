package observerpattern.subjects;

import observerpattern.domain.Employee;
import observerpattern.domain.dao.EmployeeDAO;
import observerpattern.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {

    private List<IObserver> observers;
    private List<Employee> employees;

    private EmployeeDAO employeeDAO;

    private Employee employee;
    private String msg;

    public EmployeeManagementSystem() {
        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver department: observers) {
            department.callMe(employee, msg);
        }
    }

    public void hireNewEmployee(Employee emp) {
        employee = emp;
        msg = "New hire: ";
        employees.add(emp);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String newName) {
        boolean notify = false;

        for (Employee emp : employees) {
            if (id == emp.employeeID) {
                emp.setName(newName);
                this.employee = emp;
                this.msg = "Employee name has been modified";
                notify = true;
            }
        }

        if (notify) notifyObservers();
    }
}
