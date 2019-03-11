import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 32, 95.62, 'f', 1.85);
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(32, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear.getWeight(), 0.01);
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(false, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("Baloo", 32, 65.44, 'f', 1.20);
        assertEquals(true, thinBear.readyToHibernate() );
    }

    @Test
    public void bearIsFemale(){
        assertEquals('f', bear.getGender());
    }

    @Test
    public void bearHasHeight(){
        assertEquals(1.85, bear.getHeight(), 0.01);
    }

    @Test
    public void bearHasBMI(){
        assertEquals(27.93, bear.getBMI(), 0.01);
    }
}