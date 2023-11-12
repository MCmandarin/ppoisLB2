package ppois.lb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Architect extends Employee {
    private SpecializationForArchitect specialization;
    private List<Person> clients;

    public Architect() {
        clients = new ArrayList<Person>();
    }

    public SpecializationForArchitect getSpecialization() {
        return specialization;
    }

    public void setSpecialization(SpecializationForArchitect specialization) {
        this.specialization = specialization;
    }

    public List<Person> getClients() {
        return clients;
    }

    public void addClient(Person person) {
        if (clients.contains(person)) {
            return;
        }
        clients.add(person);
    }

    public void deleteClient(Person person) {
        clients.remove(person);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Architect architect = (Architect) o;
        return specialization == architect.specialization && Objects.equals(clients, architect.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialization, clients);
    }

    @Override
    public String toString() {
        return "Architect{" +
                "specialization=" + specialization +
                ", clients=" + clients +
                '}';
    }
}
