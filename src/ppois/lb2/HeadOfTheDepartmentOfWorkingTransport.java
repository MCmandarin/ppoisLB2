package ppois.lb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HeadOfTheDepartmentOfWorkingTransport extends Employee {
    private Map<NameConstructionEquipment, List<ConstructionEquipment>> transports;

    public HeadOfTheDepartmentOfWorkingTransport() {
        transports = new HashMap<NameConstructionEquipment, List<ConstructionEquipment>>();
    }

    public Map<NameConstructionEquipment, List<ConstructionEquipment>> getTransports() {
        return transports;
    }

    public void addTypeTransports(NameConstructionEquipment name, ConstructionEquipment transport) {
        if(transport.getName() != name){
            throw new RuntimeException("invalid type!");
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

}
