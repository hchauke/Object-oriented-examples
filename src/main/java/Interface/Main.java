package Interface;

import Interface.AnimalImplementation.Cow;
import Interface.AnimalImplementation.leopard;
import Interface.AnimalImplementation.Tiger;
import Interface.AnimalImplementation.Zebra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final Animal tiger = new Tiger();
        final Animal leopard = new leopard();
        final Animal zebra = new Zebra();
        final Animal cow = new Cow();

        List<Animal> animals = new ArrayList<Animal>(){{
            add(tiger); add(leopard); add(zebra); add(cow);
        }};

        Forest forest = new Forest(animals);
        forest.lunch();
        forest.racing();
    }
}
