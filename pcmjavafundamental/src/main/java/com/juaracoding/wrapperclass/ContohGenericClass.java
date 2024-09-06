package com.juaracoding.wrapperclass;

import com.juaracoding.model.BuatPassing;

import java.util.ArrayList;
import java.util.List;

public class ContohGenericClass {

    public static void main(String[] args) {
//        List<Double> list = new ArrayList<Double>();
//
//        String strNomor = "5";
//        int intNomor = Integer.parseInt(strNomor);
//        System.out.println();//10010

//        int intX = 2;//2
//        int intY = intX;//2
//        System.out.println(intX);
//        System.out.println(intY);
//        intY = 4;
//        System.out.println(intX);
//        System.out.println(intY);


//        BuatPassing buatPassing = new BuatPassing();// rak -> a1b0df
//        BuatPassing buatPassing1 = buatPassing;//a1b0df
//        System.out.println(buatPassing);
//        System.out.println(buatPassing1);
//
//        buatPassing.setId(5);
//        System.out.println(buatPassing1.getId());
//
//        buatPassing1.setId(7);
//        System.out.println(buatPassing.getId());
//
//        Integer integerX = 10;
//        int integerY = integerX;
//        System.out.println(integerX);
//        System.out.println(integerY);
//
//        integerY = 12;
//        System.out.println(integerX);
//        System.out.println(integerY);

//        int intX = 8;
//        intX = injectValuePrimitive(intX);
//        System.out.println(intX);
        BuatPassing buatPassing = new BuatPassing();
        buatPassing.setId(5);
        injectValueObject(buatPassing);
        System.out.println(buatPassing.getId());
    }

    public static Integer injectValuePrimitive(int intH){
        intH = 12;

        return intH;
    }

    public static void injectValueObject(BuatPassing buatPassingX){
        System.out.println(buatPassingX);
        System.out.println(buatPassingX.getId());
        buatPassingX.setId(15);
    }
}