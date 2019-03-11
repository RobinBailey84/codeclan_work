import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HorseTest {

    Horse horse;

    @Before
    public void before(){
        horse = new Horse("Horse", "Neigh", "Stallion");
    }

    @Test
    public void horseCanTalk() {
        assertEquals("Neigh", horse.makeANoise());
    }

    @Test
    public void horseCanIntroduceItself() {
        assertEquals("Hello, I'm a Horse from Stallion Neigh", horse.introduceYourself());
    }
}
