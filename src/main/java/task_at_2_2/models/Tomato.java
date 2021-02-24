package task_at_2_2.models;

public class Tomato extends Vegetable {

    public Tomato(int calories, int weight, String color) {
        super(VegetableName.TOMATO, calories, weight, color);
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "calories=" + super.calories +
                ", weight=" + super.weight +
                ", color='" + super.color + '\'' +
                '}';
    }
}
