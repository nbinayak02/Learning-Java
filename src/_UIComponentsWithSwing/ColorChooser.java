package _UIComponentsWithSwing;
import java.awt.Color;

import javax.swing.*;

public class ColorChooser extends JFrame {

	JPanel p;
	
	ColorChooser(){
		
		setSize(900, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setTitle("Choose Color");
		p = new JPanel();
		add(p);
		setVisible(true);
		
		Color c = JColorChooser.showDialog(this, "Select New Color", Color.WHITE);
		p.setBackground(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ColorChooser();
	}

}
