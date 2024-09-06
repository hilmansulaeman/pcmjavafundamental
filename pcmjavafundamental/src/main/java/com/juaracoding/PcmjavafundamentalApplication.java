package com.juaracoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PcmjavafundamentalApplication {

	public static void main(String[] args) {
		String nama = "Satibi";

		if (nama.length() > 12) {

			System.out.println(nama.substring(0, 12));

		}
	}
}