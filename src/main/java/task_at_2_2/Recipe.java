package task_at_2_2;

import task_at_2_2.models.VegetableName;

import java.util.Arrays;
import java.util.List;

public enum Recipe {
    GREEK("Greek", Arrays.asList(VegetableName.CUCUMBER, VegetableName.OLIVES, VegetableName.ONION, VegetableName.TOMATO)),
    FRESH("Fresh", Arrays.asList(VegetableName.TOMATO, VegetableName.CUCUMBER, VegetableName.ONION));

    private String title;
    private List<VegetableName> vegetableNames;

    Recipe(String title, List<VegetableName> vegetableNames) {
        this.title = title;
        this.vegetableNames = vegetableNames;
    }
}
