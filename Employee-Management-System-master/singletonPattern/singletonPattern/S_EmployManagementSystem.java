package singletonPattern;

import java.io.IOException;
import java.util.Scanner;

class S_EmloyManagementSystem {
    public static void main(String arv[]) {
        /** To clear the output Screen **/
        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);
        S_Employee_Show epv = new S_Employee_Show();
        int i = 0;

        /*** Callining Mainmenu Class function ****/
        S_MainMenu obj1 = S_MainMenu.getInstance();
        obj1.menu();

        /*** Initializing loop for Menu Choices ***/
        while (i < 6) {
            System.out.print("\nPlease Enter choice :");
            i = Integer.parseInt(sc.nextLine());

            /** Switch Case Statements **/
            switch (i) {
                case 1: {
                    /** Creating class's object and calling Function using that object **/
                    S_Employee_Add ep = new S_Employee_Add();
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
                    S_Employee_Remove epr = new S_Employee_Remove();
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
                    S_Employee_Update epu = new S_Employee_Update();
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
                    S_CodeExit obj = new S_CodeExit();
                    obj.out();
                }
            }
        }
    }
}
