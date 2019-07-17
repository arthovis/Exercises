package com.andrei.exercises.inheritance.super_key_word;

public class DemoAnimal {
    public static void main(String[] args) {
        Animal animalPet = new Pet("blue", 4, false);
        System.out.println(animalPet);

        Pet pet = new Pet("pink", 2, true);
        System.out.println(pet);

        Animal animal = new Animal("green", 6);
        System.out.println(animal);
    }
}
