
/**
 * Here we have an Animal class that can be extended for sleeping eating.
 * In reality it's just an example for <b>ITSC1213</b>.
 *
 * @author Geoffrey Grimaud
 * @version November 2, 2021
 */
public abstract class Animal
{
    private double energy;

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        energy = 0.0;
    }
    
    /**
     * Getter for Energy
     * @return energy as a double
     */
    protected double getEnergy(){
        return this.energy;
    }
    
    /**
     * Setter for energy field
     * @param energy 
     */
    protected void setEnergy(double energy){
        this.energy = energy;
    }

    /**
     * This method gives energy to the animal and increases it's sleep.
     * 
     * @param food the food consumed.
     */
    public abstract void eat(String food);

    /**
     * This method returns the amount of hours slept for the animal. This will be 
     * calculated based on the type of animal.
     * 
     * @return the amount of hours slept.
     */
    public abstract double hoursSlept();
}
