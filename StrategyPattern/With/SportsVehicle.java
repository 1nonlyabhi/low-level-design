package StrategyPattern.With;

import StrategyPattern.With.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
