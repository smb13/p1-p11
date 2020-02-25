package com.myexample.p6;

public class Main {

    public static void main(String[] args) {
	    ImpAB example = new ImpAB();
	    example.getYellow();
        example.method();

	    ImpA1 impA1 = new ImpA1();
        ImpA2 impA2 = new ImpA2();
        System.out.println(impA1.getObj() == impA2.getObj());
    }
}
