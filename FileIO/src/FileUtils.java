/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author manavkatarey
 */
public class FileUtils {
    public static void copyFile(String source, String destination) {
        try {
            Scanner input = new Scanner(new File(source));
            PrintWriter output = new PrintWriter(destination);
            while(input.hasNext()) {
                output.println(input.nextLine());
            }
            output.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    public static void translateFile(String source, String destination) {
        try {
            Scanner input = new Scanner(new File(source));
            PrintWriter output = new PrintWriter(destination);
            while(input.hasNext()) {
                String line = input.nextLine();
                String[] lineArr = line.split(" ");
                output.println(transformLine(lineArr));
            }
            output.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
    private static String transformLine(String[] arr) {
        String result = "";
        for (String str : arr) {
            String transformedWord = "";
                if (str.length() > 0) {
                    transformedWord = transformWord(str);
                }
            result += transformedWord + " ";
        }
        return result;
    }
    
    private static String transformWord(String str) {
        String result = "";
        result = str.substring(1);
        result += str.charAt(0);
        result += "AY";
        return result;
    }
}