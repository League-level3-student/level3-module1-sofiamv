package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JPanel panel = new JPanel();
	JFrame got = new JFrame();
	JLabel the = new JLabel();
	static Stack<String> town = new Stack<String>();
	String bag;
	int tack = 10;
	String j;
	int ee;
	String u = "";

	public static void main(String[] args) {
		HangMan yah = new HangMan();
		Utilities y = new Utilities();
		String horses;
		int in;
		horses = JOptionPane.showInputDialog("Welcome to hangman! how many words would you like to guess?");
		in = Integer.parseInt(horses);
		for (int i = 0; i < in; i++) {
			town.push(y.readRandomLineFromFile("dictionary.txt"));
		}
		yah.Old();
	}

	public void Old() {
		got.add(panel);
		panel.add(the);
		j = town.pop();
		ee = j.length();
		for (int i = 0; i < ee; i++) {
			u += "_";
		}
		the.setText(u.toString() + "lives left: " + tack);
		got.setVisible(true);
		got.addKeyListener(this);
		got.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ee; i++) {
			char b = e.getKeyChar();
			int y = j.indexOf(b) - 1;
			int z = j.indexOf(b) + 1;
			int bah = j.length() - 1;
			System.out.println(b + " " + y + " " + z);
			if (b == j.charAt(i)) {
				u = the.getText();
				String gah = u.substring(0, j.indexOf(b) - 1) + b + u.substring(j.indexOf(b) + 1, bah);
				the.setText(gah + " lives left: " + tack);
				System.out.println(gah);
			}
			if (b != j.charAt(i)) {
				tack--;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
