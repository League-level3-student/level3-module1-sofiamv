package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel. Every time a key is pressed, add
	 * that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	Stack<Character> wee = new Stack<Character>();
	Stack<Character> ah = new Stack<Character>();
	int gah = -1;
	String j = new String();
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		_02_TextUndoRedo gah = new _02_TextUndoRedo();
		gah.ooh();
	}

	public void ooh() {
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_A) {
			ah.push('a');
			j += 'a';
			label.setText(j);
			gah++;
		}
		if (e.getKeyCode() == KeyEvent.VK_B) {
			ah.push('b');
			j += 'b';
			label.setText(j);
			gah++;
		}
		if (e.getKeyCode() == KeyEvent.VK_C) {
			ah.push('c');
			j += 'c';
			label.setText(j);
			gah++;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			ah.push('d');
			j += 'd';
			label.setText(j);
			gah++;
		}
		if (e.getKeyCode() == KeyEvent.VK_E) {
			ah.push('e');
			j += 'e';
			label.setText(j);
			gah++;
		}
		if (e.getKeyCode() == KeyEvent.VK_F) {
			ah.push('f');
			j += 'f';
			label.setText(j);
			gah++;
		}
		if (e.getKeyCode() == KeyEvent.VK_G) {
			ah.push('g');
			j += 'g';
			label.setText(j);
			gah++;
		}
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			wee.push(ah.pop());
			j = j.substring(0, j.length() - 1);
			label.setText(j);
		}
		if (e.getKeyCode() == KeyEvent.VK_0) {
			if (!wee.isEmpty()) {
				System.out.println("nothing left to re-type!");
			}
			j += (wee.pop());
			label.setText(j);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
