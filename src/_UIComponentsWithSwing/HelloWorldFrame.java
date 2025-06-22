package _UIComponentsWithSwing;

import javax.swing.*;

public class HelloWorldFrame extends JFrame{

	JLabel l;
	JTextField t;
	JButton b;
	
	HelloWorldFrame() {
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI with Swing");
		setLayout(null);
		l = new JLabel("Your Name");
		t = new JTextField(15);
		b = new JButton("Click Meeee");
		l.setBounds(50, 100, 300, 30);
		t.setBounds(50, 130, 300, 30);
		b.setBounds(50, 170, 150, 30);
		add(l);
		add(t);
		add(b);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloWorldFrame();
	}

}
