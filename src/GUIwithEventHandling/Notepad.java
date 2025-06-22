package GUIwithEventHandling;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Notepad extends JFrame implements ActionListener, ItemListener{


	JMenuBar mb;
	JMenu fm, edit, view;
	JMenuItem open, save, clear;
	JCheckBoxMenuItem wordwrap;
	JTextArea textarea;
	JScrollPane scrollpane;
	
	Notepad(){
		
		setSize(600, 400);
		setTitle("Notepad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		mb = new JMenuBar();
		
		fm = new JMenu("File");
		edit = new JMenu("Edit");
		view = new JMenu("View");
		
		mb.add(fm);
		mb.add(edit);
		mb.add(view);
		
		open = new JMenuItem("Open", 'o');
		save = new JMenuItem("Save", 's');
		clear = new JMenuItem("Clear",'c');
		wordwrap = new JCheckBoxMenuItem("Word Wrap");
		
		fm.add(open);
		fm.add(save);
		edit.add(clear);
		view.add(wordwrap);
		
		setJMenuBar(mb);
		
		textarea = new JTextArea();
		textarea.setBounds(5, 0, 575, 400);
		scrollpane = new JScrollPane(textarea);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollpane.setBounds(5, 5, 570, 340);
		
//		add(textarea);
		add(scrollpane);
		
		clear.addActionListener(this);
		wordwrap.addItemListener(this);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Notepad();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == clear) {
			textarea.setText("");
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
		if(wordwrap.isSelected()) {
			textarea.setLineWrap(true);
		} else {
			textarea.setLineWrap(false);
		}
		
	}

}
