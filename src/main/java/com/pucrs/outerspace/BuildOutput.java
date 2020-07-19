package com.pucrs.outerspace;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class BuildOutput {

    StringToRoman str = new StringToRoman();
    Outerspace os = new Outerspace();
    RomanToDecimal rtd = new RomanToDecimal();

    public BuildOutput() {

    }

    public String buildBaseString() throws IOException {

        String base = os.returnEighthLine();
        String result = str.removeQuantoVale(base);
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write(result);
    
            writer.close();
            
        return result;

    }

    public String appendValeToBase() throws IOException {

        String res2 = os.return2ndWord();
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            writer.append("");
            writer.append(res2);
            writer.close();

        return writer.toString();

    }

    public String appendDecimalToString() throws IOException {

        String decimal = String.valueOf(rtd.convertToDecimal(str.convertToRoman(str.removeQuantoVale(os.returnEighthLine()))));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            writer.append(" ");
            writer.append(decimal);
            writer.close();

            

        return writer.toString();
        

    }













    
}