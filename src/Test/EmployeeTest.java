package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.Architect;
import ppois.lb2.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getExperience() {
        Employee e = new Architect();
        e.setExperience(5);
        assertEquals(5, e.getExperience());
    }

    @Test
    void setExperience() {

    }

    @Test
    void getWorkingHours() {
        Employee e = new Architect();
        e.setWorkingHours(5);
        assertEquals(5, e.getWorkingHours());
    }

    @Test
    void setWorkingHours() {

    }

    @Test
    void getSalary() {
        Employee e = new Architect();
        e.setSalary(5);
        assertEquals(5, e.getSalary());
    }

    @Test
    void setSalary() {

    }
}