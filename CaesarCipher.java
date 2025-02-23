/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private char[] shifted;
	private int shift;

    public CaesarCipher() 
    {
        alphabet = new char[26];
        shifted = new char[26];
        shift = 1;
    }

    public CaesarCipher(int num)
    {
        shift = num;
    }

    public String encrypt(String message)
    {
        //look through alphabet
        String crypt = "";
        //int pos = 0;
        for(int i = 0, o = 0; i < message.length() && o < alphabet.length; i++, o++)
        {
            message.charAt(i) = alphabet[o];
        }

        return "" + crypt;
    }

    public String decrypt(String message)
    {
        //look through shifted
        //for
        for(int i = 0; i < shifted.length; i++)
        {
            
        }
        return "" + message;
    }

    public void shifter(int num)
    {
        int pos = 0;
        for(int i = 0; i < alphabet.length; i++)
        {
            shifted[pos]=alphabet[i+shift];
            pos++;
        }
    }
        


}