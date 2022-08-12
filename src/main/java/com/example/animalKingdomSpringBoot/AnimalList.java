package com.example.animalKingdomSpringBoot;

import com.example.animalKingdomSpringBoot.Mammals.Bat;
import com.example.animalKingdomSpringBoot.Mammals.Cat;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private List<Animal> animalList;

    public AnimalList() {
        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
        for(int i = 0; i < 10; i++) {
            animalArrayList.add(new Cat("Felix", Animal.genRandomGender()));
        }
        this.animalList = animalArrayList;
    }

    public void add(String name, Gender gender) {
        animalList.add(new Bat(name, gender));
    }

    public void change(int index, String newName) {
        animalList.get(index).setName(newName);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this.animalList);
    }

    public List<Animal> getAnimalList() {
        return this.animalList;
    }
}
