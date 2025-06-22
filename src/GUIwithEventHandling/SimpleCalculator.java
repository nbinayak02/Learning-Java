package GUIwithEventHandling;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener {
	
	JLabel lNum1, lNum2;
	JTextField fNum1, fNum2;
	JButton bDivide, bMult, bAdd, bSub, bMod;
	
	SimpleCalculator(){
		
		setSize(600, 400);
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		lNum1 = new JLabel("Operand 1");
		lNum1.setBounds(50, 30, 200, 30);
		
		fNum1 = new JTextField();
		fNum1.setBounds(50, 60, 220, 30);
		
		lNum2 = new JLabel("Operand 2");
		lNum2.setBounds(300, 30, 200, 30);
		
		fNum2 = new JTextField();
		fNum2.setBounds(300, 60, 230, 30);
		
		bDivide = new JButton("Divide");
		bDivide.setBounds(50, 100, 100, 30);
		bDivide.addActionListener(this);
		
		bMult = new JButton("Multiply");
		bMult.setBounds(170, 100, 100, 30);
		bMult.addActionListener(this);
		
		bAdd = new JButton("Add");
		bAdd.setBounds(300, 100, 100, 30);
		bAdd.addActionListener(this);
		
		bSub = new JButton("Subtract");
		bSub.setBounds(430, 100, 100, 30);
		bSub.addActionListener(this);
		
		bMod = new JButton("Mod");
		bMod.setBounds(250, 150, 100, 30);
		bMod.addActionListener(this);
		
		add(lNum1);
		add(lNum2);
		add(fNum1);
		add(fNum2);
		add(bDivide);
		add(bMult);
		add(bAdd);
		add(bSub);
		add(bMod);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SimpleCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			int a = Integer.parseInt(fNum1.getText());
			int b = Integer.parseInt(fNum2.getText());
			int result = 0;

			if(e.getSource() == bDivide) {

					result = a/b;
				
			} else if(e.getSource() == bMult) {
				result = a * b;
			} else if(e.getSource() == bAdd) {
				result = a+b;
			} else if(e.getSource() == bSub) {
				result = a - b;
			} else {
				result = a%b;
			}
			
			String message = "Result is: "+result;
			JOptionPane.showMessageDialog(this, message, "Result", JOptionPane.INFORMATION_MESSAGE);
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
			JOptionPane.showMessageDialog(this, "Some error occured", "Exception Occured", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}

}
