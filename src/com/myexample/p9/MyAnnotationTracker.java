package com.myexample.p9;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class MyAnnotationTracker {
    public static void myAnnotationExecutor(Object obj) throws Exception {
        for (Method m : obj.getClass().getMethods()) {
            MyAnnotation ma = m.getAnnotation(MyAnnotation.class);
            if (ma != null) {
                m.invoke(obj);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        TestClass testClass = new TestClass();
        InheritedTestClass inheritedTestClass = new InheritedTestClass();
        System.out.println("TestClass:");
        myAnnotationExecutor(testClass);
        System.out.println("InheritedTestClass:");
        myAnnotationExecutor(inheritedTestClass);
        //https://docs.oracle.com/javase/7/docs/api/java/lang/annotation/Inherited.html
        //Note that this meta-annotation type has no effect if the annotated type is used to annotate anything other than a class. Note also that this meta-annotation only causes annotations to be inherited from superclasses; annotations on implemented interfaces have no effect    }
    }
}
