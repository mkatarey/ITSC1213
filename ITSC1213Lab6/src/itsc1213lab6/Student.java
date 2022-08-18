/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itsc1213lab6;

/**
 *
 * @author manavkatarey
 */

import java.util.*;

public class Student extends Person {
    private String major;
    private double gpa;
    private int credits;
    private double balance;
    private boolean transfer;
    private ArrayList<String> enrolledCourses = new ArrayList<String>();
    
    public Student(String firstName, String lastName, int id, String major, double gpa, int credits) {
        super(firstName, lastName, id);
        this.major = major;
        this.gpa = gpa;
        this.credits = credits;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
    
    public void addCourse(String course) {
        enrolledCourses.add(course);
    }
    
    public boolean dropCourse(String course) {
        for (String i : enrolledCourses) {
            if (i.equals(course)) {
                enrolledCourses.remove(i);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void display() {
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("ID: " + this.getId() + "\tMajor: " + major);
        System.out.println("GPA: " + gpa + "\tCredits Applied: " + credits);
        System.out.println("Enrolled Courses: ");
        
        for (int i = 0; i < enrolledCourses.size(); i++) {
            System.out.println("\t" + enrolledCourses.get(i));
        }
    }
    
    @Override
    public String toString() {
        return "Student - " + this.getFirstName() + " " + this.getLastName();
    }
}
