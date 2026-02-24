package strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		String h = String.valueOf('H');
		assertEquals(1, h.length());
		assertEquals('h', h.charAt(0));
		
		String i = String.valueOf('i');
		String hi = h.concat(i);
		assertEquals(2, hi.length());
		assertEquals('h', hi.charAt(0));
		assertEquals('i', hi.charAt(1));

	}

}
