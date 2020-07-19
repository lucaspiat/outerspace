package com.pucrs.outerspace;

public class StringToRoman {

    public StringToRoman() {
        

    }

    public char convert (String n) {
        char roman = '\0';

        switch (n) {
            case "snob representa I":
                roman = 'I';
                break;
            case "krok representa V":
                roman = 'V';
                break;
            case "squid representa X":
                roman = 'X';
                break;
            case "leij representa L":
                roman = 'L';

        }

        return roman;
       
    }

}