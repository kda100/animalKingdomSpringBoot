package com.example.animalKingdomSpringBoot.Mammals;


import com.example.animalKingdomSpringBoot.Animal;
import com.example.animalKingdomSpringBoot.Gender;

abstract public class Mammal extends Animal {
    final int mammaryGlandsNum;

    public Mammal(String name, Gender gender, int mammaryGlandsNum) {
        super(name, gender, true);
        if(gender == Gender.FEMALE) {
            this.mammaryGlandsNum = mammaryGlandsNum;
        } else {
            this.mammaryGlandsNum = 0;
        }
    }

    public Mammal(Gender gender, int mammaryGlandsNum) {
        super(gender, true);
        if(gender == Gender.FEMALE) {
            this.mammaryGlandsNum = mammaryGlandsNum;
        } else {
            this.mammaryGlandsNum = 0;
        }
    }

    @Override
    final public String breathe() {
        return "The mammal is breathing through its orifices";
    }

    public int getMammaryGlandsNum() {
        return mammaryGlandsNum;
    }
}
