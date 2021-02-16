package task_at_2_2_add.models;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<VegetableName> getVegetableNames() {
        return vegetableNames;
    }

    public void setVegetableNames(List<VegetableName> vegetableNames) {
        this.vegetableNames = vegetableNames;
    }
}
