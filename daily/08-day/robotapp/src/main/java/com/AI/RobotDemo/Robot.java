package com.AI.RobotDemo;
import com.AI.RobotDemo.Utility.Weight;
public class Robot {
    //
    private Battery battery;
    private Weight weight;
    private static double rateOfBatteryDrain;
    public Robot(Battery battery,Weight weight) {
        this.battery = battery;
        this.weight=weight;
    }
    public void walk( double distance) {
        if (distance > 0) {
            if (this.weight != null && this.weight.getWeight() >= 0) {
                rateOfBatteryDrain = 0.02 * this.weight.getWeight();
                this.battery.drainBattery(this.battery, rateOfBatteryDrain);
            } else {
                this.battery.drainBattery(this.battery, null);
            }
        }
    }
    public Battery getBattery() {
        return this.battery;
    }
}