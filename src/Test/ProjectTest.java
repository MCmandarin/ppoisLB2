package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.Architect;
import ppois.lb2.Employee;
import ppois.lb2.Project;
import ppois.lb2.WorkSchedule;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void getPrice() {
        Project p = new Project("1");
        p.setPrice(5);
        assertEquals(5, p.getPrice());
    }

    @Test
    void setPrice() {
    }

    @Test
    void getTeamMembers() {
        Project p = new Project("1");
        Employee e1 = new Architect();
        p.addEmployee(e1);
        List<Employee> list = p.getTeamMembers();

        assertEquals(1, p.getTeamMembers().size());
    }

    @Test
    void addEmployee() {
        Project p = new Project("1");
        Employee e1 = new Architect();
        Employee e2 = new Architect();
        p.addEmployee(e1);
        p.addEmployee(e2);
        List<Employee> list = p.getTeamMembers();

        assertEquals(1, p.getTeamMembers().size());
    }

    @Test
    void getTimeToComplete() {
        Project p = new Project("1");
        p.setTimeToComplete(5);
        assertEquals(5, p.getTimeToComplete());
    }

    @Test
    void setTimeToComplete() {
    }

    @Test
    void getNameProject() {
        Project p = new Project("1");
        assertEquals("1", p.getNameProject());
    }

    @Test
    void updateNameProject() {
        Project p = new Project("1");
        p.updateNameProject("2");
        assertEquals("2", p.getNameProject());
    }

    @Test
    void getSchedule() {
        Project p = new Project("1");
        WorkSchedule ws = new WorkSchedule();
        p.setSchedule(ws);
        assertEquals(ws, p.getSchedule());
    }

    @Test
    void setSchedule() {
    }
}