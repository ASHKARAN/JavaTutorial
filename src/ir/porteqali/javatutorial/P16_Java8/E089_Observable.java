package ir.porteqali.javatutorial.P16_Java8;

import java.util.Observable;
import java.util.Observer;

public class E089_Observable {

    public E089_Observable() {
        MyObservable myObservable = new MyObservable();
        MyObserver myObserver = new MyObserver();
        myObservable.addObserver(myObserver);

        myObservable.changeA();
        myObservable.changeA();
        myObservable.changeA();
        myObservable.changeA();
        myObservable.changeA();
        myObservable.changeA();
        myObservable.changeA();
    }



    class MyObserver implements Observer {
        @Override
        public void update(Observable observable, Object o) {
            MyObservable myObservable = (MyObservable) observable;
            System.out.println(myObservable.a);
        }
    }

    class MyObservable extends Observable {

        int a = 0;

        public void changeA() {
            a++;
            setChanged();
            notifyObservers();
        }
    }
}
