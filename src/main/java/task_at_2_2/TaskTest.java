package task_at_2_2;

import task_at_2_2.models.Cucumber;
import task_at_2_2.models.Onion;
import task_at_2_2.models.Tomato;

public class TaskTest {

    public static void main(String[] args) {

        CalculatorService calculatorService = new CalculatorService();

        ChiefService chiefService = new ChiefService(calculatorService);

        Cucumber cucumberOne = new Cucumber(50, 100, "green", "prickly");
        Cucumber cucumberSecond = new Cucumber(70, 130, "green", "prickly");
        Cucumber cucumberThird = new Cucumber(70, 130, "green", "prickly");
        Tomato tomatoOne = new Tomato(100, 200, "red");
        Onion onionOne = new Onion(70, 90, "green", "leek");
        Onion onionSecond = new Onion(30, 50, "pink", "Yalta");

        chiefService.addIngredientToSalad(cucumberOne);
        chiefService.addIngredientToSalad(tomatoOne);
        chiefService.addIngredientToSalad(onionOne);
        chiefService.addIngredientToSalad(onionSecond);

        chiefService.removeIngredientFromSalad(cucumberOne);

        chiefService.calculateCalories();

        chiefService.showSortedVegetablesByCalories();
        chiefService.showSortedVegetablesByWeight();

        chiefService.showVegetablesByColor("pink");
        chiefService.showVegetablesByWeightRange(10, 100);

        chiefService.compareTwoVegetables(cucumberSecond, cucumberThird);

        chiefService.showSaladIngredients();
    }
}
