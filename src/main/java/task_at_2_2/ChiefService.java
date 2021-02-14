package task_at_2_2;

import task_at_2_2.models.Vegetable;

import java.util.List;

public class ChiefService {
    private SaladCalculator saladCalculator;
    private Stockroom stockroom;

    public ChiefService(SaladCalculator saladCalculator) {
        this.saladCalculator = saladCalculator;
    }

    public List<Vegetable> createSalad(Recipe recipe) {

        return null;
    }
}
