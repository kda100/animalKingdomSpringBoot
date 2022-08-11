import com.example.animalKingdomSpringBoot.Birds.Bird;
import com.example.animalKingdomSpringBoot.Birds.Penguin;
import com.example.animalKingdomSpringBoot.Gender;
import com.example.animalKingdomSpringBoot.Mammals.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void test_get_cat_name() {
        final Cat cat = new Cat("Brian", Gender.MALE);
        assertEquals(cat.getName(), "Brian");
    }

    @Test
    public void check_mammary_glands() {
        final Cat cat = new Cat("Felix", Gender.FEMALE);
        assertEquals(cat.getMammaryGlandsNum(), 4);
    }

    @Test
    public void check_cats_kill_count() {
        final Cat cat = new Cat("Felix", Gender.FEMALE);
        final Bird bird = new Penguin("Louis", Gender.FEMALE);
        assertEquals(cat.getKillCount(), 0, "On initialisation kill count should be 0");
        cat.kill(bird);
        assertEquals(bird.getIsAlive(), false, "The bird should be dead... isAlive = false");
        assertEquals(cat.getKillCount(), 1, "cats kill count should increment by 1");
    }

}
