package observerpattern.subjects;

import observerpattern.observers.IObserver;

public interface ISubject {

    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers();
}
