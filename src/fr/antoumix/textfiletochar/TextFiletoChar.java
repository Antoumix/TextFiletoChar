package fr.antoumix.textfiletochar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFiletoChar {

	public static char getCharAt(int x, int y, File file) {
		
		String lines[] = new String[100];
		char c[][] = new char[100][100];
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String line = reader.readLine();
			
			int lineNumber = 0;
			
			while(line != null) {
				lines[lineNumber] = line;
				line = reader.readLine();
				
				lineNumber++;
			}
			reader.close();
			
			for(int iy = 0; iy < lineNumber; iy++) {
				for(int ix = 0; ix < lines[iy].length(); ix++) {
					c[ix][iy] = lines[iy].charAt(ix);
				}
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return c[x][y];
		
	}
	
	
	public static void getMaxxLength(File file) {

		
		
		
	}
	
	public static void getMaxyLength(File file) {

		
		
		
	}
	
	private void getLength() {
		
	}

}
