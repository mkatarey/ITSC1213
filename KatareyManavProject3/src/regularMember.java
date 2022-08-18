/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public class regularMember {
    private String name;
    private static int personalIDCounter;
    int personalMemberID;
    double moneySpent;
    
    public regularMember(String name) {
        this.name = name;
        personalMemberID = this.personalIDCounter;
        personalIDCounter++;
        moneySpent = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalIDCounter() {
        return personalIDCounter;
    }

    public void setPersonalID(int personalIDCounter) {
        this.personalIDCounter = personalIDCounter;
    }

    public int getPersonalMemberID() {
        return personalMemberID;
    }

    public void setPersonalMemberID(int personalMemberID) {
        this.personalMemberID = personalMemberID;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }
}
