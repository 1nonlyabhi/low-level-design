package StrategyPattern.With;

import StrategyPattern.With.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle {

    public GoodVehicle() {
        super(new NormalDriveStrategy());
    }
    
}
