package javaapplication134;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;

public class BonusEmployeeDecorator implements EmployeeDecorator {
    private D_Employee_Show employeeShow;

    public BonusEmployeeDecorator(D_Employee_Show employeeShow) {
        this.employeeShow = employeeShow;
    }

    public void viewFile(String s) throws Exception {
        employeeShow.viewFile(s);
        calculateBonus();
    }

    private void calculateBonus() {
        System.out.println("Calculating bonus for the employee...");
        // Perform bonus calculation logic here
        System.out.println("Bonus calculated and added to the employee's details.");
    }

    public void displayWithBonus() {
        // Delegate to viewFile method
    }
}