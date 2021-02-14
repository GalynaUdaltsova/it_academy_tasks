package task_at_2_2;

import task_at_2_2.models.Vegetable;

import java.util.List;

public class SaladCalculator implements ICalculator {

    @Override
    public int calculateCalories(List<Vegetable> salad) {
        int calories = 0;
        if (salad == null || salad.isEmpty()) {
            throw new IllegalArgumentException("Salad can not be null or empty");
        }
        for (Vegetable vegetable : salad) {
            calories += vegetable.getCalories();
        }
        return calories;
    }
}
