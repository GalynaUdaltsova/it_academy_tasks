package task_at_2_2.models;

import java.util.Objects;

public class Cucumber extends Vegetable {
    private String type;

    public Cucumber(int calories, int weight, String color, String type) {
        super(VegetableName.CUCUMBER, calories, weight, color);
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
        if (!(o instanceof Cucumber)) return false;
        if (!super.equals(o)) return false;
        Cucumber cucumber = (Cucumber) o;
        return Objects.equals(type, cucumber.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "calories='" + super.calories + '\'' +
                ", weight='" + super.weight + '\'' +
                ", color='" + super.color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
