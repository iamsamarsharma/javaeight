package com.java.eight.lambdaandfunctionalinterface.withpredefinemethodinjava;

import java.util.concurrent.Callable;

/*
when you have a return type with out any parameter we can use CallableInterface
* */
public class WithCallable {

    public static void main(String[] args) throws Exception {
        Callable<String> callable =  () -> "Hello with callable";
        System.out.println(callable.call());
    }
}
