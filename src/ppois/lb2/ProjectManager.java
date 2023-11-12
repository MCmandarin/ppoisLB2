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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProjectManager that = (ProjectManager) o;
        return Objects.equals(projects, that.projects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), projects);
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "projects=" + projects +
                '}';
    }
}
