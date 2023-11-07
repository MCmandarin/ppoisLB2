package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.*;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SiteSupervisorTest {

    @Test
    void getConstructionSite() {
        SiteSupervisor ss = new SiteSupervisor();
        ConstructionSite sc = new ConstructionSite();
        ss.setConstructionSite(sc);
        assertEquals(sc, ss.getConstructionSite());
    }

    @Test
    void setConstructionSite() {
    }

    @Test
    void getWorkCrews() {
        SiteSupervisor ss = new SiteSupervisor();
        Employee e1 = new Architect();
        Employee e2 = new ProjectManager();

        ss.addWorkCrews("1", e1);
        ss.addWorkCrews("2", e2);
        Map<String, List<Employee>> map = ss.getWorkCrews();

        assertEquals(2, ss.getWorkCrews().size());
    }

    @Test
    void addWorkCrews() {
    }

    @Test
    void deleteWorkCrews() {
        SiteSupervisor ss = new SiteSupervisor();
        Employee e1 = new Architect();
        Employee e2 = new ProjectManager();

        ss.addWorkCrews("1", e1);
        ss.addWorkCrews("2", e2);
        ss.deleteWorkCrews("2");
        Map<String, List<Employee>> map = ss.getWorkCrews();

        assertEquals(1, ss.getWorkCrews().size());
    }

    @Test
    void addEmployeeInWorkCrew() {
        SiteSupervisor ss = new SiteSupervisor();
        Employee e1 = new Architect();
        Employee e2 = new ProjectManager();

        ss.addWorkCrews("1", e1);
        ss.addEmployeeInWorkCrew("1", e2);

        Map<String, List<Employee>> map = ss.getWorkCrews();
        List<Employee> employeeList = map.get("1");
        assertEquals(2, employeeList.size());
    }

    @Test
    void deleteEmployeeInWorkCrew() {
        SiteSupervisor ss = new SiteSupervisor();
        Employee e1 = new Architect();
        Employee e2 = new Architect();

        ss.addWorkCrews("1", e1);
        ss.addEmployeeInWorkCrew("1", e2);
        ss.deleteEmployeeInWorkCrew("1", e2);

        Map<String, List<Employee>> map = ss.getWorkCrews();
        List<Employee> employeeList = map.get("1");
        assertEquals(1, employeeList.size());
    }
}