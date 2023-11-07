package ppois.lb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProjectManager extends Employee {
    private List<Project> projects;

    public ProjectManager() {
        projects = new ArrayList<Project>();
    }

    public void addProject(Project project) {
        for (Project i : projects) {
            if (i.getNameProject().equals(project.getNameProject())) {
                return;
            }
        }
        projects.add(project);
    }

    public void deleteProject(Project project) {
        projects.remove(project);
    }

    public List<Project> getProjects() {
        return projects;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(projects);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProjectManager other = (ProjectManager) obj;
        return Objects.equals(projects, other.projects);
    }

    @Override
    public String toString() {
        return "ProjectManager [projects=" + projects + ", toString()=" + super.toString() + "]";
    }

}
