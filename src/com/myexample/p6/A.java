package com.myexample.p6;

public interface A {
    int YELLOW = 8, CYAN = 16, MAGENTA = 32;
    Object obj = new Object();
    default void method() {
        System.out.println("A.method");
    }
}
