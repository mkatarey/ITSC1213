
/**
 * Write a description of class Snake here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Snake extends Animal
{
    private double temperature;

    /**
     * Constructor for objects of class Snake
     */
    public Snake(double temperature)
    {
        super();
        this.temperature = temperature;
    }
    
    /**
     * 
     * Increases temperature by degrees parameter
     * @param degrees 
     */
    public void warmUp(double degrees) {
        this.temperature += degrees;
    }
    
    /**
     * 
     * Decreases temperature by degrees parameter
     * @param degrees 
     */
    public void coolDown(double degrees) {
        this.temperature -= degrees;
    }
    
    /**
     * This method gives energy to the snake.
     * 
     * @param food the food consumed.
     */
    @Override
    public void eat(String food) {
        super.setEnergy(super.getEnergy() + 5.0);
    }
    
    /**
     * <p>This method returns the amount of hours slept for the animal. This will be 
     * calculated based on the temperature of the snake. This will always decrease the
     * snake's energy by 2.0</p>
     * 
     * <p>returns: 
     *  <ul>
     *   <li>6.0 if the temperature is over 80 </li>
     *   <li>7.0 if the temperature is over 70 </li>
     *   <li>10.0 if the temperature is over 60 </li>
     *   <li>-1.0 if the temperature is over 90 or under 60</li>
     *  </ul>
     * </p>
     * 
     * @return the amount of hours slept based off temperature.
     */
    public double hoursSlept() {
        double result = -1.0;
    
        super.setEnergy(super.getEnergy() - 2.0);
        if (this.temperature > 80 && this.temperature < 90) {
            result = 6.0;
        } else if(this.temperature > 70 && this.temperature < 90) {
            result = 7.0;
        } else if(this.temperature > 60 && this.temperature < 90) {
            result = 10.0;
        }

        return result;
    }
}
