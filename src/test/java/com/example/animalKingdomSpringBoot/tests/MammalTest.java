package com.example.animalKingdomSpringBoot.tests;

import com.example.animalKingdomSpringBoot.Gender;
import com.example.animalKingdomSpringBoot.Mammals.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MammalTest {
    @Test
    public void mammals_should_be_warm_blooded() {
        final Cat cat = new Cat("Felix", Gender.FEMALE);
        assertEquals(cat.getWarmBlooded(), true, "Mammals are warm-blooded.");
    }
}
