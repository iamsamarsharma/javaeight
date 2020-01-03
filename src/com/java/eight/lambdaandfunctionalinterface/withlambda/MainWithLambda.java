package com.java.eight.lambdaandfunctionalinterface.withlambda;

import java.util.concurrent.Callable;

public class MainWithLambda {
    public static void main(String[] args) {
        /*Intref intref = () -> System.out.println(m1() method implementation)*/
        Intref intref = () -> System.out.println("functional interface implementation");
        intref.m1();

        /*Using predefine java function in this case Runnable*/
        Runnable runnable = () -> System.out.println("implementation with Runnable ");
        runnable.run();;

    }
}
