package org.anup.behavioral.strategy.path;

public class BikePathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Bike Path");
    }
}
