package strings;

import java.util.stream.IntStream;

/**
 * Elke instantie van deze klasse stelt een reeks tekens voor.
 * 
 * @immutable
 */
public class String {
	
	/**
	 * @post | 0 <= result
	 */
	public int length() {
		throw new RuntimeException("Not yet implemented");
	}
	
	/**
	 * @pre | 0 <= index && index < length()
	 */
	public char charAt(int index) {
		throw new RuntimeException("Not yet implemented");
	}
	
	
	/**
	 * 
	 * @post | result.length() == 1
	 * @post | result.charAt(0) == c
	 * @post | result != null
	 */
	public static String valueOf(char c) {
		throw new RuntimeException("Not yet implemented");
	}
	
	
	/**
	 * @pre | other != null
	 * @post | result != null
	 * @post | result.length() == this.length() + other.length()
	 * @post | IntStream.range(0, length()).allMatch(i -> result.charAt(i) == this.charAt(i))
	 * @post | IntStream.range(0, other.length()).allMatch(i -> result.charAt(length() + i) == other.charAt(i))
	 */
	public String concat(String other) {
		throw new RuntimeException("Not yet implemented");
	}
	
}
