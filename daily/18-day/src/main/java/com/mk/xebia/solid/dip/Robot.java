package com.mk.xebia.solid.dip;

public class Robot {
    private Battery battery = new Battery();
    private TirednessIndicator tirednessIndicator = new TirednessIndicator();
    public boolean canWalk() {
        return (battery.getRemainingCharge()>5) &&
                (!tirednessIndicator.getTirednessLevels().equals(TirednessIndicator.TirednessLevels.TIRED));
    }
}
