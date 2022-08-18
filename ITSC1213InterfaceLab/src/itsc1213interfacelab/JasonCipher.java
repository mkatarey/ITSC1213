/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsc1213interfacelab;

/**
 *
 * @author manavkatarey
 */
public class JasonCipher implements Cipher{
    
    public JasonCipher() {
    }
    
    @Override
    public String encrypt(String plainText) {
        String result = "";
        String first = "";
        String second = "";
        if (plainText.length() % 2 == 0) {
            for (int i = 0; i < plainText.length(); i++) {
                if (i < plainText.length() / 2) {
                    first += plainText.charAt(i);
                }
                else {
                    second += plainText.charAt(i);
                }
            }
        }
        else {
            for (int i = 0; i < plainText.length(); i++) {
                if (i <= plainText.length() / 2) {
                    first += plainText.charAt(i);
                }
                else {
                    second += plainText.charAt(i);
                }
            }
        }
        first = reverse(first);
        CasearCipher cipherJason = new CasearCipher(5);
        second = cipherJason.encrypt(second);
        result = first + second;
        result = reverse(result);
        return result;
    }
    
    @Override
    public String decrypt(String encryptedText) {
        String result = "";
        String first = "";
        String second = "";
        encryptedText = reverse(encryptedText);
        if (encryptedText.length() % 2 == 0) {
            for (int i = 0; i < encryptedText.length(); i++) {
                if (i < encryptedText.length() / 2) {
                    first += encryptedText.charAt(i);
                }
                else {
                    second += encryptedText.charAt(i);
                }
            }
        }
        else {
            for (int i = 0; i < encryptedText.length(); i++) {
                if (i <= encryptedText.length() / 2) {
                    first += encryptedText.charAt(i);
                }
                else {
                    second += encryptedText.charAt(i);
                }
            }
        }
        CasearCipher cipherJason2 = new CasearCipher(-5);
        second = cipherJason2.encrypt(second);
        first = reverse(first);
        result = first + second;
        return result;
    }
    
    public String reverse(String unreversed) {
        String reversed = "";
        for(int i = unreversed.length() - 1; i >= 0; i--) {
            reversed += unreversed.charAt(i);
        }
        return reversed;
    }
}