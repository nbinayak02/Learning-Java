package _UIComponentsWithSwing;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class SimpleCalculator extends JFrame implements ActionListener{

	JLabel lbl1, lbl2, lbl3;
	JTextField tf1, tf2;
	JButton btn1, btn2;
	
	SimpleCalculator(){
		
		setSize(350, 350);
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		lbl1 = new JLabel("Number 1");
		lbl1.setBounds(50, 30, 230, 25);
		
		tf1 = new JTextField();
		tf1.setBounds(50, 60, 230, 25);
		
		lbl2 = new JLabel("Number 2");
		lbl2.setBounds(50, 90, 230, 25);
		
		tf2 = new JTextField();
		tf2.setBounds(50, 120, 230, 25);
		
		lbl3 = new JLabel();
		lbl3.setBounds(50, 150, 100, 25);
		
		btn1 = new JButton("Add");
		btn1.setBounds(50, 180, 100, 25);
		btn1.addActionListener(this);
		
		btn2 = new JButton("Subtract");
		btn2.setBounds(180, 180, 100, 25);
		btn2.addActionListener(this);
		
		add(lbl1);
		add(tf1);
		add(lbl2);
		add(tf2);
		add(lbl3);
		add(btn1);
		add(btn2);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SimpleCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int x = Integer.parseInt(tf1.getText());
		int y = Integer.parseInt(tf2.getText());
		int z = 0;
		
		if(e.getSource() == btn1) {
			z = x + y;
		} else {
			z = x - y;
		}
		
		lbl3.setText("Result: "+z);
	}

}
