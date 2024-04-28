package Adapter_Pattern;


import java.io.IOException;
import java.util.Scanner;

public class A_EmployManagementSystem {
    public static void main(String arv[]) {
        /** To clear the output Screen **/
        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);
        A_Employee_Show epv = new A_Employee_Show();

        int i = 0;

        /*** Callining Mainmenu Class function ****/
        A_MainMenu obj1 = new A_MainMenu();
        obj1.menu();

        /*** Initialising loop for Menu Choices ***/
        while (i < 6) {

            System.out.print("\nPlease Enter choice :");
            i = Integer.parseInt(sc.nextLine());

            /** Switch Case Statements **/
            switch (i) {
                case 1: {
                    /** Creating class's object and calling Function using that object **/
                    A_Employee_Add ep = new A_Employee_Add();
                    ep.createFile();

                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 2: {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String s = sc.nextLine();
                    try {
                        epv.viewFile(s);
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
                    System.out.print("\nPlease Enter Employee's ID :");
                    String s = sc.nextLine();
                    A_Employee_Remove epr = new A_Employee_Remove();
                    epr.removeFile(s);

                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 4: {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String I = sc.nextLine();
                    try {
                        epv.viewFile(I);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    A_Employee_Update epu = new A_Employee_Update();
                    System.out.print("Please Enter the detail you want to Update :");
                    System.out.print("\nFor Example :\n");
                    System.out.println(
                            "If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
                    String s = sc.nextLine();
                    System.out.print("Please Enter the Updated Info :");
                    String n = sc.nextLine();
                    try {
                        epu.updateFile(I, s, n);

                        System.out.print("\nPress Enter to Continue...");
                        sc.nextLine();
                        System.out.print("\033[H\033[2J");
                        obj1.menu();
                        break;
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
                case 5: {
                    A_CodeExit obj = new A_CodeExit();
                    obj.out();
                }
            }
        }
    }
}