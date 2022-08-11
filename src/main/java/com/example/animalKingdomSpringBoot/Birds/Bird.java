package com.example.animalKingdomSpringBoot.Birds;

import com.example.animalKingdomSpringBoot.Animal;
import com.example.animalKingdomSpringBoot.Gender;

abstract public class Bird extends Animal {
    final private double beakLength;

    final private int numOfLegs = 2;

    public Bird(String name, Gender gender, double beakLength) {
        super(name, gender, true);
        this.beakLength = beakLength;
    }

    public Bird(Gender gender, double beakLength) {
        super(gender, true);
        this.beakLength = beakLength;
    }

    @Override
    final public String breathe() {
        return "The bird is breathing";
    }

    public double getBeakLength() {
        return beakLength;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }
}
