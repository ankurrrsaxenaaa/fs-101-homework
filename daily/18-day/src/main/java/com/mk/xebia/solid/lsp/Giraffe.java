package com.mk.xebia.solid.lsp;

// Giraffe does not have vocal cords
public class Giraffe extends Animal {
    public String  getSound(){
        return null;
    }
    public Organ getVocalChords() {
        throw new RuntimeException(" Giraffe doesn't have vocal chords!");
    }

}
