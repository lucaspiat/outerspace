package com.pucrs.outerspace;

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
		RomanToDecimal teste3 = new RomanToDecimal();
		BuildOutput teste4 = new BuildOutput();
		
		System.out.println("--Reading from file: single.txt");
		//String str = String.join("\n", teste.returnRomanLines());
		System.out.println("--First line is: " + teste.returnLine());
		//System.out.println("Value in Roman is : " + teste2.convertToRoman(teste.returnLine()));


		//2 lines below belong to multiple line reading test:
		//System.out.println("Lines are : " + teste.returnLines());
		//System.out.println("Values in Roman are : " + teste2.convert(teste.returnLines()));

		System.out.println("--Reading from file: multiple.txt");
		//line below prints out read lines
		System.out.println("--Lines are: ");
		for (String s : teste.returnLines()) { System.out.println(s); }
		

		//line below returns 8th line for test purposes
		System.out.println("--8th line is: " + teste.returnEighthLine());
		//line below returns split words from 8th line after removing "quanto vale" and "?"
		System.out.println("--Split words are: " + teste2.removeQuantoVale(teste.returnEighthLine()));
		System.out.println("--Value in Roman is: " + teste2.convertToRoman(teste2.removeQuantoVale(teste.returnEighthLine())));
		System.out.println("--Value in Decimal is: " + teste3.convertToDecimal(teste2.convertToRoman(teste2.removeQuantoVale(teste.returnEighthLine()))));
		System.out.println("--Writing output values to file: output.txt");
		//line below writes partial output file:
		teste4.buildBaseString();
		//line below writes 2nd partial output file:
		teste4.appendValeToBase();
		//line below adds decimal to String of output file:
		teste4.appendDecimalToString();

		
		
}  




}
