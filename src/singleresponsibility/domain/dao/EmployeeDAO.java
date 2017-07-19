package singleresponsibility.domain.dao;

import singleresponsibility.database.DatabaseConnectionManager;
import singleresponsibility.domain.Employee;

/**
 * Created by AllenWalker on 7/17/17.
 */
public class EmployeeDAO {
    public void saveEmployee(Employee emp) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("insert into Employee");
//        connectionManager.disconnect();
        System.out.println("saved employee to the singleresponsibility.database: " + emp);

    }

    public void deleteEmplyee(Employee emp) {
        System.out.println("deleted employee from the singleresponsibility.database: " + emp);
    }
}
