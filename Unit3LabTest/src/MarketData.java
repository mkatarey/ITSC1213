
public class MarketData {
    private int month;
    private double dailyData[];
    
    public MarketData(int month, double [] data) {
        this.month = month;
        this.dailyData = data;
    }

    public double getTotal() {
        double total = 0;
        for(double amount : this.dailyData) {
            total += amount;
        }
        return this.roundOff(total);
    }
    
    public boolean getTotalTest() {
        double total = 0;
        double[] arr = {1.0, 2.0, 3.0};
        for(double amount : arr) {
            total += amount;
        }
        if (total == 6.0) {
            return true;
        }
        return false;
    }

    public double getMonthlyAverage() {
        double average = this.getTotal() / this.dailyData.length;
        return this.roundOff(average);
    }
    
    public boolean getMonthlyAverageTest() {
        double[] arr = {1.0, 2.0, 3.0};
        double total = 6.0;
        double average = 6.0 / arr.length;
        if (average == 2.0) {
            return true;
        }
        return false;
    }
    
    public int getHighestDay() {
        int counter = 1;
        int day = 1;
        double max = this.dailyData[0]; //what if dailyData is empty?
        for(double amount : this.dailyData) {
            if(max <= amount) {
                max = amount;
                day = counter;
            }
            counter++;
        }
        return day;
    }
    
    public boolean getHighestDayTest() throws emptyDataSetException{
        double[] arr = {1.0, 2.0, 3.0};
        if (arr.length < 0) {
            throw new emptyDataSetException();
        }
        int counter = 1;
        int day = 1;
        double max = arr[0];
        for(double amount : arr) {
            if(max <= amount) {
                max = amount;
                day = counter;
            }
            counter++;
        }
        if (day == 3) {
            return true;
        }
        return false;
    }

    public int getLowestDay() {
        int counter = 1;
        int day = 1;
        double min = this.dailyData[0]; //what if dailyData is empty?
        for(double amount : this.dailyData) {
            if(min >= amount) {
                min = amount;
                day = counter;
            }
            counter++;
        }
        return day;
    }
    
    public boolean getLowestDayTest() throws emptyDataSetException{
        double[] arr = {1.0, 2.0, 3.0};
        if (arr.length < 0) {
            throw new emptyDataSetException();
        }
        int counter = 1;
        int day = 1;
        double min = arr[0];
        for(double amount : arr) {
            if(min >= amount) {
                min = amount;
                day = counter;
            }
            counter++;
        }
        if (day == 1) {
            return true;
        }
        return false;
    }

    public double roundOff(double amount) {
        return Math.round(amount * 100.0) / 100.0;
    }
}