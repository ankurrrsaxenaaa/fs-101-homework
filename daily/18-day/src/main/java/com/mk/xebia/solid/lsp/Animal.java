package com.mk.xebia.solid.lsp;


public abstract class Animal {


    private Organ lungs = new Organ("Lungs");
    private Organ tail = new Organ("Tail");
    private Organ vocalChords = new Organ("Vocal Chords");
    private Organ eyes = new Organ("Eyes");
    private Organ skin = new Organ("Skin");
    private Organ arms = new Organ("Arms");
    private Organ legs = new Organ("Legs");


    public void eat(){
        System.out.println(" I eat food.");
    }
    public String  getSound(){
        return "sound";
    }

    public Organ getLungs() {
        return lungs;
    }

    public Organ getTail() {
        return tail;
    }

    public Organ getVocalChords() {
        return vocalChords;
    }

    public Organ getEyes() {
        return eyes;
    }

    public Organ getSkin() {
        return skin;
    }

    public Organ getArms() {
        return arms;
    }

    public Organ getLegs() {
        return legs;
    }

    public  String getName(){
        return this.getClass().getSimpleName();
    }
}
