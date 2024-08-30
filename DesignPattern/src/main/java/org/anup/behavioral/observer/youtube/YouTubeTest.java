package org.anup.behavioral.observer.youtube;

public class YouTubeTest {
    public static void main(String[] args) {

        Channel ch = new Channel();

        Subscriber s1 = new Subscriber("Anup");
        Subscriber s2 = new Subscriber("rashmi");
        Subscriber s3 = new Subscriber("Arun");

        ch.subscribe(s1);
        ch.subscribe(s2);
        ch.subscribe(s3);

        ch.unSubscribe(s3);

        s1.subscribeChannel(ch);
        s2.subscribeChannel(ch);
        s3.subscribeChannel(ch);

        ch.upload("Learn Programming");
    }
}
