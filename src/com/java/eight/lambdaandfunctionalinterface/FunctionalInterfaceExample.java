package com.java.eight.lambdaandfunctionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    void display();

    /*default method
    perfectly legal and can have any no. of default method in default method*/
    default void defaultMethod() {

    }

    /*static method
    perfectly legal and can have any no. of static method in default method*/
    static void staticMethod() {

    }

    /*Compile time error
    Unaccepted @FunctionalInterface
    Multiple non-overriding abstract methods found in interface*/
    /*String samar();*/
}
