package com.pucrs.outerspace;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OuterspaceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(OuterspaceApplication.class, args);

		//2 lines below belong to single line reading test:
		Outerspace teste = new Outerspace();
		StringToRoman teste2 = new StringToRoman();
		//String str = String.join("\n", teste.returnRomanLines());
		System.out.println("Firstline is : " + teste.returnLine());
		System.out.println("Value in Roman is : " + teste2.convert(teste.returnLine()));


		//2 lines below belong to multiple line reading test:
		//System.out.println("Lines are : " + teste.returnLines());
		//System.out.println("Values in Roman are : " + teste2.convert(teste.returnLines()));

		//line below prints out first 4 read lines
		System.out.println("Lines are : ");
		for (String s : teste.returnLines()) { System.out.println(s); }
		System.out.println("Values in Roman are : ");
		//for (String s : teste2.convert(str)) { System.out.println(s); }

		
}  




}
