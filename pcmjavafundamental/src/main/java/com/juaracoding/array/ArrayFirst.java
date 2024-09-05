package com.juaracoding.array;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayFirst {
    public static void main(String[] args) {
        char [] chArr = new char[10];
//        System.out.println(chArr[4]);
//        chArr[4]='W';
        System.out.println(chArr[5]);
        int [] intArr = new int [10];
        System.out.println(intArr[5]);
        double [] doubleArr = new double [10];
        System.out.println(doubleArr[5]);
        String [] strArr = new String[10];
        System.out.println(strArr[5]);
    }
}


