package fr.antoumix.textfiletochar;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.awt.Color;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {
	
	public static File file = new File("file.txt");
	
	public static void main(String[] args) {
		
		
		int x = 3;
		int y = 3;
		
        System.out.println("getCharAt("+ x +","+ y + ") : " + TextFiletoChar.getCharAt(x, y, file));
        System.out.println("getMaxxLength : " + TextFiletoChar.getMaxxLength(file));
        System.out.println("getMaxyLength : " + TextFiletoChar.getMaxyLength(file));
        
        Frame frame = new Frame("TextFiletoChar");
        
        frame.setVisible(true);
        
	}
	
	public static Map<Character, Color> getColors(){

		Map<Character, Color> map = new HashMap<Character, Color>();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("colors.xml");
			NodeList colorList = doc.getElementsByTagName("color");
			
			for(int i = 0; i < colorList.getLength(); i++) {
				Node n = colorList.item(i);
				Element color = (Element) n;
				
				//getting from "255, 255, 255" to {255, 255, 255}
				String[] rgb_str = color.getTextContent().split(",");
				int[] rgb = new int[3];
				for(int a = 0; a < 3; a++) rgb[a] = Integer.parseInt(rgb_str[a].trim());
				
				//putting char and its corresponding color into the HashMap
				map.put(color.getAttribute("char").charAt(0), new Color(rgb[0], rgb[1], rgb[2]));
			}
			
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return map;
	}
	
	

}
