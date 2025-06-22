package _UIComponentsWithSwing;
import javax.swing.*;

public class ConfirmDialog extends JFrame {

	JOptionPane jp;
	
	ConfirmDialog(){
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setVisible(true);
		JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Alert", JOptionPane.YES_NO_CANCEL_OPTION);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ConfirmDialog();
		
	}

}
