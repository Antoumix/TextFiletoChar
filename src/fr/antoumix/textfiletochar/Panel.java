package fr.antoumix.textfiletochar;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Map;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {

		Map<Character, Color> colors = Main.getColors();
		
		for(int x = 0; x < TextFiletoChar.getMaxxLength(Main.file); x++) {
			for(int y = 0; y < TextFiletoChar.getMaxyLength(Main.file); y++) {
				
				for(Character c : colors.keySet()) {
					if(TextFiletoChar.getCharAt(x, y, Main.file) == c) {
						g.setColor(colors.get(c));
					}
				}
				
				g.fillRect(x*10, y*10, 10, 10);
			}
		}
		
		
	}
}
