package ppois.lb2;

import java.util.*;

public class SiteSupervisor extends Employee {
    private ConstructionSite constructionSite;
    private Map<String, List<Employee>> workCrews;

    public SiteSupervisor() {
        workCrews = new HashMap<String, List<Employee>>();
    }

    public ConstructionSite getConstructionSite() {
        return constructionSite;
    }

    public void setConstructionSite(ConstructionSite constructionSite) {
        this.constructionSite = constructionSite;
    }

    public Map<String, List<Employee>> getWorkCrews() {
        return workCrews;
    }

    public void addWorkCrews(String nameWorkCrew, Employee employee) {
        workCrews.put(nameWorkCrew, null);
        List<Employee> employeeList = workCrews.get(nameWorkCrew);
        employeeList = new ArrayList<>();
        workCrews.put(nameWorkCrew, employeeList);
        employeeList.add(employee);

    }

    public void deleteWorkCrews(String nameWorkCrew) {
        workCrews.remove(nameWorkCrew);
    }

    public void addEmployeeInWorkCrew(String nameWorkCrew, Employee employee) {
        List<Employee> employeeList = workCrews.get(nameWorkCrew);
        employeeList.add(employee);
    }

    public void deleteEmployeeInWorkCrew(String nameWorkCrew, Employee employee) {
        List<Employee> employeeList = workCrews.get(nameWorkCrew);
        employeeList.remove(employee);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SiteSupervisor that = (SiteSupervisor) o;
        return Objects.equals(constructionSite, that.constructionSite) && Objects.equals(workCrews, that.workCrews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), constructionSite, workCrews);
    }

    @Override
    public String toString() {
        return "SiteSupervisor{" +
                "constructionSite=" + constructionSite +
                ", workCrews=" + workCrews +
                '}';
    }
}
