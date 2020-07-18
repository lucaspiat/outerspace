package com.pucrs.outerspace;

import java.io.IOException;

//import java.io.BufferedReader;
//import java.io.FileReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OuterspaceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(OuterspaceApplication.class, args);

		Outerspace teste = new Outerspace();


		System.out.println("Firstline is : " + teste.returnLine());




	}

}
