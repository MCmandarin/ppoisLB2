package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.Project;
import ppois.lb2.ProjectManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectManagerTest {

    @Test
    void addProject() {
        ProjectManager pm = new ProjectManager();
        Project p = new Project("1");
        pm.addProject(p);

        assertEquals(1, pm.getProjects().size());
    }

    @Test
    void notAddProject() {
        ProjectManager pm = new ProjectManager();
        Project p1 = new Project("1");
        Project p2 = new Project("2");
        Project p3 = new Project("2");
        pm.addProject(p1);
        pm.addProject(p2);
        pm.addProject(p3);

        assertEquals(2, pm.getProjects().size());
    }

    @Test
    void deleteProject() {
        ProjectManager pm = new ProjectManager();
        Project p = new Project("1");
        pm.addProject(p);
        pm.deleteProject(p);
        assertEquals(0, pm.getProjects().size());
    }

    @Test
    void equals() {
        ProjectManager pm1 = new ProjectManager();
        pm1.setSalary(5000);
        ProjectManager pm2 = new ProjectManager();
        pm2.setSalary(10000);

        assertEquals(false, pm1.equals(pm2));
    }

    @Test
    void equals2() {
        Project p1 = new Project("1");
        Project p2 = new Project("2");
        ProjectManager pm1 = new ProjectManager();
        pm1.addProject(p1);
        ProjectManager pm2 = new ProjectManager();
        pm1.addProject(p2);

        assertEquals(false, pm1.equals(pm2));
    }

}