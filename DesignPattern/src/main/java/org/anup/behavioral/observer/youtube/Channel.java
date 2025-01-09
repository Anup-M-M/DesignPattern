package org.anup.behavioral.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

    private String title;
    List<Subscriber> subscribers = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    @Override
    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub){
        subscribers.remove(sub);
    }

    @Override
    public void notifySubscribers(){
        for(Subscriber sub : subscribers){
            sub.update();
        }
    }

    @Override
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }

}
