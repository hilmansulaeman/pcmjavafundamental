package org.juaracoidng.method;

import java.util.Map;

public class BedaClass {
    @Override
    public String toString() {
        return "INI CLASS BEDA iStatic nilainya "+iStatic;
    }

    /**
     *  controller
     *  service
     *  repo
     *  dto
     *  model -> ORM (Konfigurasi ke Database)
     *  util
     *  security
     *  response
     */

    /**
     *  view
     *  controller
     *  service
     *  repo
     *  model
     *  util
     *  response
     */

    public static void main(String[] args) {
        String strX = "abcdefg";
        int intX = strX.length();
        System.out.println(strX.substring(2,intX-1));
    }

    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            String str3,
                            String str4
    ){


    }

    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            String str3,
                            int int1){

    }
    public void getAttribut(Map<String,Object> map ,
                            String str1,
                            String str2,
                            int int1,
                            int int2){

    }
    public void getAttribut(){

    }
    public static int iStatic;

    public BedaClass(int iStatic) {
        this.iStatic = iStatic;
    }

    public static int getiStatic() {
        return iStatic;
    }
}