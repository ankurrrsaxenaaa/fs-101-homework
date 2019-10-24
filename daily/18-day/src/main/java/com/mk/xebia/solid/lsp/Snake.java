package com.mk.xebia.solid.lsp;
// I don't have limbs
public class Snake extends Animal {


    public String  getSound(){
        return "Hiss";
    }

    public Organ getArms() {
        throw new RuntimeException(" Snake doesn't have Arms!");
    }

    public Organ getLegs() {
        throw new RuntimeException(" Snake doesn't have Legs!");
    }
}
