package simple_encryption;

public class BigCipher {

	public static void main(String[] args) {
		Substitution_cipher cipher = new Substitution_cipher();
		String key = cipher.makeSubstitutionKey();
		System.out.println(key);
	}

}
