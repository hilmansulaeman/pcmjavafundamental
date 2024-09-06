package com.juaracoding.oop;

import java.util.Random;

public class CallClassModified {
    static Random rand;

    public static void main(String[] args) {
        ClassToModified classToModified = new ClassToModified();
        rand.nextInt();
        rand.nextDouble();
        rand.nextLong();
        rand.nextFloat();
        rand.nextDouble();
    }
    public static void fungsi1() {
        int intLength = "".length();
        new Random().nextDouble();
        fungsi2();
    }
    public static void fungsi2() {

        new Random().nextFloat();
        fungsi3();
    }
    public static void fungsi3() {
        new Random().nextLong();
        fungsi4();
    }
    public static void fungsi4() {

        new Random().nextLong();
        fungsi5();
    }
    public static void fungsi5() {
        new Random().nextLong();
    }
}
