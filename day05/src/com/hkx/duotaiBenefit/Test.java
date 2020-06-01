package com.hkx.duotaiBenefit;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        getAnimal(dog);
        System.out.println("---------");
        Animal an = new Dog();
        an.eat();

    }
    public static void getAnimal(Animal animal){
        System.out.println("好吃");
        animal.eat();
    }
}
