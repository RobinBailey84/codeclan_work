import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BearTest {

    Bear bear;
    Salmon salmon;
    River river;

    @Before
    public void before(){
        bear = new Bear("Yogi");
        salmon = new Salmon();
        river = new River();
        river.addFish(salmon);
    }



    @Test
    public void hasName(){
        assertEquals("Yogi", bear.getName());
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
        bear.sleep();
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatFromRiver() {
        bear.eatFishFromRiver(river);
        assertEquals(1, bear.foodCount());
        assertEquals(0, river.fishCount());
    }
}
