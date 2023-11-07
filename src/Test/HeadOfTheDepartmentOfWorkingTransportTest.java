package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.ConstructionEquipment;
import ppois.lb2.HeadOfTheDepartmentOfWorkingTransport;
import ppois.lb2.NameConstructionEquipment;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HeadOfTheDepartmentOfWorkingTransportTest {

    @Test
    void getTypeTransports() {
        HeadOfTheDepartmentOfWorkingTransport h = new HeadOfTheDepartmentOfWorkingTransport();
        ConstructionEquipment cs1 = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ConstructionEquipment cs2 = new ConstructionEquipment(NameConstructionEquipment.BULLDOZER);

        h.addTypeTransports(NameConstructionEquipment.AUTODUMPER, cs1);
        h.addTypeTransports(NameConstructionEquipment.BULLDOZER, cs2);
        Map<NameConstructionEquipment, List<ConstructionEquipment>> map = h.getTransports();

        assertEquals(2, h.getTransports().size());
    }

    @Test
    void addTypeTransports() {
    }

    @Test
    void deleteTypeTransports() {
        HeadOfTheDepartmentOfWorkingTransport h = new HeadOfTheDepartmentOfWorkingTransport();
        ConstructionEquipment cs1 = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ConstructionEquipment cs2 = new ConstructionEquipment(NameConstructionEquipment.BULLDOZER);

        h.addTypeTransports(NameConstructionEquipment.AUTODUMPER, cs1);
        h.addTypeTransports(NameConstructionEquipment.BULLDOZER, cs2);
        h.deleteTypeTransports(NameConstructionEquipment.AUTODUMPER);
        Map<NameConstructionEquipment, List<ConstructionEquipment>> map = h.getTransports();

        assertEquals(1, h.getTransports().size());
    }

    @Test
    void addTransport() {
        HeadOfTheDepartmentOfWorkingTransport h = new HeadOfTheDepartmentOfWorkingTransport();
        ConstructionEquipment cs1 = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ConstructionEquipment cs2 = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);

        h.addTypeTransports(NameConstructionEquipment.AUTODUMPER, cs1);
        h.addTransport(cs2);

        Map<NameConstructionEquipment, List<ConstructionEquipment>> transports = h.getTransports();
        List<ConstructionEquipment> transportList = transports.get(NameConstructionEquipment.AUTODUMPER);
        assertEquals(2, transportList.size());
    }


    @Test
    void deleteTransport() {
        HeadOfTheDepartmentOfWorkingTransport h = new HeadOfTheDepartmentOfWorkingTransport();
        ConstructionEquipment cs1 = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ConstructionEquipment cs2 = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        cs1.setId(1L);
        cs2.setId(2L);

        h.addTypeTransports(NameConstructionEquipment.AUTODUMPER, cs1);
        h.deleteTransport(cs2);

        Map<NameConstructionEquipment, List<ConstructionEquipment>> transports = h.getTransports();
        List<ConstructionEquipment> transportList = transports.get(NameConstructionEquipment.AUTODUMPER);
        assertEquals(1, transportList.size());
    }
}