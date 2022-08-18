public class Page
{

    private String[] lines;
    
    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = lines;
    }
    
    public Page(int numLines){
        lines = new String[numLines];
    }
    
    public Page(String[] lines){
        this.lines = lines;
    }
}