import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SheepTest {

    Sheep sheep;

    @Before
    public void before(){
        sheep = new Sheep("Sheep", "Baa");
    }

    @Test
    public void checkAnimalHasSpecies() {
        assertEquals("Sheep", sheep.getSpecies());
    }

    @Test
    public void checkAnimalMakesNoise() {
        assertEquals("Baa", sheep.makeANoise());
    }

    @Test
    public void checkAnimalCanIntroduceItself() {
        assertEquals("Hello, I'm a Sheep Baa", sheep.introduceYourself());
    }
}
