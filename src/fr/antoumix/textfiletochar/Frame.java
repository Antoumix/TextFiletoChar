package fr.antoumix.textfiletochar;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public Frame(String title) {
		
		setTitle(title);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new Panel());
        
	}
}
