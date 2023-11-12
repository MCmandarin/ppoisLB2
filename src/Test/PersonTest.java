package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.Person;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testSetAndGetFirstName() {
        Person person = new Person();
        person.setFirstName("John");
        assertEquals("John", person.getFirstName());
    }

    @Test
    public void testSetAndGetLastName() {
        Person person = new Person();
        person.setLastName("Doe");
        assertEquals("Doe", person.getLastName());
    }

    @Test
    public void testSetAndGetDateOfBirth() throws ParseException {
        Person person = new Person();
        person.setDateOfBrith("1990-01-01");
        assertEquals("1990-01-01", person.getDateOfBrith());
    }

    @Test
    public void testEqualsAndHashCode() throws ParseException {
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setDateOfBrith("1990-01-01");

        Person person2 = new Person();
        person2.setFirstName("John");
        person2.setLastName("Doe");
        person2.setDateOfBrith("1990-01-01");

        assertEquals(person1, person2);
        assertEquals(person1.hashCode(), person2.hashCode());
    }

}