/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author manavkatarey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int[][] b = get2DArray("/Users/manavkatarey/Desktop/MagicSquare.txt");
        boolean checker = isMagicSquare(b);
        System.out.println(checker);
    }
    
    public static int[][] get2DArray(String pathname) throws IOException {
        Scanner scnr = new Scanner(new File(pathname));
        int[][] intArr = new int[3][3];
        for (int i = 0; i < intArr.length; i++){
            String line = scnr.nextLine();
            String[] splitLine = line.split(" ");
            int[] temp = new int[3];
            for (int j = 0; j < splitLine.length; j++) {
                temp[j] = Integer.parseInt(splitLine[j]);
            }
            intArr[i] = temp;
        }
        return intArr;
    }
    
    public static boolean isMagicSquare(int[][] magicSquare) {
        //Fields
        int diagonalL = 0;
        int diagonalR = 0;        
        
        //For Loop for Left Diagonal
        for (int i = 0; i < magicSquare.length; i++) {
            diagonalL += magicSquare[i][i];
            diagonalR += magicSquare[i][magicSquare.length - 1 - i];
        }
        if (diagonalL != diagonalR) {
            return false;
        }
        
        //Rows
        for (int i = 0; i < 3; i++) {
            int rowCounter = 0;
            for (int j = 0; j < 3; j++) {
                rowCounter += magicSquare[i][j];
            }
            if (rowCounter != diagonalR) {
                return false;
            }
        }
        
        //Columns
        for (int i = 0; i < 3; i++) {
            int columnCounter = 0;
            for (int j = 0; j < 3; j++) {
                columnCounter += magicSquare[j][i];
            }
            if (columnCounter != diagonalR) {
                return false;
            }
        }
        
        return true;
        
    }
    
}