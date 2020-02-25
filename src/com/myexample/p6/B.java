package com.myexample.p6;

public interface B {
    int YELLOW = 3, ORANGE = 5, INDIGO = 6, VIOLET = 7;
    default void method() {
        System.out.println("B.method");
    }
}
