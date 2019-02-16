package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015
public class _06_IPodShuffle implements ActionListener{
JPanel panel;
JFrame frame;
JButton button;
ArrayList<Song>Songs = new ArrayList<Song>();
Random r = new Random();
int ah = r.nextInt(5);
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		Song song1 = new Song("song1.mp3");
		Song song2 = new Song("song2.mp3");
		Song song3 = new Song("song3.mp3");
		Song song4 = new Song("song4.mp3");
		Song song5 = new Song("song5.mp3");
		Songs.add(song1);
		Songs.add(song5);
		Songs.add(song4);
		Songs.add(song3);
		Songs.add(song2);
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
	}
	
	public static void main(String[] args) {
		_06_IPodShuffle a = new _06_IPodShuffle();
		a.gah();
	}
	public void gah() {
		button = new JButton("Surprise me!");
		panel = new JPanel();
		frame = new JFrame();
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button)) {
		Songs.get(ah).play();
		System.out.println(Songs.get(ah));
		}
	}
}