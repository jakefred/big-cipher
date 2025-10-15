package simple_encryption;

public class BigCipher {

	public static void main(String[] args) {
		String message = "a";
		
		// creates new substitution cipher object called cipher
		Substitution_cipher cipher = new Substitution_cipher();
		// makes a substitution key 
		String key = cipher.makeSubstitutionKey();
		System.out.println(key);
		
		String encryptedMessage = cipher.encrypt(key, message);
		
		System.out.println(encryptedMessage);
	}

}
