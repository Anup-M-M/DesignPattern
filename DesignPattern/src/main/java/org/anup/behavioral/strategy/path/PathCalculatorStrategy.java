package org.anup.behavioral.strategy.path;

// defines a family of functionality, encapsulate each one, and make them interchangeable
public interface PathCalculatorStrategy {

    void findPath(String fromLocation, String toLocation);

}