import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class NumberListTest {
    private NumberList numberList;

    @Before
    public void before(){
        ArrayList<Integer> testNumbers = new ArrayList<Integer>();
        testNumbers.add(3);
        testNumbers.add(5);
        testNumbers.add(7);
        numberList = new NumberList(testNumbers);
    }

    @Test
    public void canGetNumberLength(){
        assertEquals(3, numberList.numberLength());
    }

    @Test
    public void canAddToNumbersList(){
        numberList.add(5);
        assertEquals(4, numberList.numberLength());
    }

    @Test
    public void getNumberAtIndex(){
        assertEquals(5, numberList.getNumberAtIndex(1));
    }

    @Test
    public void canGetTotal(){
        assertEquals(15, numberList.total());
    }
}
