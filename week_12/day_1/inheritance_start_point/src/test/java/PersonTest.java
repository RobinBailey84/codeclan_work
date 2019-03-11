import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Stephen", "G10");

    }

    @Test
    public void hasName() {
        assertEquals("Stephen", person.getName());
    }

    @Test
    public void hasCohort() {
        assertEquals("G10", person.getCohort());
    }

    @Test
    public void canChangeName() {
        person.setName("Minal");
        assertEquals("Minal", person.getName());
    }

    @Test
    public void canChangeCohort() {
        person.setCohort("G5");
        assertEquals("G5", person.getCohort());
    }

    @Test
    public void canTalk() {
        assertEquals("I love Java", person.talk("Java"));
    }
}
