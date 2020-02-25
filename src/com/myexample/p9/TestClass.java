package com.myexample.p9;

public class TestClass {
    @MyAnnotation
    public void method1() {
        System.out.println("Running annotated method1");
    }
    public void method2() {
        System.out.println("Running isn't annotated method2");
    }
    @MyAnnotation
    public void method3() {
        System.out.println("Running annotated method3");
    }
}
