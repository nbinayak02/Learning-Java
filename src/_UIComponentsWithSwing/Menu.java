package _UIComponentsWithSwing;
import javax.swing.*;

public class Menu extends JFrame {

	JMenuBar mb;
	JMenu fm, em, vm, zm;
	JMenuItem miopen, misave;
	JCheckBoxMenuItem misb;
	
	Menu() {
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setTitle("Menu Bar");
		
		mb = new JMenuBar();
		fm = new JMenu("File");
		em = new JMenu("Edit");
		vm = new JMenu("View");
		zm = new JMenu("Zoom");
		
		fm.setMnemonic('F');
		mb.add(fm);
		mb.add(em);
		mb.add(vm);
		mb.add(zm);
		
		miopen = new JMenuItem("Open", 'o');
		misave = new JMenuItem("Save", 's');
		misb = new JCheckBoxMenuItem("Status Bar", false);
		
		fm.add(miopen);
		fm.add(misave);
		vm.add(misb);
		vm.add(zm);
		
		setJMenuBar(mb);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menu();
	}

}
