package Factor_Pattern;

import java.util.Scanner;

public class FactoryEmployManagementSystem {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        F_MainMenu obj1 = new F_MainMenu();
        obj1.menu();

        while (choice != 5) {
            System.out.print("\nPlease Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            FactoryEmployeeService service = F_EmployeeServiceFactory

                    .createService(choice);
            if (service != null) {
                service.execute();
                System.out.print("\033[H\033[2J");
                obj1.menu();
            }
        }
    }
}
