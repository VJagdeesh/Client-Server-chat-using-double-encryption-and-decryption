package CNS;  
public class Ccipherr{ 
public final static String alphabet = "abcdefghijklmnopqrstuvwxyz-? .";
	public static String encod(String plainT) {
		int shift=4;
        plainT = plainT.toLowerCase();
        String encryptedtext = "";
        for (int i = 0; i < plainT.length(); i++) {
            int map = alphabet.indexOf(plainT.charAt(i));
            int enVal = (shift + map) % 30;
            char Val = alphabet.charAt(enVal);
            encryptedtext = encryptedtext + Val;
        }
        return encryptedtext;
    }
 public static String decod(String encryptedtext) {
		int shift=4;
        encryptedtext = encryptedtext.toLowerCase();
        String plainT = "";
        for (int i = 0; i < encryptedtext.length(); i++) {
            int map = alphabet.indexOf(encryptedtext.charAt(i));
            int dVal = (map - shift) % 30;
            if (dVal < 0)
            {
                dVal = alphabet.length() + dVal;
            }
            char Val = alphabet.charAt(dVal);
            plainT = plainT + Val;
        }
        return plainT;
    } 
}  
