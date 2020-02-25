package com.myexample.p5;

import java.util.ArrayList;
import java.util.List;

class A {
}

class B {
}

public class Main {
    public static void test1 (List<Number> arg) {
        System.out.println("List<Number>");
        arg.add(new Integer(10));
    }

    public static void test2 (List<? extends Number> arg) {
        System.out.println("List<? extends Number>");
//        arg.add(new Integer(10)); //PECS
    }

    public static void test3 (List<? super Number> arg) {
        System.out.println("List<? super Number");
        arg.add(new Integer(10));
    }

    public static void test4 (List<?> arg) {
        System.out.println("List<?>");
        //arg.add(new Integer(10)); //PECS
    }

    public static void test5 (List<Object> arg) {
        System.out.println("List<Object>");
        arg.add(new Integer(10));
    }

    public static void test6 (List arg) {
        System.out.println("List");
        arg.add(new Integer(10));
    }


    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>();
        List<? extends Number> list2 = new ArrayList<>();
        List<? super Number> list3 = new ArrayList<>();
        List<?> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();
        List list6 = new ArrayList<>();

        //test1 List<Number>
        test1(list1);
        //test1(list2); //ошибка компиляции (инвариантность)
        //test1(list3); //ошибка компиляции (инвариантность)
        //test1(list4); //ошибка компиляции (инвариантность)
        //test1(list5); //ошибка компиляции (инвариантность)
        test1(list6);

        //test2 List<? extends Number>
        test2(list1);
        test2(list2);
        //test2(list3); //ошибка компиляции (ковариантность)
        //test2(list4); //ошибка компиляции (ковариантность)
        //test2(list5); //ошибка компиляции (инвариантность)
        test1(list6);

        //test3 List<? super Number>
        test3(list1);
        //test3(list2); //ошибка компиляции (ковариантность)
        test3(list3);
        //test3(list4); //ошибка компиляции (ковариантность)
        test3(list5);
        test1(list6);


        //test4 List<?>
        test4(list1);
        test4(list2);
        test4(list3);
        test4(list4);
        test4(list5);
        test4(list6);


        //test5 List<Object>
//        test5(list1); //ошибка компиляции (инвариантность)
//        test5(list2); //ошибка компиляции (инвариантность)
//        test5(list3); //ошибка компиляции (инвариантность)
//        test5(list4); //ошибка компиляции (инвариантность)
        test5(list5);
        test5(list6);


        //test6 List
        test6(list1);
        test6(list2);
        test6(list3);
        test6(list4);
        test6(list5);
        test1(list6);


//      Можем ли скастить список к другому списку
        List<A> listA = new ArrayList<>();
        listA.add(new A());
        List<B> listB = (List<B>) (List<?>) listA;
        listB.add(new B());
        for (Object item : listB) {
            System.out.println(item.toString());
        }
    }
}
