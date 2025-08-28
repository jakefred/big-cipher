package simple_encryption;
import java.util.ArrayList;
import java.util.Random;

public class Substitution_cipher {
	// takes a plaintext as input and outputs key and ciphertext
	public String[] substitute(String plaintext) {
		// initializes a string array with space for two strings
		String[] cipherAndKey = new String[2];
		
		return cipherAndKey;
	}
	// returns a random substitution key with all ASCII characters
	public String makeSubstitutionKey() {
		// imports all ASCII characters as letters
		ArrayList<String> letters = new ArrayList<>(Alphabet.CHARACTER_LIST);
		String key = "";
		Random rand = new Random();
		
		while (!letters.isEmpty()) {
			int nextLetterNum = rand.nextInt(letters.size());
			String nextLetter = letters.get(nextLetterNum);
			key += nextLetter;
			letters.remove(nextLetterNum);
		}
		
		
		return key;
	}
}
