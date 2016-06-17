package Interface.AnimalImplementation;

import Interface.Animal;
import Interface.Food;
import Interface.Speed;

public class Zebra implements Animal {
    private Food food = new Food();
    private Speed speed = new Speed();

    public void eat() {
        System.out.print(getName());
        food.Vegetables();
    }

    public void run() {
        System.out.print(getName());
        speed.fast();
    }

    public String getName() {
        return "Zebras";
    }
}
