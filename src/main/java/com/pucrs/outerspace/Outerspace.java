package com.pucrs.outerspace;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Outerspace {

    private String text;

    public Outerspace() {

    }

    public String returnLine() throws IOException {

        BufferedReader brTest = new BufferedReader(new FileReader("single.txt"));
        
        text = brTest.readLine();
        return text;

    }


    
		
   		
    
}