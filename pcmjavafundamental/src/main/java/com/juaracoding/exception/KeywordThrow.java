/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author 20304 Hilman Sulaeman
Java Developer
Created on 9/2/2024 8:31 PM
@Last Modified 9/2/2024 8:31 PM
Version 1.0
*/
package com.juaracoding.exception;

import java.util.Scanner;

public class KeywordThrow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the keyword: ");
        String strKeyword = sc.nextLine();
        System.out.println("inputan string : "+strKeyword);
        if (strKeyword.contains("Saya")){
            throw new IllegalArgumentException("Anda Memasukan kata - kata Terlarang....!!yaitu "+strKeyword);
        }
    }
}



