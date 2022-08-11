package com.example.animalKingdomSpringBoot.Birds;


import com.example.animalKingdomSpringBoot.Animal;
import com.example.animalKingdomSpringBoot.Fly;
import com.example.animalKingdomSpringBoot.Gender;

public class FlyingRat extends Bird implements Fly {
    public FlyingRat(String name, Gender gender) {
        super(name, gender, 0.02);
    }

    public FlyingRat(Gender gender) {
        super(gender, 0.02);
    }

    @Override
    public String eat() {
        return "The flying rat is eating bread through it's beak";
    }

    @Override
    public <T extends Animal> FlyingRat breed(T partner) {
        if(Animal.canSexualBreed(this, partner)) {
            return new FlyingRat(Animal.genRandomGender());
        }
        return null;
    }

    @Override
    public String takeOff() {
        super.move();
        return "The flying rat is flapping it's wings";
    }

    @Override
    public String flight() {
        super.move();
        return "The flying rat is gliding in the wind";
    }

    @Override
    public String landing() {
        super.move();
        return "The flying rat is coming down for a landing to annoy people";
    }
}
