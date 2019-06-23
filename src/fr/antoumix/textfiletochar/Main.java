package fr.antoumix.textfiletochar;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File file = new File("TestFile.txt");
		
        System.out.println("getCharAt("+ 1 +","+ 2 + ") : " + TextFiletoChar.getCharAt(5, 3, file));
        System.out.println("getMaxxLength : " + TextFiletoChar.getMaxxLength(file));
        System.out.println("getMaxyLength : " + TextFiletoChar.getMaxyLength(file));
	}

}
