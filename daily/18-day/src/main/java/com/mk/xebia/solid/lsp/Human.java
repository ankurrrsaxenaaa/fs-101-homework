package com.mk.xebia.solid.lsp;
// Humans don't have a tail
public class Human extends Animal {

    public String  getSound(){
        return "Speak";
    }

    public Organ getTail() {
        throw new RuntimeException(" Human doesn't have a tail!");
    }

}
