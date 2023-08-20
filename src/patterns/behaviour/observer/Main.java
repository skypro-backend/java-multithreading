package patterns.behaviour.observer;

import patterns.behaviour.observer.observer.ConcreteObserver;
import patterns.behaviour.observer.observer.Observer;
import patterns.behaviour.observer.subject.ConcreteSubject;

// Пример использования
public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Наблюдатель 1");
        Observer observer2 = new ConcreteObserver("Наблюдатель 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setMessage("Привет!");

        subject.detach(observer1);

        subject.setMessage("Как дела?");
    }
}
