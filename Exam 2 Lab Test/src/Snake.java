/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public class Snake extends Animal{
    public Snake(String name, double size) {
        super(name, size);
    }
    
    @Override
    public void eats(Food f) {
        if (f instanceof Animal) {
            this.setSize(this.getSize() + f.getSize());
        }
        else {
            return;
        }
    }
}