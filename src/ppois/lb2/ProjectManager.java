package ppois.lb2;

import java.util.*;

public class ProjectManager extends Employee {
    private Set<Project> projects;

    public ProjectManager() {
        projects = new HashSet<>();
    }

    public void addProject(Project newProject) {
        for (Project i : projects) {
            if (i.getNameProject().equals(newProject.getNameProject())) {
                return;
            }
        }
        projects.add(newProject);
    }

    public void deleteProject(Project project) {
        projects.remove(project);
    }

    public Set<Project> getProjects() {
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
