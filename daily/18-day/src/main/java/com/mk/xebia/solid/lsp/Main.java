package com.mk.xebia.solid.lsp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Human());
        animals.add(new Snake());

      for(Animal animal:animals){
          System.out.print("Hi! My name is " + animal.getName());
          System.out.print(" I make the following sound : "+ animal.getSound());
          System.out.println(" I am proud of my :" + animal.getTail().getName() + " and " + animal.getVocalChords().getName());
          System.out.println();
      }
    }
}
