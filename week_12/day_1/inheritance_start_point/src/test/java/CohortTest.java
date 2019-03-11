import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {
    Person person;
    Cohort cohort;
    Instructor instructor;
    SeniorInstructor seniorInstructor;

    @Before
    public void before() {
        person = new Person("Stephen", "G10");
        instructor = new Instructor("Steve", "G10", "Java");
        seniorInstructor = new SeniorInstructor("John", "G11", "JavaScript", "Ruby");
        cohort = new Cohort(instructor);
    }

    @Test
    public void cohortHasPerson() {
        assertEquals(seniorInstructor, cohort.getPerson());
    }
}
