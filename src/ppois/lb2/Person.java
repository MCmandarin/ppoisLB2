package ppois.lb2;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String dateOfBrith;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(int day, int month, int year) {
        if (day > 30 || day < 1 || month > 12 || month < 1 || year < 1900 || year > 2023) {
            throw new RuntimeException("Incorrect input!");
        } else {
            this.dateOfBrith = day + "/" + month + "/" + year;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfBrith, firstName, lastName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(dateOfBrith, other.dateOfBrith) && Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName);
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBrith=" + dateOfBrith + "]";
    }

}
