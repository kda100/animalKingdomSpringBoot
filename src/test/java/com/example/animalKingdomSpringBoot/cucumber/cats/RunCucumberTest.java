package com.example.animalKingdomSpringBoot.cucumber.cats;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/java/resources.cucumber")
public class RunCucumberTest {
}
