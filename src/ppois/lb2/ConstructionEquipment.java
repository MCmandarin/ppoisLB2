package ppois.lb2;

import java.math.BigDecimal;
import java.util.Objects;

public class ConstructionEquipment {
    private Long id;
    private NameConstructionEquipment name;
    private Double weight;
    private BigDecimal cost;
    private Double FuelTankCapacity;

    public ConstructionEquipment(NameConstructionEquipment name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NameConstructionEquipment getName() {
        return name;
    }

    public void updateName(NameConstructionEquipment name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Double getFuelTankCapacity() {
        return FuelTankCapacity;
    }

    public void setFuelTankCapacity(Double fuelTankCapacity) {
        FuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstructionEquipment that = (ConstructionEquipment) o;
        return Objects.equals(id, that.id) && name == that.name && Objects.equals(weight, that.weight) && Objects.equals(cost, that.cost) && Objects.equals(FuelTankCapacity, that.FuelTankCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight, cost, FuelTankCapacity);
    }

    @Override
    public String toString() {
        return "ConstructionEquipment{" +
                "id=" + id +
                ", name=" + name +
                ", weight=" + weight +
                ", cost=" + cost +
                ", FuelTankCapacity=" + FuelTankCapacity +
                '}';
    }
}
