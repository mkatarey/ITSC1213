/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manavkatarey
 */
public class premiumMember {
    private String name;
    private boolean paid;
    private static int personalPremiumIDCounter;
    int personalPremiumMemberID;
    private String paymentMethod;
    double premiumMoneySpent;
    
    public premiumMember(String name, boolean paid, String paymentMethod) {
        this.name = name;
        this.paid = paid;
        personalPremiumMemberID = this.personalPremiumIDCounter;
        personalPremiumIDCounter++;
        premiumMoneySpent = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public static int getPersonalPremiumIDCounter() {
        return personalPremiumIDCounter;
    }

    public static void setPersonalPremiumIDCounter(int personalPremiumIDCounter) {
        premiumMember.personalPremiumIDCounter = personalPremiumIDCounter;
    }

    public int getPersonalPremiumMemberID() {
        return personalPremiumMemberID;
    }

    public void setPersonalPremiumMemberID(int personalPremiumMemberID) {
        this.personalPremiumMemberID = personalPremiumMemberID;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getPremiumMoneySpent() {
        return premiumMoneySpent;
    }

    public void setPremiumMoneySpent(double premiumMoneySpent) {
        this.premiumMoneySpent = premiumMoneySpent;
    }
}