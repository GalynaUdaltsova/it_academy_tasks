package task_at_2_2;

import task_at_2_2.models.Vegetable;

import java.util.List;

public class CalculatorService {

    public int calculateCalories(List<Vegetable> salad) {
        int calories = 0;
        if (salad == null || salad.isEmpty()) {
            return 0;
        }
        for (Vegetable vegetable : salad) {
            calories += vegetable.getCalories();
        }
        return calories;
    }
}
