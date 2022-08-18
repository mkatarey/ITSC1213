/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsc1213interfacelab;

/**
 *
 * @author manavkatarey
 */
public class TrithemiusCipher implements Cipher{
    private int shift = -1;
    
    public TrithemiusCipher() {
    }
    
    public int charToIndex(char c) 
    { 
        int result = (int)c;
 
        int lowerCase = 97; 
        int upperCase = 65; 
        if(result <= 122 && result >= 97) 
        { 
            result -= lowerCase; 
        } 
        else if(result >= 65 && result <= 90) 
        { 
            result -= upperCase; 
        } 
        return result;
    }
     
    private char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
    'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 
    'W', 'X', 'Y', 'Z'};
    
    @Override
    public String encrypt(String plainText) {
        shift = -1;
        String encryptedText = "";
        for (int i = 0; i < plainText.length(); i++) {
            shift++;
            char c = plainText.charAt(i);
            if (c != ' ') {
                int temp = charToIndex(c) + shift;
                if (temp > 25) {
                    temp %= 25;
                    temp--;
                    encryptedText += alpha[temp];
                }
                else {
                    encryptedText+= alpha[temp];
                }
            }
            else {
                encryptedText += " ";
                shift = -1;
            }
        }
        shift = -1;
        return encryptedText;
    }
    
    @Override
    public String decrypt(String encryptedText) {
        shift = -1;
        String decryptedText = "";
        for (int i = 0; i < encryptedText.length(); i++) {
            shift++;
            char c = encryptedText.charAt(i);
            if (c != ' ') {
                int temp = charToIndex(c);
                temp -= shift;
                if (temp < 0) {
                    temp += alpha.length;
                }
                else if (temp >= alpha.length) {
                    temp -= alpha.length;
                }
            decryptedText+= alpha[temp];
            }
            else {
                decryptedText += " ";
                shift = -1;
            }
        }
        shift = -1;
        return decryptedText;
    }
}