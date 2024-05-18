package strategyPattern;
import java.util.Scanner;

public class EmployManagementSystem {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        Employee_Show epv = new Employee_Show();

        int i = 0;

        MainMenu obj1 = new MainMenu();
        obj1.menu();

        while (i != 5) {
            System.out.print("\nPlease Enter choice: ");
            i = Integer.parseInt(sc.nextLine());


            switch (i) {
                case 1: {
                    epmContext context = new epmContext(new Employee_Add());
                    context.performOperation();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 2: {
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String s = sc.nextLine();
                    try {
                        epmContext context = new epmContext(new Employee_Show());
                        context.performOperation(s);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 3: {
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String s = sc.nextLine();
                    epmContext context = new epmContext(new Employee_Remove(s));
                    context.performOperation();
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 4: {
                    System.out.print("\nPlease Enter Employee's ID: ");
                    String s = sc.nextLine();
                    System.out.print("Please Enter the detail you want to Update: ");
                    String oldDetail = sc.nextLine();
                    System.out.print("Please Enter the Updated Info: ");
                    String newDetail = sc.nextLine();
                    try {
                        epmContext context = new epmContext(new Employee_Update(s, oldDetail, newDetail));
                        context.performOperation();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 5: {
                    CodeExit obj = new CodeExit();
                    obj.out();
                    break;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                    break;
                }
            }
        }
        sc.close();
    }
}