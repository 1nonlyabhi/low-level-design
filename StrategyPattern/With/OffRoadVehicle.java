package StrategyPattern.With;

import StrategyPattern.With.Strategy.SportsDriveStrategy;

/**
 * OffRoadVehicle
 */
public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}