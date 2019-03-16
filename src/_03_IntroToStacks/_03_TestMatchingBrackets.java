package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	Stack<String> aaah = new Stack<String>();
	int open = 0;
	int close = 0;

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		aaah.push(b);
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {
				open++;
			}
			if (b.charAt(i) == '}') {
				close++;
			}
		}
		if (open == close) {
			return true;
		} else {
			return false;
		}
	}

}