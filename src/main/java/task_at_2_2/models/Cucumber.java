package task_at_2_2.models;

public class Cucumber extends Vegetable {
    private String cucumberType;

    public Cucumber(int calories, int weight, String color, String cucumberType) {
        super(VegetableName.CUCUMBER, calories, weight, color);
        this.cucumberType = cucumberType;
    }

    public String getCucumberType() {
        return cucumberType;
    }

    public void setCucumberType(String cucumberType) {
        this.cucumberType = cucumberType;
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "vegetableName='" + super.vegetableName + '\'' +
                "calories=" + super.calories + '\'' +
                ", weight=" + super.weight + '\'' +
                ", color='" + super.color + '\'' +
                ", cucumberType=" + cucumberType + '\'' +
                '}';
    }
}
