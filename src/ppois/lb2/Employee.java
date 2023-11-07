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
            throw new RuntimeException("Incorrect input!");
        } else {
            this.experience = experience;
        }
    }

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        if (workingHours < 0) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.workingHours = workingHours;
        }
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        if (salary < 0) {
            throw new RuntimeException();
        } else {
            this.salary = salary;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(experience, salary, workingHours);
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
        Employee other = (Employee) obj;
        return Objects.equals(experience, other.experience) && Objects.equals(salary, other.salary)
                && Objects.equals(workingHours, other.workingHours);
    }

    @Override
    public String toString() {
        return "Employee [experience=" + experience + ", workingHours=" + workingHours + ", salary=" + salary
                + ", toString()=" + super.toString() + "]";
    }

}
