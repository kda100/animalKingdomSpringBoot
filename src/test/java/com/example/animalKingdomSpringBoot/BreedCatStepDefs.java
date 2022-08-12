package com.example.animalKingdomSpringBoot;


import com.example.animalKingdomSpringBoot.AnimalKingdomSpringBootApplication;
import com.example.animalKingdomSpringBoot.Gender;
import com.example.animalKingdomSpringBoot.Mammals.Cat;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class BreedCatStepDefs extends AnimalKingdomSpringBootApplication {
    private Cat cat1;
    private Cat cat2;
    private Cat cat3;

    @Given("The partner is a cat")
    public void partner_is(Cat cat) {
       cat1 = new Cat("Peter", Gender.MALE);
    }

    @And("The partner is a different gender")
    public void thePartnerIsADifferentGender() {
        cat2 = new Cat("Lois", Gender.FEMALE);
    }

    @When("They try to breed")
    public void theyTryToBreed() {
        cat3 = (Cat) cat1.breed(cat2);
    }

    @Then("A new cat will be born")
    public void aNewCatWillBeBorn() {
        Assertions.assertEquals(cat3.getClass(), cat1.getClass());
    }
}
