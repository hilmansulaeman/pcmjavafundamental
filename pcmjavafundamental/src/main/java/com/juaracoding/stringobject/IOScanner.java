/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author 20304 Hilman Sulaeman
Java Developer
Created on 9/2/2024 8:23 PM
@Last Modified 9/2/2024 8:23 PM
Version 1.0
*/

package com.juaracoding.stringobject;

import java.util.Scanner;

public class IOScanner {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan Text : ");
            String strNama = scanner.nextLine();
            System.out.println("Text yang anda masukkan adalah : " + strNama);

            System.out.print("Masukkan Nilai Bilangan Bulat : ");
            int intNilai = scanner.nextInt();
            System.out.println("Nilai Bilangan Bulat adalah : " + intNilai);

            System.out.print("Masukkan Nilai Bilangan Desimal : ");
            double douNilai = scanner.nextDouble();
            System.out.println("Nilai Bilangan Desimal adalah : " + douNilai);
            // proses aritmatika

        }
}



