package _UIComponentsWithSwing;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.*;

public class MouseEvent extends JFrame implements MouseListener {
	
	int x, y, r1, r2;
	
	MouseEvent(){
		setTitle("Mouse Event");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEvent();
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
		x = e.getX();
		y = e.getY();
		repaint();
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void paint(Graphics g) {
		g.drawRect(x, y, 60, 60);
	}

}
