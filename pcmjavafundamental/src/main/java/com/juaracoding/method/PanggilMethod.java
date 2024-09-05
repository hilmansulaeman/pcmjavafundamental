package com.juaracoding.method;


import com.juaracoding.exception.SampleMethod;

public class PanggilMethod extends SampleMethod {

    public static void main(String[] args) {
//        SampleMethod sampleMethod = new SampleMethod();
    }

    public void init() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }

    public void init(String strNull) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }

    public void methodBiasa() {
        init(null);
    }

    public void methodLuarBiasa() {
        init();
    }

    public void methodBiasaLuar() {
        init();
    }
}