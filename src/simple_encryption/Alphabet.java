package simple_encryption;

import java.util.ArrayList;
import java.util.Arrays;

public final class Alphabet {
	private Alphabet() {}
    public static final ArrayList<String> CHARACTER_LIST = new ArrayList<>(Arrays.asList(" !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~".split("")));
}
