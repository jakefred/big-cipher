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
	// returns key as a string with all of the ASCII characters in random order
	public String makeSubstitutionKey() {
		// imports all ASCII characters as letters
		ArrayList<String> letters = new ArrayList<>(Alphabet.CHARACTER_LIST);
		String key = "";
		Random rand = new Random();
		
		// runs until the letters arraylist runs out
		// makes the key
		while (!letters.isEmpty()) {
			// assigns a random number within scope of letters
			int nextLetterNum = rand.nextInt(letters.size());
			// gets next letter based on random int
			String nextLetter = letters.get(nextLetterNum);
			// adds letter to key and removes from letters
			key += nextLetter;
			letters.remove(nextLetterNum);
		}
		
		
		return key;
	}
	
	public String encrypt(String key, String message) {
		String encryptedMessage = "";
		
		for (int i = 0; i < message.length(); i++) {
			// getting character from message string
			char toEncode = message.charAt(i);
			
			// converting character to numerical value, this will be the position of the key
			// the first 31 ASCII characters are non-printable and therefore cannot show up in the message
			int charNum = Character.getNumericValue(toEncode) - 31;
			
			// appending encrypted letter to message
			encryptedMessage += Alphabet.CHARACTER_LIST.get(charNum);
		}
		
		return encryptedMessage;
	}
	
	// #FIXME: make a method to decrypt the message
}
