package com.mk.xebia.solid.dip;

import java.util.Random;

public class TirednessIndicator {
    public enum TirednessLevels {
        TIRED,NOT_TIRED,MILDLY_TIRED
    }

    private TirednessLevels tirednessLevels;

    public TirednessIndicator() {
        Random random = new Random();
        int tiredenssLevel = random.nextInt(99);
        if(tiredenssLevel<33){
            this.tirednessLevels = TirednessLevels.NOT_TIRED;
        }
        else if(tiredenssLevel<66){
            this.tirednessLevels = TirednessLevels.MILDLY_TIRED;
        }
        else {
            this.tirednessLevels = TirednessLevels.TIRED;
        }

    }

    public TirednessLevels getTirednessLevels() {
        return tirednessLevels;
    }

    public void setTirednessLevels(TirednessLevels tirednessLevels) {
        this.tirednessLevels = tirednessLevels;
    }
}
