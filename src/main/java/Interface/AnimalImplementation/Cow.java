package Interface.AnimalImplementation;

import Interface.Animal;
import Interface.Food;
import Interface.Speed;

public class Cow implements Animal {

    private Food kind = new Food();
    private Speed speed = new Speed();

    public void eat() {
        System.out.print(getName());
        kind.Vegetables();
    }

    public void run() {
        System.out.print(getName());
        speed.slow();
    }

    public String getName() {
        return "Cows";
    }
}
