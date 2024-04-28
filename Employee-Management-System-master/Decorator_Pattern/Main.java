/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication134;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author USER
 */


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        D_MainMenu menu = new D_MainMenu();
        D_Employee_Add addEmployee = new D_Employee_Add();
        D_Employee_Show showEmployee = new D_Employee_Show() {
            @Override
            public void viewFile(String s) throws Exception {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        D_Employee_Remove removeEmployee = new D_Employee_Remove();
        D_Employee_Update updateEmployee = new D_Employee_Update();

        int choice;
        String empID;

        do {
            menu.menu();
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addEmployee.createFile();
                    break;
                case 2:
                    /* System.out.print("Enter Employee ID: ");
                    empID = sc.nextLine();
                    showEmployee.viewFile(empID);
                    break;*/
                   System.out.print("Enter Employee ID: ");
                    empID = sc.nextLine();
                    try {
                        showEmployee.viewFile(empID);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    empID = sc.nextLine();
                    removeEmployee.removeFile(empID);
                    break;
                case 4:
                    System.out.print("Enter Employee ID: ");
                    empID = sc.nextLine();
                    System.out.print("Enter the old value: ");
                    String oldValue = sc.nextLine();
                    System.out.print("Enter the new value: ");
                    String newValue = sc.nextLine();
                    try {
                        updateEmployee.updateFile(empID, oldValue, newValue);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Employee Management System...");
                    break;
                    
                case 6:
                     System.out.print("Enter Employee ID: ");
                    empID = sc.nextLine();
                    EmployeeDecorator employeeDecorator = new BonusEmployeeDecorator(showEmployee);
                    try {
                        employeeDecorator.viewFile(empID);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }
}