/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author 20304 Hilman Sulaeman
Java Developer
Created on 9/2/2024 8:21 PM
@Last Modified 9/2/2024 8:21 PM
Version 1.0
*/
package com.juaracoding.programmingbasic;

import java.util.ArrayList;
import java.util.List;

public class PassingBy {

    public static void main(String[] args) {

        int intX = 0;
        intX = getDataX();
        System.out.println(intX);
        List<Integer> listX = getDataList();
        int intList = listX.size();
        for (int i = 0; i < getDataList().size(); i++) {
        }
//        int intZ = "abc".length();
//        System.out.println("abc".length());
//        for (int i = 0; i < "abc".length(); i++) {
//        }
//        System.out.println(intX);
//        for (int i = 0; i < intX; i++) {
//        }
//        if(intX>10){
//        }
//        String strX = "980198340918382973498";

//        System.out.println("5"+10);
    }

    private static Integer getDataX(){
        return ((10*8)-2)+6;
    }

    private static List getDataList(){
        String strX = "Hello World";

        List list = new ArrayList();
        list.add(strX);
        list.add(strX+" abc");
        list.add(strX+" 3212");

        return list;
    }
}



