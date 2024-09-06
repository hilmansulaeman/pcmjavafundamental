package com.juaracoding.oop;

import com.juaracoding.array.Parent;

import java.util.Map;
import java.util.Set;

public class Child extends Parent {

    public Child() {
        super();
    }

    public void panggil(String str){
        super.fungsi1();
        super.name = "";
        System.out.println(str);
    }

    public void panggil(Integer intX){
        System.out.println(Math.pow(intX,2));
    }

    public void panggil(Set<Object> s){
    }

    public void panggil(Map<String,Object> m){
    }
//    callSP -> mengembalikan recordSet
//    callSP -> Transaction
//    callSP -> File
//    callSP -> Bulk

}