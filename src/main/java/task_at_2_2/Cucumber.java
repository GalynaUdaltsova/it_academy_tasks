package task_at_2_2;

public class Cucumber extends Vegetables{
    private CucumberType cucumberType;

    public Cucumber(int calories, int weight, String color, CucumberType cucumberType) {
        super(calories, weight, color);
        this.cucumberType = cucumberType;
    }

    public CucumberType getCucumberType() {
        return cucumberType;
    }

    public void setCucumberType(CucumberType cucumberType) {
        this.cucumberType = cucumberType;
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "calories=" + super.calories + '\'' +
                ", weight=" + super.weight + '\'' +
                ", color='" + super.color + '\'' +
                ", cucumberType=" + cucumberType + '\'' +
                '}';
    }
}
