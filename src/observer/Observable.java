package observer;

import java.util.*;

class Observable {
    private ArrayList<Observer> observers;
    private int value;


    Observable(int value){
        observers=new ArrayList<Observer>();
        this.value=value;
    }

    void addObserver(Observer observer){
        observers.add(observer);
    }

    void message(){
        for (Observer ob: observers) {
            ob.notifying(this.value);
        }
        System.out.println();
    }

    void setValue(int value){
        this.value=value;
        message();
    }
}