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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Architect other = (Architect) obj;
        return Objects.equals(clients, other.clients) && specialization == other.specialization;
    }

    @Override
    public String toString() {
        return "Architect [specialization=" + specialization + ", clients=" + clients + ", toString()="
                + super.toString() + "]";
    }

}
