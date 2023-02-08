package org.example;

import org.example.intrefaces.Animal;
import org.example.intrefaces.Cat;
import org.example.intrefaces.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Cat();
        Animal cat = new Dog();

        dog.getVoice();
        cat.getVoice();

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        animals.forEach(Animal::getVoice);


    }
}