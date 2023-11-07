package ppois.lb2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getLastName() {
        Person p1 = new Person();
        p1.setLastName("A");

        assertEquals("A", p1.getLastName());
    }

    @Test
    void getDateOfBrith() {
        Person p1 = new Person();
        p1.setDateOfBrith(2,5,2005);

        assertEquals("2/5/2005", p1.getDateOfBrith());
    }

    @Test
    void getFirstName() {
        Person p1 = new Person();
        p1.setFirstName("A");

        assertEquals("A", p1.getFirstName());
    }
}