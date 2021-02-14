package task_at_2_2.models;

public class Vegetable {
    protected VegetableName vegetableName;
    protected int calories;
    protected int weight;
    protected String color;

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
    public String toString() {
        return "Vegetables{" +
                "vegetableName='" + vegetableName + '\'' +
                "calories='" + calories + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
