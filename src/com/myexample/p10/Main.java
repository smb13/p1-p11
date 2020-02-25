package com.myexample.p10;

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface<Integer> sum = (x, y, z) -> {
            x = x + y + z;
            System.out.println(x);
            return x;
        };

        MyFunctionalInterface<Integer> composition = (x, y, z) -> {
            x = x * y * z;
            System.out.println(x);
            return x;
        };

        MyFunctionalInterface<Integer> biggest = (x, y, z) -> {
            x = (x > y ? x : y) > z ? (x > y ? x : y) : z;
            System.out.println(x);
            return x;
        };

        sum.myAction(1, 2, 3);
        composition.myAction(1, 2, 3);
        biggest.myAction(1, 2, 3);
    }
}
