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
    public int hashCode() {
        return Objects.hash(FuelTankCapacity, cost, id, name, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConstructionEquipment other = (ConstructionEquipment) obj;
        return Objects.equals(FuelTankCapacity, other.FuelTankCapacity) && Objects.equals(cost, other.cost)
                && Objects.equals(id, other.id) && name == other.name && Objects.equals(weight, other.weight);
    }

    @Override
    public String toString() {
        return "ConstructionEquipment [id=" + id + ", name=" + name + ", weight=" + weight + ", cost=" + cost
                + ", FuelTankCapacity=" + FuelTankCapacity + "]";
    }

}
