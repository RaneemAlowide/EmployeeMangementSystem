package composite_Pattern;

import java.util.Scanner;

public class EmployManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDirectory directory = new EmployeeDirectory();
        MainMenu menu = new MainMenu();

        int choice = 0;

        while (choice != 5) {
            menu.menu();
            System.out.print("\nPlease Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    EmployDetail emp = new EmployDetail();
                    emp.getInfo();
                    directory.addEmployee(emp);
                    break;

                case 2:
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String empId = sc.nextLine();
                    directory.view();
                    break;

                case 3:
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String removeId = sc.nextLine();
                    // Remove employee logic
                    break;

                case 4:
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String updateId = sc.nextLine();
                    // Update employee logic
                    break;

                case 5:
                    CodeExit exit = new CodeExit();
                    exit.out();
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}