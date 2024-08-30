package org.anup.behavioral.strategy.path;

public class GoogleMaps {

    public void findPath(String from, String to, String mode) {
        PathCalculatorStrategy pathCalculatorStrategy =
                PathCalculatorFactory.getPathCalculatorForMode(mode);

        pathCalculatorStrategy.findPath(from, to);
    }
}
