/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itsc1213interfacelab;

/**
 *
 * @author manavkatarey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String casearCipher = "WKH GHFUBSWLRQ LV ZRUNLQJ FRUUHFWOB";
        CasearCipher cipher = new CasearCipher(3);
        System.out.println(cipher.encrypt("The encryption is working correctly"));
        System.out.println(cipher.decrypt(casearCipher));
        TrithemiusCipher cipher2 = new TrithemiusCipher();
        System.out.println(cipher2.encrypt("Machine"));
        System.out.println(cipher2.encrypt("The encryption is working correctly"));
        System.out.println(cipher2.decrypt("MBEKMSK"));
        System.out.println(cipher2.decrypt("TIG EOEUCUZPWW IT WPTNMSM CPTUIHZSG"));
        JasonCipher cipherJ = new JasonCipher();
        System.out.println(cipherJ.encrypt("three"));
        System.out.println(cipherJ.decrypt("jjthr"));
    }
}