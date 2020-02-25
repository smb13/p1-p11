package com.myexample.p2;

public class Pet {
    private String name;

    public Pet() {
        method ();
        staticMethod ();
        System.out.println("Pet empty constructor");
    }

    public Pet(String name) {
        method ();
        staticMethod ();
        System.out.println("Pet constructor with Name " + name);
        this.name = name;
    }

    public static void staticMethod (){
        System.out.println("Executing staticMethod in Pet");
    }

    public void method (){
        System.out.println("Executing method in Pet");
    }

    public static void main(String[] args) {
        /*Код конструктора должен заниматься только инициализацией объекта. Следует избегать
        вызовов из конструктора других методов, за исключением final. Метод может быть
        переопределен в подклассе и исказить процесс инициализации объекта.*/
        Cat cat = new Cat("Bobick");
    }
}

class Cat extends Pet {

    private String name;

    public Cat() {
        super();
        method ();
        staticMethod ();
        System.out.println("Cat empty constructor");
    }

    public Cat(String name) {
        //super(name);
        method ();
        staticMethod ();
        System.out.println("Cat constructor with Name " + name);
        this.name = name;
    }

    public static void staticMethod (){
        System.out.println("Executing staticMethod in Cat");
    }

    public void method (){
        System.out.println("Executing method in Cat");
    }
}