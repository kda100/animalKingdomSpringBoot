package com.example.animalKingdomSpringBoot.Mammals;

import com.example.animalKingdomSpringBoot.Animal;
import com.example.animalKingdomSpringBoot.Birds.Bird;
import com.example.animalKingdomSpringBoot.Gender;

public class Cat extends Mammal {

    private int killCount = 0;
    public Cat(String name, Gender gender) {
        super(name, gender, 4);
    }

    public Cat(Gender gender) {
        super(gender, 4);
    }

    public void kill(Bird bird) {
        bird.dies();
        killCount++;
    }

    @Override
    public String eat() {
        return "The cat is eating cat food";
    }

    @Override
    public <T extends Animal> Animal breed(T partner) {
        if(Animal.canSexualBreed(this, partner)) {
            return new Cat(Animal.genRandomGender());
        }
        return null;
    }

    public int getKillCount() {
        return killCount;
    }
}
