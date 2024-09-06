package com.juaracoding.array;

import java.util.Random;

public class LoopingArray {

    public static void main(String[] args) {
        Random rand = new Random();
        int intArr [] = new int[10];
        int arrLength = intArr.length;
        int intAssign = 0;
        for (int i = 0; i < arrLength; i++) {
            intAssign = rand.nextInt(100);
            System.out.println(intAssign);
            intArr[i] = intAssign;
        }

        for (int i = 0; i < arrLength; i++) {
            System.out.println("Nilai intArr index ke "+i+" : "+intArr[i]);
        }

    }
}
