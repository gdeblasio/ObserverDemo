package observerdemo;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;
    
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }
    
    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }    
    
    public int getState() {
        return state;
    }
    
    public void setState(int value) {
        this.state = value;
        notifiyObservers();
    }

    public void notifiyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

}
