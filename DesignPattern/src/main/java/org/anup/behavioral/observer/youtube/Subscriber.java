package org.anup.behavioral.observer.youtube;

// just define a one-to-one dependency so that when one object changes state, all its dependents are notified and updated automatically
public class Subscriber implements Observer {

    private String name;
    private Channel ch = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hey " + name +" , Video updated : " + ch.getTitle());
    }

    @Override
    public void subscribeChannel(Channel cha){
        ch = cha;
    }
}
