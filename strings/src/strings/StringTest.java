package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		String h = String.valueOf('H');
		assertEquals(1, h.length());
		assertEquals('H', h.charAt(0));
		
		String i = String.valueOf('i');
		String hi = h.concat(i);
		assertEquals(2, hi.length());
		assertEquals('H', hi.charAt(0));
		assertEquals('i', hi.charAt(1));
		
		// Test op representation exposure
		// 1e "aanval"
		char[] hiChars = hi.toCharArray();
		hiChars[0] = 'B';
		assertEquals('H', hi.charAt(0));
		
		// Test op representation exposure
		// 2e "aanval"
		char[] myArray = {'H', 'i'};
		String myString = String.valueOf(myArray);
		myArray[0] = 'B';
		assertEquals('H', myString.charAt(0));
	}

}
