package task_at_2_2.models;

import java.util.Objects;

public class Onion extends Vegetable {
    private String type;

    public Onion(int calories, int weight, String color, String type) {
        super(VegetableName.ONION, calories, weight, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Onion)) return false;
        if (!super.equals(o)) return false;
        Onion onion = (Onion) o;
        return Objects.equals(type, onion.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Onion{" +
                "calories=" + super.calories +
                ", weight=" + super.weight +
                ", color='" + super.color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
