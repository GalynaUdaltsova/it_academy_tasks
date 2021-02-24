package task_at_2_2;

import task_at_2_2.models.Vegetable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ChiefService {
    private static final String THE_VEGETABLE_CANNOT_BE_NULL_MESSAGE = "The vegetable cannot be null";
    private static final String CALORIES = "calories";
    private static final String WEIGHT = "weight";
    private static final String SALAD_INGREDIENTS_ARE_SORTED_BY = "The salad ingredients are sorted by %s: ";

    private List<Vegetable> salad;
    private CalculatorService calculatorService;

    public ChiefService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
        this.salad = new ArrayList<>();
    }

    public void addIngredientToSalad(Vegetable vegetable) {
        if (vegetable == null) {
            System.out.println(THE_VEGETABLE_CANNOT_BE_NULL_MESSAGE);
            return;
        }
        salad.add(vegetable);
        System.out.println(String.format("The %s is added to salad", vegetable.getVegetableName()));
    }

    public void removeIngredientFromSalad(Vegetable vegetable) {
        if (vegetable == null) {
            System.out.println(THE_VEGETABLE_CANNOT_BE_NULL_MESSAGE);
            return;
        }
        if (!salad.remove(vegetable)) {
            System.out.println("This vegetable is not in the salad");
            return;
        }
        System.out.println(String.format("The %s is removed", vegetable.getVegetableName()));
    }

    public void showSaladIngredients() {
        printSalad("The salad contains a following ingredients: ");
    }

    public void calculateCalories() {
        int calories = calculatorService.calculateCalories(salad);
        System.out.println(String.format("\nTotal salad calories is : %s", calories));
    }

    public void showSortedVegetablesByCalories() {
        salad.sort(Comparator.comparingInt(Vegetable::getCalories));
        printSalad(String.format(SALAD_INGREDIENTS_ARE_SORTED_BY, CALORIES));
    }

    public void showSortedVegetablesByWeight() {
        salad.sort(Comparator.comparingInt(Vegetable::getWeight));
        printSalad(String.format(SALAD_INGREDIENTS_ARE_SORTED_BY, WEIGHT));
    }

    public void showVegetablesByColor(String color) {
        salad.stream()
                .filter(vegetable -> color.equalsIgnoreCase(vegetable.getColor()))
                .forEach(System.out::println);
    }

    public void showVegetablesByWeightRange(int minWeight, int maxWeight) {
        salad.stream()
                .filter(vegetable -> minWeight < vegetable.getWeight() && maxWeight > vegetable.getWeight())
                .forEach(System.out::println);
    }

    public void compareTwoVegetables(Vegetable vegetableOne, Vegetable vegetableTwo) {
        String equality = "";
        if (!vegetableOne.equals(vegetableTwo)) {
            equality = " not";
        }
        System.out.println(String.format("\nThe vegetables are%s equal", equality));
    }

    private void printSalad(String message) {
        System.out.println("\n" + message);
        salad.forEach(System.out::println);
    }
}
