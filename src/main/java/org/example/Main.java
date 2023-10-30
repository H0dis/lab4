package org.example;


public class Main {
    public static void Main(String[]argv){
        Dog firstDog = new Dog("nume1", "husky");
        Dog SecondDog = new Dog("nume2", "husky2");
        System.out.println(firstDog.getName());
        System.out.println(SecondDog.getName());
        System.out.println(firstDog.getBreed());
        System.out.println(SecondDog.getBreed());
    }

    }