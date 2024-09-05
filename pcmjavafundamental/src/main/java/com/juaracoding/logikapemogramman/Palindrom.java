package com.juaracoding.logikapemogramman;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata : ");
        String strInput = sc.nextLine();
        //kodok --> str1
        //kodok --> str2
        // str1 equals str2

        String strDariKanan = "";
        char [] chArr = strInput.toCharArray();
        int intChArr = chArr.length;
        for (int i = 0; i < intChArr; i++) {
            strDariKanan = strDariKanan + chArr[(intChArr-1)-i];
        }
        System.out.println("Nilai STR Dari Kanan adalah : "+strDariKanan);
        if(strDariKanan.equalsIgnoreCase(strInput)){
            System.out.println("Ini Palindrom");
        }else {
            System.out.println("Bukan Palindrom");
        }
    }
}