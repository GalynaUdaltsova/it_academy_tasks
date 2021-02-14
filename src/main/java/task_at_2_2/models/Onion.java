package task_at_2_2.models;

public class Onion extends Vegetable {
    private String onionType;

    public Onion(int calories, int weight, String color, String onionType) {
        super(VegetableName.ONION, calories, weight, color);
        this.onionType = onionType;
    }

    public String getOnionType() {
        return onionType;
    }

    public void setOnionType(String onionType) {
        this.onionType = onionType;
    }

    @Override
    public String toString() {
        return "Onion{" +
                "vegetableName='" + super.vegetableName + '\'' +
                ", calories='" + super.calories + '\'' +
                ", weight='" + super.weight + '\'' +
                ", color='" + super.color + '\'' +
                "onionType='" + onionType + '\'' +
                '}';
    }
}
