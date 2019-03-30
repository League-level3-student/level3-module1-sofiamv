package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	JPanel panel = new JPanel();
	JFrame got = new JFrame();
	JLabel the = new JLabel();
	static Stack<String> town = new Stack<String>();
	String bag;
	String road = "";
	int tack = 10;
	
	public static void main(String[] args) {
		HangMan yah = new HangMan();
		Utilities y = new Utilities();
		String horses;
		int in;
		horses = JOptionPane.showInputDialog("Welcome to hangman! how many words would you like to guess?");
		in = Integer.parseInt(horses);
		for(int i = 0; i < in; i++) {
			 town.push(y.readRandomLineFromFile("dictionary.txt"));
			}
		yah.Old();
	}
	public void Old() {
		got.add(panel);
		panel.add(the);
		int ee = town.pop().length();
		for(int i = 0; i < ee; i++) {
		road += "_";	
		}
		the.setText(road + "lives left: " + tack);
		got.setVisible(true);
		got.pack();
	
	}
	
}
