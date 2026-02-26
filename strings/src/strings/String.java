package strings;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Elke instantie van deze klasse stelt een reeks tekens voor.
 * 
 * @immutable
 */
public class String {
	
	/**
	 * @invar | characters != null
	 * 
	 * @respresentationObject
	 */
	private char[] characters;
	
	
	/**
	 * @post | 0 <= result
	 */
	public int length() {
		return characters.length;
	}
	
	/**
	 * @pre | 0 <= index && index < length()
	 */
	public char charAt(int index) {
		return characters[index];
	}
	
	/**
	 * @post | result != null
	 * @post | result.length == length()
	 * @post | IntStream.range(0, length()).allMatch(i -> result[i] == charAt(i))
	 */
	public char[] toCharArray() {
		return characters.clone();
	}
	
	
	private String(char[] characters) {
		this.characters = characters;
	}
	
	/**
	 * @pre | characters != null
	 * @inspects | characters
	 * @post | result != null
	 * @post | Arrays.equals(result.toCharArray(), characters)
	 */
	public static String valueOf(char[] characters) {
		return new String(characters.clone());
		
	}
	
	
	/**
	 * 
	 * @post | result.length() == 1
	 * @post | result.charAt(0) == c
	 * @post | result != null
	 */
	public static String valueOf(char c) {
		return new String(new char[] {c});
	}
	
	
	/**
	 * @pre | other != null
	 * @post | result != null
	 * @post | result.length() == this.length() + other.length()
	 * @post | IntStream.range(0, length()).allMatch(i -> result.charAt(i) == this.charAt(i))
	 * @post | IntStream.range(0, other.length()).allMatch(i -> result.charAt(length() + i) == other.charAt(i))
	 */
	public String concat(String other) {
		char[] newChars = new char[characters.length + other.characters.length];
		System.arraycopy(characters, 0, newChars, 0, characters.length);
		System.arraycopy(other.characters, 0, newChars, characters.length, other.characters.length);
		return new String(newChars);
		
	}
	
	
	
	
	
	
}
