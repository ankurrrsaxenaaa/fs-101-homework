package com.AI.RobotDemo.ApplicationRunner;
import com.AI.RobotDemo.Battery;
import com.AI.RobotDemo.Robot;
import com.AI.RobotDemo.Utility.Weight;
import com.AI.RobotDemo.Utility.WeightUnit;

public class Application {
    public static void main(String[] args) {
        Battery battery = new Battery(4000, "EverReady");
        Weight weight=new Weight.Builder().withWeight(45.6).withWeightUnit(WeightUnit.KG).build();
        Robot robot = new Robot(battery,weight);
        robot.walk(3.5);
        robot.getBattery().chargeBattery(battery);
        robot.walk(2.5);
        //charging before walking
        robot.getBattery().chargeBattery(battery);
        Weight updatedWeight=new Weight.Builder().withWeight(30.3).withWeightUnit(WeightUnit.KG).build();
        robot=new Robot(battery,weight);
        robot.walk(2);
    }
}