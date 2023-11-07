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
    public int hashCode() {
        return Objects.hash(TimeToComplete, nameProject, price, schedule, teamMembers);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Project other = (Project) obj;
        return Objects.equals(TimeToComplete, other.TimeToComplete) && Objects.equals(nameProject, other.nameProject)
                && Objects.equals(price, other.price) && Objects.equals(schedule, other.schedule)
                && Objects.equals(teamMembers, other.teamMembers);
    }

    @Override
    public String toString() {
        return "Project [nameProject=" + nameProject + ", price=" + price + ", teamMembers=" + teamMembers
                + ", TimeToComplete=" + TimeToComplete + ", schedule=" + schedule + "]";
    }

}