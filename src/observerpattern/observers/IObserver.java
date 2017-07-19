package observerpattern.observers;

import observerpattern.domain.Employee;

public interface IObserver {
    void callMe(Employee emp, String msg);
}
