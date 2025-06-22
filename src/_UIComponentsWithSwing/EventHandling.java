package _UIComponentsWithSwing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventHandling extends JFrame implements ActionListener {
	
	JLabel lbl;
	JButton btn;
	JButton btn2;
	
	static int count = 0;
	
	EventHandling(){
		setSize(400, 200);
		setTitle("Event Handling");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		lbl = new JLabel("Click Button to See Event on Action!");
		lbl.setBounds(20, 50, 300, 25);
		
		btn = new JButton("Increse");
		btn.setBounds(20, 80, 100, 25);
		btn.addActionListener(this);
		
		btn2 = new JButton("Decrese");
		btn2.setBounds(130, 80, 100, 25);
		btn2.addActionListener(this);
		
		add(lbl);
		add(btn);
		add(btn2);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventHandling();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn) {
			count++;
		} else {
			count--;
		}
		
		lbl.setText("Hurray! You clicked the Button "+count+" times.");
	}

}
