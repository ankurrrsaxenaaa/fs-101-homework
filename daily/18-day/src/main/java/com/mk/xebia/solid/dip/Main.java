package com.mk.xebia.solid.dip;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println("I can "+(robot.canWalk()?"":"not ")+"walk");
    }
}
