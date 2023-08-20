package patterns.behaviour.observer.subject;

import patterns.behaviour.observer.observer.Observer;

interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
