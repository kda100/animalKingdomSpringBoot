package com.example.animalKingdomSpringBoot.cucumber.cats;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/java/resources/cucumber", glue = "org.example" +
        ".animalKingdomSpringBoot.cucumber" +
        ".cats.BreedCatStepDefs.java")
public class RunCucumberTest {
}
