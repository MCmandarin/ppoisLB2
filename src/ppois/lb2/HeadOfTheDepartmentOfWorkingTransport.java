package ppois.lb2;

import java.util.*;

public class HeadOfTheDepartmentOfWorkingTransport extends Employee {
    private Map<NameConstructionEquipment, List<ConstructionEquipment>> transports;

    public HeadOfTheDepartmentOfWorkingTransport() {
        transports = new HashMap<NameConstructionEquipment, List<ConstructionEquipment>>();
    }

    public Map<NameConstructionEquipment, List<ConstructionEquipment>> getTransports() {
        return transports;
    }

    public void addTypeTransports(NameConstructionEquipment name, ConstructionEquipment transport) {
        if (transport.getName() != name) {
            throw new IllegalArgumentException("invalid type!");
        }
        this.transports.put(name, null);
        List<ConstructionEquipment> transportList = transports.get(name);
        transportList = new ArrayList<>();
        transports.put(name, transportList);
        transportList.add(transport);
    }

    public void deleteTypeTransports(NameConstructionEquipment name) {
        transports.remove(name);
    }


    public void addTransport(ConstructionEquipment transport) {
        List<ConstructionEquipment> transportList = transports.get(transport.getName());
        transportList.add(transport);
    }

    public void deleteTransport(ConstructionEquipment transport) {
        List<ConstructionEquipment> transportList = transports.get(transport.getName());
        transportList.remove(transport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HeadOfTheDepartmentOfWorkingTransport that = (HeadOfTheDepartmentOfWorkingTransport) o;
        return Objects.equals(transports, that.transports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), transports);
    }

    @Override
    public String toString() {
        return "HeadOfTheDepartmentOfWorkingTransport{" +
                "transports=" + transports +
                '}';
    }
}
