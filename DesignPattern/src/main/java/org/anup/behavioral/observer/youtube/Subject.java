package org.anup.behavioral.observer.youtube;

public interface Subject {

    void subscribe(Subscriber sub);

    void unSubscribe(Subscriber sub);

    void notifySubscribers();

    void upload(String title);
}
