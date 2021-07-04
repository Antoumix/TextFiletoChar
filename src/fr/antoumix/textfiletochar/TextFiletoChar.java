package fr.antoumix.textfiletochar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFiletoChar {

	public static char getCharAt(int x, int y, File file) {
		
		String lines[] = new String[getMaxyLength(file)];
		char c[][] = new char[100][getMaxyLength(file)];
		
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
	
	
	
	public static int getMaxxLength(File file) {
		int x = 0;
		String lines[] = new String[getMaxyLength(file)];
		
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
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < getMaxyLength(file); i++) {
			
			if(lines[i].length() > x) x = lines[i].length();
			
		}
		
		return x;
	}
	
	public static int getMaxyLength(File file) {
		int y = 0;
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String line = reader.readLine();
			
			
			while(line != null) {
				
				line = reader.readLine();
				y++;
			}
			
			reader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return y;
	}

}
