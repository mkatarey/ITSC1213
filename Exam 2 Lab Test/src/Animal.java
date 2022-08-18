/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public abstract class Animal extends Food{
    public Animal(String name, double size) {
        super(name, size);
    }
    
    public abstract void eats(Food f);
}