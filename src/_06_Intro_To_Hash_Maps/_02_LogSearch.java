package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int key;
	int boop;
	int woah = 0;
	String yah = "";
	String value;
	JButton button1 = new JButton("Add entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("view list");
	JButton button4 = new JButton("Remove entry");
	HashMap <Integer, String> ids = new HashMap<Integer, String>();
	public static void main(String[] args) {
		_02_LogSearch bah = new _02_LogSearch();
		bah.yeehaw();
	}
	public void yeehaw() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
		String bop = JOptionPane.showInputDialog("please input an id number:");
		key = Integer.parseInt(bop);
		value = JOptionPane.showInputDialog("please input the name of the person who owns that id number:");
		ids.put(key, value);
		woah++;
		}
		if(e.getSource() == button2) {
		yah = "";
		String gaah = JOptionPane.showInputDialog("please input an ID number to search:");
		boop = Integer.parseInt(gaah);
		for(String value : ids.values()) {
			if(ids.get(boop) == value) {
				JOptionPane.showMessageDialog(null, "The person who has this ID is " + ids.get(boop) + ".");
			}
		}
		}
		if(e.getSource() == button3) {
		for(Integer key: ids.keySet()){
			yah += "ID: " + key + "    Name: " + ids.get(key) + "\n";
		}
		JOptionPane.showMessageDialog(null, yah);
		yah = "";
		}
		if(e.getSource()== button4) {
		String q =	JOptionPane.showInputDialog("please input the id you would like to remove:");
		int qq = Integer.parseInt(q);
		ids.remove(qq);
		JOptionPane.showMessageDialog(null, "ID was removed!");
		}
		
	}
}
