package com.example.animalKingdomSpringBoot.Birds;
import com.example.animalKingdomSpringBoot.Animal;
import com.example.animalKingdomSpringBoot.Gender;

public class Penguin extends Bird {
    public Penguin(String name, Gender gender) {
        super(name, gender, 0.25);
    }

    public Penguin(Gender gender) {
        super(gender, 0.25);
    }

    @Override
    public String eat() {
        return "The penguin is eating fish through its mouth";
    }

    @Override
    public <T extends Animal> Animal breed(T partner) {
        if(Animal.canSexualBreed(this, partner)) {
            return new Penguin(Animal.genRandomGender());
        }
        return null;
    }
}
