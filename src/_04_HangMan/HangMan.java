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
	int tack = 10;
	String j;
	int ee;
	String u = "";
	boolean isinword = false;
	int playagain;
	int replayinggame = 1;
	static int in;
	static HangMan yah = new HangMan();
	static Utilities y = new Utilities();

	public static void main(String[] args) {
		String horses;
		horses = JOptionPane.showInputDialog("Welcome to hangman! how many words would you like to guess?");
		in = Integer.parseInt(horses);
		for (int i = 0; i < in; i++) {
			town.push(y.readRandomLineFromFile("dictionary.txt"));
		}
		yah.Old();
	}

	public void Start() {
		tack = 10;
		u = "";
		town.push(y.readRandomLineFromFile("dictionary.txt"));
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
		isinword = false;
		for (int i = 0; i < ee; i++) {
			char b = e.getKeyChar();
			if (b == j.charAt(i)) {
				u = u.substring(0, i) + b + u.substring(i + 1);
				System.out.println(u);
				isinword = true;
			}
		}
		the.setText(u + " lives left: " + tack);
		if (!isinword) {
			tack--;
		}
		System.out.println(tack);
		the.setText(u + " lives left: " + tack);
		if (tack == 0) {
			playagain = JOptionPane.showConfirmDialog(null, "game over. the word was " + j + ". Play again?");
			System.out.println(playagain);
			if (playagain == 0) {
				yah.Start();
			}
		}
		if (u.equals(j)) {
			playagain = JOptionPane.showConfirmDialog(null, "you win! play again?");
			if (playagain == 0) {
				yah.Start();
			}
			if (in > 1) {
				yah.Start();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
