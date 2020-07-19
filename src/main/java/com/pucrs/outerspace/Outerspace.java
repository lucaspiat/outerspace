package com.pucrs.outerspace;

import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
//import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;

public class Outerspace {

	// private final StringBuffer sb = new StringBuffer(); //constructs a string buffer with no characters
	List<String> lines = new ArrayList<String>(4);
	

	public Outerspace() {

	}

		
	public String returnLine() throws IOException {
		String text;

		final FileReader frTest = new FileReader("single.txt");
		final BufferedReader brTest = new BufferedReader(frTest);

		text = brTest.readLine();
		frTest.close();
		return text;

	}

	// method below deprecated in favour of a simpler one
	/*
	 * public String returnLines() { //try/catch below reads all lines from txt file
	 * and outputs them (now featuring UTF-8 encoding) try { //final FileReader fr =
	 * new FileReader("multiple.txt"); //reads the file final BufferedReader br =
	 * new BufferedReader(new InputStreamReader(new FileInputStream("multiple.txt"),
	 * "UTF-8")); //creates a buffering character input stream String line; while
	 * ((line = br.readLine()) != null) { sb.append(line); //appends line to string
	 * buffer sb.append("\n"); //line feed } br.close(); //closes the stream and
	 * releases the resources //System.out.println("Contents of File: ");
	 * //System.out.println(sb.toString()); //returns a string that textually
	 * represents the object
	 * 
	 * 
	 * 
	 * }
	 * 
	 * catch(final IOException e) { e.printStackTrace(); }
	 * 
	 * //String[] rev = sb.toString().split("\n"); //return rev; return
	 * sb.toString();
	 * 
	 * }
	 */

	// method below returns 4th line only
	/*
	 * public String returnLines() throws IOException { String first4 = "";
	 * 
	 * for(int i = 0; i < 4; i++) {
	 * 
	 * first4 = Files.readAllLines(Paths.get("multiple.txt")).get(i);
	 * 
	 * }
	 * 
	 * return first4;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	// method below is bizarre method found on the net, couldn't make it work
	/*
	 * public List<String> returnLines(final Path path, final int numLines) throws
	 * IOException { try (final Stream<String> lines = Files.lines(path)) { return
	 * lines.limit(numLines).collect(Collectors.toList()); } }
	 */

	public List<String> returnLines() throws IOException {
		final Path path = Paths.get("multiple.txt");
		final int numLines = 4;
		try (final BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			//final List<String> lines = new ArrayList<String>(numLines);
			int lineNum = 0;
			String line;

			while ((line = reader.readLine()) != null && lineNum < numLines) {
				lines.add(line);
				lineNum++;

			}

			return lines;

		}
	}

	// spent hours trying to make it work, it didn't
	/*
	 * public String returnRomanLines() throws IOException { final Path path =
	 * Paths.get("multiple.txt"); final int numLines = 4; try (final BufferedReader
	 * reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) { final
	 * List<String> lines = new ArrayList<String>(numLines); int lineNum = 0; String
	 * line;
	 * 
	 * while ((line = reader.readLine()) != null && lineNum < numLines) {
	 * lines.add(line); lineNum++;
	 * 
	 * }
	 * 
	 * final String frnames[] = lines.toArray(new String[lines.size()]);
	 * 
	 * int i = 0; while (i < lines.size()) { final String res = (String)
	 * Array.get(frnames, i); i++; return res; }
	 * 
	 * } return null; }
	 */

	public List<String> returnRomanLines() throws IOException {
		final Path path = Paths.get("multiple.txt");
		final int numLines = 4;
		try (final BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
			//final List<String> lines = new ArrayList<String>(numLines);
			int lineNum = 0;
			String line;

			while ((line = reader.readLine()) != null && lineNum < numLines) {
				lines.add(line);
				lineNum++;

			}

			
			return lines;
		}
	

	

        


	
	}
}

	

    
		
   		
    
