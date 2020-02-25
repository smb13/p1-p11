package com.myexample.p1;

public class Pet {
    private String name;
    static {
        System.out.println("Static block in Pet");
    }
    {
        System.out.println("First block in Pet");
    }
    {
        System.out.println("Second block in Pet");
    }

    public Pet() {
        System.out.println("Pet empty constructor");
    }

    public Pet(String name) {
        System.out.println("Pet constructor with Name " + name);
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Bobick");
    }
}

class Cat extends Pet {

    private String name;
    static {
        System.out.println("Static block in Cat");
    }
    {
        System.out.println("First block in Cat");
    }
    {
        System.out.println("Second block in Cat");
    }

    public Cat() {
        System.out.println("Cat empty constructor");
    }

    public Cat(String name) {
        super(name);
        System.out.println("Cat constructor with Name " + name);
        this.name = name;
    }
}
    /*Вывод
    Static block in Pet
    Static block in Cat
    First block in Pet
    Second block in Pet
    Pet constructor with Name Bobick
    First block in Cat
    Second block in Cat
    Cat constructor with Name: Bobick*/
