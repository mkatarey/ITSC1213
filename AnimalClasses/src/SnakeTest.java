
/**
 * Write a description of class SnakeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SnakeTest
{
    private Snake mockSnake;
    
    /**
     * Constructor for SnakeTest
     */
    public SnakeTest()
    {
        mockSnake = new Snake(80.0);
    }
    
    /**
     * Unit test for hours slept method
     * @return 
     */
    public boolean hoursSleptTestingSetsEnergy() {
        mockSnake.setEnergy(5.0);
        boolean validStartingEnergy = mockSnake.getEnergy() == 5.0;
        mockSnake.hoursSlept();
        boolean validEndingEnergy = mockSnake.getEnergy() == 3.0;
        
        return validStartingEnergy && validEndingEnergy;
    }
    
    /**
     * Unit test for hours slept with temperature of 90 degrees
     * @return true if correct
     */
    public boolean hoursSleptWith90Temperature() {
        mockSnake = new Snake(90.0);
        boolean validHoursSlept = mockSnake.hoursSlept() == -1.0;
        
        return validHoursSlept;
    }
}
