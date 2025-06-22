package GUIwithEventHandling;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class CharacterCounter extends JFrame implements KeyListener {
	
	int count = 0;
	JTextArea ta;
	JLabel lbl1, lbl2;
	
	CharacterCounter(){
		
		setSize(600, 300);
		setTitle("Character Counter");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl1 = new JLabel("Start typing...");
		lbl1.setBounds(20, 30, 200, 25);
		
		ta = new JTextArea();
		ta.setBorder(BorderFactory.createEtchedBorder());
		ta.setBounds(20, 60, 500, 100);
		ta.addKeyListener(this);
		
		lbl2 = new JLabel("0 character");
		lbl2.setBounds(450, 160, 200, 25);
		
		add(lbl1);
		add(ta);
		add(lbl2);
		
		setVisible(true);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CharacterCounter();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		count = ta.getText().length();
		lbl2.setText(count+" characters");
	}

}
