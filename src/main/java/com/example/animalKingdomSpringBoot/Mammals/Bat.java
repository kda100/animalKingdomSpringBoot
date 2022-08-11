package com.example.animalKingdomSpringBoot.Mammals;

import com.example.animalKingdomSpringBoot.Animal;
import com.example.animalKingdomSpringBoot.Fly;
import com.example.animalKingdomSpringBoot.Gender;

public class Bat extends Mammal implements Fly {
    public Bat(String name, Gender gender) {
        super(name, gender, 2);
    }

    public Bat(Gender gender) {
        super(gender, 2);
    }

    @Override
    public String eat() {
        return "The bat is sucking blood";
    }

    @Override
    public <T extends Animal> Bat breed(T partner) {
        if(Animal.canSexualBreed(this, partner)) {
            return new Bat(Animal.genRandomGender());
        }
        return null;
    }

    @Override
    public String takeOff() {
        super.move();
        return "The bat is flapping its wings";
    }

    @Override
    public String flight() {
        super.move();
        return "The bat is gliding in the wind";
    }

    @Override
    public String landing() {
        super.move();
        return "The bat is coming down for a comfortable landing";
    }
}
