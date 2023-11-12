package ppois.lb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Project {
    private String nameProject;
    private Integer price;
    private List<Employee> teamMembers;
    private Integer TimeToComplete;
    private WorkSchedule schedule;

    public Project(String nameProject) {
        this.nameProject = nameProject;
        teamMembers = new ArrayList<Employee>();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<Employee> getTeamMembers() {
        return teamMembers;
    }

    public void addEmployee(Employee teamMember) {
        if (teamMembers.contains(teamMember)) {
            return;
        }
        teamMembers.add(teamMember);
    }

    public Integer getTimeToComplete() {
        return TimeToComplete;
    }

    public void setTimeToComplete(Integer timeToComplete) {
        TimeToComplete = timeToComplete;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void updateNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public WorkSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(WorkSchedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(nameProject, project.nameProject) && Objects.equals(price, project.price) && Objects.equals(teamMembers, project.teamMembers) && Objects.equals(TimeToComplete, project.TimeToComplete) && Objects.equals(schedule, project.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProject, price, teamMembers, TimeToComplete, schedule);
    }

    @Override
    public String toString() {
        return "Project{" +
                "nameProject='" + nameProject + '\'' +
                ", price=" + price +
                ", teamMembers=" + teamMembers +
                ", TimeToComplete=" + TimeToComplete +
                ", schedule=" + schedule +
                '}';
    }
}