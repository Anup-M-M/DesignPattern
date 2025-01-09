package org.anup.behavioral.strategy.path;

public class PathCalculatorFactory {

    //Eager Initialisation
    private static final CarPathCalculator carPathCalculator = new CarPathCalculator();
    private static final BikePathCalculator bikePathCalculator = new BikePathCalculator();
    private static final WalkPathCalculator walkPathCalculator = new WalkPathCalculator();

    public static PathCalculatorStrategy getPathCalculatorForMode(String mode) {
        if (mode.equals("Car")) {
            //return new CarPathCalculator();
            return carPathCalculator;
        }
        else if (mode.equals("Bike")) {
            //return new BikePathCalculator();
            return bikePathCalculator;
        } else {
            //return new WalkPathCalculator();
            return walkPathCalculator;
        }
    }
}