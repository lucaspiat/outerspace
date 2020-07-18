package com.pucrs.outerspace;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//import java.io.IOException;

//import java.io.BufferedReader;
//import java.io.FileReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OuterspaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OuterspaceApplication.class, args);

		//2 lines below belonged to first file line reading test:
		//Outerspace teste = new Outerspace();
		//System.out.println("Firstline is : " + teste.returnLine());


		try {  
			File file = new File("multiple.txt");    				//creates a new file instance  
			FileReader fr = new FileReader(file);   				//reads the file  
			BufferedReader br = new BufferedReader(fr);  			//creates a buffering character input stream  
			StringBuffer sb = new StringBuffer();    				//constructs a string buffer with no characters  
			String line;  
				while ((line = br.readLine()) != null) {  
					sb.append(line);      							//appends line to string buffer  
					sb.append("\n");     							//line feed   
				}  
			fr.close();    											//closes the stream and releases the resources  
			System.out.println("Contents of File: ");  
			System.out.println(sb.toString());   					//returns a string that textually represents the object  
			}  
		catch(IOException e) {  
			e.printStackTrace();  
		}  
}  




}
