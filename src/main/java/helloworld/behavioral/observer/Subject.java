package helloworld.behavioral.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yihua.huang@dianping.com
 */
public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new LinkedList<Observer>();
    }

    public Subject attach(Observer observer){
        observers.add(observer);
        return this;
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
