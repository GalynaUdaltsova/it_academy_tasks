package task_at_2_2;

import task_at_2_2.models.*;

import java.util.ArrayList;
import java.util.List;

public class Stockroom {

    public List<Vegetable> storeVegetables() {
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Cucumber(110, 150, "green", "smooth"));
        vegetables.add(new Cucumber(80, 100, "green", "prickly"));
        vegetables.add(new Tomato(120, 180, "red"));
        vegetables.add(new Tomato(170, 220, "pink"));
        vegetables.add(new Onion(35, 20, "pink", "yalta"));
        vegetables.add(new Onion(55, 40, "green", "leek"));
        vegetables.add(new Olives(75, 25, "green"));
        vegetables.add(new Olives(90, 15, "black"));
        return vegetables;
    }

}
