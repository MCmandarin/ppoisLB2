package ppois.lb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String toString() {
        return "SiteSupervisor [constructionSite=" + constructionSite + ", workCrews=" + workCrews + ", toString()="
                + super.toString() + "]";
    }

}
