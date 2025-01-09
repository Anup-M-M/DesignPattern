package org.anup.behavioral.strategy.path;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Delhi", "Agra", "Car");
    }
}
