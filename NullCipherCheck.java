import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NullCipher;

class NullCipherCheck {
    public void someCheck() throws IllegalBlockSizeException, BadPaddingException {
		Cipher doNothingCihper = new NullCipher();
		
		
		//The ciphertext produced will be identical to the plaintext.
		byte[] cipherText = doNothingCihper.doFinal();
	}
}
