package Interface.AnimalImplementation;

import Interface.Animal;
import Interface.Food;
import Interface.Speed;

public class leopard implements Animal {
    private Food food = new Food();
    private Speed speed = new Speed();

    public void eat() {
        System.out.print(getName());
        food.Meat();
    }

    public void run() {
        System.out.print(getName());
        speed.slow();
    }

    public String getName() {
        return "Leopards";
    }
}
