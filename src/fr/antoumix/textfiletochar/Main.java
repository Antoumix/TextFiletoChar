package fr.antoumix.textfiletochar;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File file = new File("TestFile.txt");
		
		System.out.println(TextFiletoChar.getCharAt(2, 0, file));

	}

}
