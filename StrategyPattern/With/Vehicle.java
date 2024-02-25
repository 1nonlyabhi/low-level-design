package StrategyPattern.With;

import StrategyPattern.With.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    // * This is know as constructor injection.
    Vehicle(final DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
