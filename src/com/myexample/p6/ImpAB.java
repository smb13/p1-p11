package com.myexample.p6;

public class ImpAB implements A, B {
    public void getYellow () {
        System.out.println(A.YELLOW);
        System.out.println(B.YELLOW);
        //System.out.println(YELLOW); //compilation error
    }

//    Необходимо переопределить дефолтный метод с одинаковой сигнатурой в импелементируемых интерфейсах, иначе возникнет ошибка компиляции
    @Override
    public void method() {
        System.out.println("Overrided ImpAB.method");
    }
}
