package task_at_2_2.models;

import java.util.Objects;

public class Vegetable {
    VegetableName vegetableName;
    int calories;
    int weight;
    String color;

    public Vegetable(VegetableName vegetableName, int calories, int weight, String color) {
        this.vegetableName = vegetableName;
        this.calories = calories;
        this.weight = weight;
        this.color = color;
    }

    public VegetableName getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(VegetableName vegetableName) {
        this.vegetableName = vegetableName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vegetable)) return false;
        Vegetable vegetable = (Vegetable) o;
        return calories == vegetable.calories &&
                weight == vegetable.weight &&
                vegetableName == vegetable.vegetableName &&
                Objects.equals(color, vegetable.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vegetableName, calories, weight, color);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "vegetableName='" + vegetableName + '\'' +
                ", calories=" + calories +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
