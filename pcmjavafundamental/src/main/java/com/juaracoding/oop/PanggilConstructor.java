package com.juaracoding.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PanggilConstructor {
    public static void main(String[] args) {
        System.out.println(new ContohConstructor());
        System.out.println(new ContohConstructor("paul","paul123","paul@123"));
        List l = new ArrayList();
        ContohConstructor contoh = new ContohConstructor();
        contoh.setNama("paul");
        contoh.setUsername("paul123");
        contoh.setPassword("paul123");
        contoh.panggilPublic = "10";

        Map<Integer,String> mapzz = new HashMap<>();
        l.add(contoh);
        l.add(new ContohConstructor("paul","paul123","paul@123"));

        ScopeEncapsule scopeEncapsule = new ScopeEncapsule("paul","paul123","paul@123");
        scopeEncapsule.getNama();
        scopeEncapsule.getEmail();
        scopeEncapsule.getPassword();
    }
}