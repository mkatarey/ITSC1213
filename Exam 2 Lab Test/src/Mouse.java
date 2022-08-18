/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public class Mouse extends Animal{
    public Mouse(String name, double size) {
        super(name, size);
    }
    
    @Override
    public void eats(Food f) {
        if (f instanceof Animal) {
            return;
        }
        else {
            this.setSize(this.getSize() + (0.8 * f.getSize()));
        }
    }
}