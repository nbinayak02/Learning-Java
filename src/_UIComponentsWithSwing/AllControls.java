package _UIComponentsWithSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class AllControls extends JFrame {

	JPanel p1, p2, p3, sp1, sp2;
	JLabel lname, lpass, lsex, lhobby, lcountry, lcomments, side, top;
	JTextField tname;
	JPasswordField tpass;
	JRadioButton rbmale, rbfemale;
	ButtonGroup bg;
	JCheckBox chkplay, chkread, chktravel;
	JComboBox cmbcountry;
	JTextArea tacomment;
	JScrollPane sp;
	JSlider sl;
	
	AllControls(){
		
		setSize(600, 400);
		setDefaultLookAndFeelDecorated(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("All Java Swing Controls");
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		sp1 = new JPanel();
		sp2 = new JPanel();
		
		p1.setPreferredSize(new Dimension(600, 50));
		p2.setPreferredSize(new Dimension(100, 400));
		
		//adding three panels in frame
		setLayout(new BorderLayout());
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.WEST);
		add(p3, BorderLayout.CENTER);
		
		p3.setLayout(new GridLayout());
		p3.add(sp1);
		p3.add(sp2);
		
		p1.setBorder(BorderFactory.createLineBorder(Color.black));
		p2.setBorder(BorderFactory.createLineBorder(Color.black));
		p3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		sp1.setLayout(null);
		sp2.setLayout(null);
		
		sp1.setBackground(Color.orange);
		sp2.setBackground(Color.pink);
		
		//adding panel names
		side = new JLabel("Sidepanel");
		top = new JLabel("Top Panel");
		side.setBounds(5, 100, 100, 25);
		top.setBounds(100, 30, 100, 25);
		p1.add(top);
		p2.add(side);
		
		//adding labels and text fields
		lname = new JLabel("Username");
		tname = new JTextField(20);
		lname.setBounds(20, 5, 100, 25);
		tname.setBounds(20, 30, 200, 25);
		sp1.add(lname);
		sp1.add(tname);
		
		//adding password fields
		lpass = new JLabel("Password");
		tpass = new JPasswordField(20);
		lpass.setBounds(20, 60, 100, 25);
		tpass.setBounds(20, 90, 200, 25);
		sp1.add(lpass);
		sp1.add(tpass);
		
		//adding radio buttons
		lsex = new JLabel("Gender");
		rbmale = new JRadioButton("Male", true);
		rbfemale = new JRadioButton("Female");
		bg = new ButtonGroup();
		bg.add(rbmale);
		bg.add(rbfemale);
		lsex.setBounds(20, 120, 100, 25);
		rbmale.setBounds(20, 150, 75, 25);
		rbfemale.setBounds(100, 150, 75, 25);
		sp1.add(lsex);
		sp1.add(rbmale);
		sp1.add(rbfemale);
		
		//adding checkbox
		lhobby = new JLabel("Hobbies");
		chkplay = new JCheckBox("Playing");
		chkread = new JCheckBox("Reading");
		chktravel = new JCheckBox("Travel");
		lhobby.setBounds(20, 180, 100, 25);
		chkplay.setBounds(20, 210, 75, 25);
		chkread.setBounds(100, 210, 75, 25);
		chktravel.setBounds(180, 210, 75, 25);
		sp1.add(lhobby);
		sp1.add(chkplay);
		sp1.add(chkread);
		sp1.add(chktravel);
		
		//adding combo box (drop down)
		lcountry = new JLabel("Country");
		cmbcountry = new JComboBox();
		cmbcountry.addItem("Nepal");
		cmbcountry.addItem("India");
		cmbcountry.addItem("Australia");
		lcountry.setBounds(20, 5, 100, 25);
		cmbcountry.setBounds(20, 35, 200, 25);
		cmbcountry.setSelectedIndex(0);
		sp2.add(lcountry);
		sp2.add(cmbcountry);
		
		//textarea
		lcomments = new JLabel("Comments");
		tacomment = new JTextArea(3, 20);
		sp = new JScrollPane(tacomment);
		lcomments.setBounds(20, 65, 100, 25);
		sp.setBounds(20, 95, 200, 75);
		sp2.add(lcomments);
		sp2.add(sp);
		
		sl = new JSlider();
		sl.setBounds(20, 280, 200, 25);
		sp2.add(sl);
		
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new AllControls();
	}

}
