
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner in = null;
        File file = new File("file.txt");
        in = new Scanner(file);
        int dataLength = Integer.parseInt(in.nextLine());
        double [] data = new double[dataLength];
        int index = 0;
        while(in.hasNext()) {
            data[index++] = Double.parseDouble(in.nextLine());
        }
        MarketData md = new MarketData(4, data);

        System.out.println("Total = " + md.getTotal());
        System.out.println("Monthly Average = " + md.getMonthlyAverage());
        System.out.println("Best Day = " + md.getHighestDay());
        System.out.println("Worst Day = " + md.getLowestDay());
        
        System.out.println(md.getTotalTest());
        System.out.println(md.getMonthlyAverageTest());
        System.out.println(md.getHighestDayTest());
        System.out.println(md.getLowestDayTest());
    }
}