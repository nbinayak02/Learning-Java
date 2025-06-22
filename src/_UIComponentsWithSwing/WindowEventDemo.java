package _UIComponentsWithSwing;
import javax.swing.*;
import java.awt.event.*;

public class WindowEventDemo extends JFrame implements WindowListener{
	
	JFrame frame;
	
	WindowEventDemo(){
		
		frame = new JFrame();
		frame.setTitle("Mouse Event");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.addWindowListener(this);
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new WindowEventDemo();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(frame, "Click anywhere in frame to see magic", "Welcome", JOptionPane.OK_OPTION, null);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showConfirmDialog(frame, "Are you closing?", "Warning", JOptionPane.YES_NO_OPTION);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
