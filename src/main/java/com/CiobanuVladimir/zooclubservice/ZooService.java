package com.CiobanuVladimir.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal dog = new Dog("Laika");
        Cat cat = new Cat("Sonic");
        Dog secondDog = new Dog("Virus");
        dog.eat();
        cat.makeSound();
        cat.eat();
    }
}
