public class LabTestHarness1
{
    public static void main(String[] args){
        int failures = 0;
        int totalTests = 15;
        Book test1 = new Book("a", "a", 1);
        Book test2 = new Book("b", "b", 2);
        failures += booleanToInt(bookHasNumOfPages(2));
        failures += booleanToInt(bookHasTitle("book"));
        failures += booleanToInt(bookHasAuthor("author"));
        failures += booleanToInt(bookHasToString("book", "author", 2));
        failures += booleanToInt(bookHasToStringWithoutNumber("book", "author", 2));
        failures += booleanToInt(seriesGetNumSeries());
        failures += booleanToInt(seriesSetsAuthorAndTitleSeries());
        failures += booleanToInt(seriesGetsBooks(test1));
        failures += booleanToInt(seriesAddsBooks(test1, test2));
        failures += booleanToInt(seriesAddsBooksProperly(test1, test2));
        failures += booleanToInt(seriesRemoveBooks(test1, test2, 1));
        failures += booleanToInt(seriesRemoveBooksProperly(test1, test2, 0));
        failures += booleanToInt(seriesGetTotalPages(test1, test2));
        failures += booleanToInt(seriesHasToString(test1, test2, "a", "b"));
        failures += booleanToInt(seriesHasToStringWithBooks(test1, test2, "a", "b"));
        System.out.println("Your code has " + failures + " failure(s).");
    }
    public static boolean seriesSetsAuthorAndTitleSeries(){
        Series s = new Series(new Book("", "", 0));
        s.setAuthor("");
        s.setTitle("");
        return true;
    }
    public static boolean seriesHasToStringWithBooks(Book x, Book y, String z, String a){
        Series s = new Series(x);
        s.setAuthor(z);
        s.setTitle(a);
        s.addBook(y);
        return s.toString().contains(x.toString()) && s.toString().contains(z.toString());
    }
    public static boolean seriesHasToString(Book x, Book y, String z, String a){
        Series s = new Series(x);
        s.setAuthor(z);
        s.setTitle(a);
        s.addBook(y);
        return s.toString().contains(z) && s.toString().contains(a);
    }
    public static boolean seriesGetTotalPages(Book x, Book y){
        Series s = new Series(x);
        s.addBook(y);
        return s.getTotalNumOfPages() == 3;
    }
    public static boolean seriesRemoveBooksProperly(Book x, Book y, int z){
        Series s = new Series(x);
        s.addBook(y);
        s.removeBook(z);
        return s.getBooks().size() == 1 && s.getBooks().get(0) == y;
    }
    public static boolean seriesRemoveBooks(Book x, Book y, int z){
        Series s = new Series(x);
        s.addBook(y);
        s.removeBook(z);
        return s.getBooks().size() == 1;
    }
    public static boolean seriesAddsBooksProperly(Book x, Book y){
        Series s = new Series(x);
        s.addBook(y);
        return s.getBooks().get(0) == x && s.getBooks().get(1) == y;
    }
    public static boolean seriesAddsBooks(Book x, Book y){
        Series s = new Series(x);
        s.addBook(y);
        return s.getBooks().get(1) == y;
    }
    public static boolean seriesGetsBooks(Book x){
        return new Series(x).getBooks().get(0) == x;
    }
    public static boolean seriesGetNumSeries(){
        new Series(new Book("", "", 0));
        new Series(new Book("", "", 0));
        return Series.getNumOfSeries() == 2;
    }
    public static boolean bookHasToStringWithoutNumber(String x, String y, int z){
        String temp = new Book(x, y, z).toString();
        return !temp.contains(z + "");
    }
    public static boolean bookHasToString(String x, String y, int z){
        String temp = new Book(x, y, z).toString();
        return temp.contains(x) && temp.contains(y);
    }
    public static boolean bookHasAuthor(String x){
        return new Book("", x, 0).getAuthor().equals(x);
    }
    public static boolean bookHasTitle(String x){
        return new Book(x,"", 0).getTitle().equals(x);
    }
    public static boolean bookHasNumOfPages(int x){
        return new Book("","", x).getNumOfPages() == x;
    }
    public static int booleanToInt(boolean b){
        return b ? 0 : 1;
    }
}
