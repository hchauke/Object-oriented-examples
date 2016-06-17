package Overriding;

import java.util.ArrayList;
import java.util.List;

public class OverridingExample {
    public static void main(String[] args) {

        final Animal dog = new Dog(); //Overriding.Animal reference but dog object
        final Animal cat = new Cat();
        final Animal fish = new Fish();

        List<Animal> animals = new ArrayList<Animal>(){{
            add(dog); add(cat); add(fish);
        }};

        Zoo zoo = new Zoo(animals);

        zoo.lunchTime();
    }
}

class Animal{
    public void eat(Food food){
        food.Meat();
        food.Vegetables();
    }
}

class Dog extends Animal{
    public void eat(Food food){
        food.Meat();
    }
}

class Cat extends Animal{
    public void eat(Food food){
        food.Milk();
    }
}

class Fish extends Animal{
    public void eat(Food food){
        food.Vegetables();
    }
}

class Food{
    public void Meat(){
        System.out.println("\n This animal eat meat");
    }

    public void Vegetables(){
        System.out.println("\n This animal eat vegetables");
    }

    public void Milk(){
        System.out.println("\n This animal drinks milk");
    }
}

class Zoo {

    private List<Animal> animals;

    public Zoo(List<Animal> animals){
        this.animals = animals;
    }


    public void lunchTime(){
        for (int i = 0; i < this.animals.size(); i++) {
            this.animals.get(i).eat(new Food());
        }

    }
}

