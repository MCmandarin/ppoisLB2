package ppois.lb2;

import java.util.Objects;

public abstract class Employee extends Person {
    private Integer experience;
    private Integer workingHours;
    private Integer salary;

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        if (experience < 0) {
            throw new IllegalArgumentException("experience cannot be less than 0");
        } else {
            this.experience = experience;
        }
    }

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        if (workingHours < 0) {
            throw new IllegalArgumentException("Time cannot be less than 0");
        } else {
            this.workingHours = workingHours;
        }
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be less than 0");
        } else {
            this.salary = salary;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(experience, employee.experience) && Objects.equals(workingHours, employee.workingHours) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience, workingHours, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                ", workingHours=" + workingHours +
                ", salary=" + salary +
                '}';
    }
}
