package Test;

import ppois.lb2.Architect;
import ppois.lb2.Person;
import ppois.lb2.SpecializationForArchitect;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArchitectTest {

    @org.junit.jupiter.api.Test
    void getSpecialization() {
        Architect architect = new Architect();
        architect.setSpecialization(SpecializationForArchitect.URBAN_PLANNING);
        assertEquals(SpecializationForArchitect.URBAN_PLANNING, architect.getSpecialization());
    }

    @org.junit.jupiter.api.Test
    void setSpecialization() {
        Architect architect = new Architect();
        architect.setSpecialization(SpecializationForArchitect.URBAN_PLANNING);
        assertEquals(SpecializationForArchitect.URBAN_PLANNING, architect.getSpecialization());
    }

    @org.junit.jupiter.api.Test
    void getClients() {
        Person p1 = new Person();
        Person p2 = new Person();
        Architect architect = new Architect();
        architect.addClient(p1);
        architect.addClient(p2);

        List<Person> personList = new ArrayList<>();
        personList = architect.getClients();
        assertEquals(architect.getClients(), personList);
    }

    @org.junit.jupiter.api.Test
    void addClient() {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setFirstName("A");
        p2.setFirstName("B");

        Architect a = new Architect();
        a.addClient(p1);
        a.addClient(p2);

        assertEquals(2, a.getClients().size());
    }

    @org.junit.jupiter.api.Test
    void deleteClient() {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.setFirstName("A");
        p2.setFirstName("B");

        Architect a = new Architect();
        a.addClient(p1);
        a.addClient(p2);
        a.deleteClient(p1);

        assertEquals(1, a.getClients().size());
    }
}