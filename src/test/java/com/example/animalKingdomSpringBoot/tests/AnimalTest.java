import com.example.animalKingdomSpringBoot.Birds.Bird;
import com.example.animalKingdomSpringBoot.Birds.FlyingRat;
import com.example.animalKingdomSpringBoot.Birds.Penguin;
import com.example.animalKingdomSpringBoot.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    @Test
    public void test_sleep() {
        final Bird bird = new FlyingRat("Pigeon", Gender.MALE);
        assertEquals(bird.getIsSleeping(), false, "isSleeping is not initialised to be false");
        bird.sleep();
        assertEquals(bird.getIsSleeping(), true, "sleep() function did not making isSleeping true");
    }

    @Test
    public void test_wake_up() {
        final Bird bird = new FlyingRat("Pigeon", Gender.MALE);
        bird.sleep();
        assertEquals(bird.getIsSleeping(), true, "animal.sleep() function did not making isSleeping true");
        bird.wakeUp();
        assertEquals(bird.getIsSleeping(), false, "animal.wakeUp() function did not make isSleeping false");
    }

    @Test
    public void test_die() {
        final Penguin penguin = new Penguin("Happy Feet", Gender.MALE);
        assertEquals(penguin.getIsAlive(), true, "isAlive is not initialised to be true");
        penguin.dies();
        assertEquals(penguin.getIsAlive(), false, "animal.dies() does not change the isAlive to false");
    }

    @Test
    public void test_breed() {
        final Penguin penguin = new Penguin("Chris", Gender.MALE);
    }
}
