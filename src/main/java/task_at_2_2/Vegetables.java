package task_at_2_2;

public class Vegetables {
    protected int calories;
    protected int weight;
    protected String color;

    public Vegetables(int calories, int weight, String color) {
        this.calories = calories;
        this.weight = weight;
        this.color = color;
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
                "calories='" + calories + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
