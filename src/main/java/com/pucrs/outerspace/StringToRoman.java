package com.pucrs.outerspace;

import org.apache.commons.lang3.StringUtils;

public class StringToRoman {

    public StringToRoman() {
        

    }

    public String convertToRoman (String n) {
        String snob = n.replaceAll("snob", "I");
        String krok = snob.replaceAll("krok", "V");
        String squid = krok.replaceAll("squid", "X");
        String leij = squid.replaceAll("leij", "L");
        
        return leij.replaceAll("\\s+", "");

}

    public String removeQuantoVale (String n) {
        if (n.contains("quanto") && (n.contains("vale"))) {
            String semqtovale = StringUtils.remove(n, "quanto vale ");
            String seminterr = semqtovale.replace("?", "");
            return seminterr;
        }

        return null;

    }

}