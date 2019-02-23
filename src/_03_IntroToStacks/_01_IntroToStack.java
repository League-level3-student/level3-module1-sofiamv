package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		Stack<Double> weee = new Stack<Double>();
		// Don't forget to import the Stack class
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random r = new Random();
		double a = r.nextDouble();
		for (int i = 0; i < 100; i++) {
			weee.push(r.nextDouble() * 100);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String c = JOptionPane.showInputDialog("enter a number between 0 and 100:");
		String b = JOptionPane.showInputDialog("enter another number between 0 and 100:");
		double d = Double.parseDouble(b);
		double e = Double.parseDouble(c);
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < weee.size(); i++) {
			double boo = weee.pop();
			if (boo < d && boo > e) {
				System.out.println(boo);
			}
		}

	}

	// EXAMPLE:
	// NUM 1: 65
	// NUM 2: 75

	// Popping elements off stack...
	// Elements between 65 and 75:
	// 66.66876846
	// 74.51651681
	// 70.05110654
	// 69.21350456
	// 71.54506465
	// 66.47984807
	// 74.12121224
}
