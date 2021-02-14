package task_at_2_2;

public class Onion extends Vegetables{
    private OnionType onionType;

    public Onion(int calories, int weight, String color, OnionType onionType) {
        super(calories, weight, color);
        this.onionType = onionType;
    }

    public OnionType getOnionType() {
        return onionType;
    }

    public void setOnionType(OnionType onionType) {
        this.onionType = onionType;
    }

    @Override
    public String toString() {
        return "Onion{" +
                "onionType='" + onionType + '\'' +
                ", calories='" + super.calories + '\'' +
                ", weight='" + super.weight + '\'' +
                ", color='" + super.color + '\'' +
                '}';
    }
}
