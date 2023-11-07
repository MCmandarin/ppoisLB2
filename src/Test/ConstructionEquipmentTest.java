package Test;

import org.junit.jupiter.api.Test;
import ppois.lb2.ConstructionEquipment;
import ppois.lb2.NameConstructionEquipment;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ConstructionEquipmentTest {

    @Test
    void getId() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ce.setId(1L);
        assertEquals(1L, ce.getId());
    }

    @Test
    void setId() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ce.setId(1L);
        assertEquals(1L, ce.getId());
    }

    @Test
    void getName() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        assertEquals(NameConstructionEquipment.AUTODUMPER, ce.getName());
    }

    @Test
    void updateName() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ce.updateName(NameConstructionEquipment.BULLDOZER);
        assertEquals(NameConstructionEquipment.BULLDOZER, ce.getName());
    }

    @Test
    void getWeight() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ce.setWeight(500D);
        assertEquals(500D, ce.getWeight());
    }

    @Test
    void setWeight() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ce.setWeight(500D);
        assertEquals(500D, ce.getWeight());
    }

    @Test
    void getCost() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        BigDecimal bigDecimal =new BigDecimal(5_000_000);
        ce.setCost(bigDecimal);
        assertEquals(bigDecimal, ce.getCost());
    }

    @Test
    void setCost() {
    }

    @Test
    void getFuelTankCapacity() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ce.setWeight(5_000_000D);
        assertEquals(5_000_000D, ce.getWeight());
    }

    @Test
    void setFuelTankCapacity() {
        ConstructionEquipment ce = new ConstructionEquipment(NameConstructionEquipment.AUTODUMPER);
        ce.setFuelTankCapacity(50D);
        assertEquals(50D, ce.getFuelTankCapacity());
    }
}