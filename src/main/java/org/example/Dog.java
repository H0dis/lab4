package org.example;
package ro.uoradea.lab;

public class Dog {
    String name;
    String breed;
public Dog(String name, String breed){
    this.name = name;
    this.breed = breed;
}
    public void setName(String nameSetter) {
        this.name = nameSetter;
    }
public String getBreed(String setBreed){
        this.breed = breed;
}
public String getBreed(){
        return breed;
}
    public String getName(){
        return this.name;
    }
}

