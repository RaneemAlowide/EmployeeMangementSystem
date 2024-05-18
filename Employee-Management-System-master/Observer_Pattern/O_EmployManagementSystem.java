package Observer_Pattern;


import java.util.Scanner;

public class O_EmployManagementSystem {
    public static void main(String arv[]) {
        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);

        int i = 0;

        O_MainMenu obj1 = new O_MainMenu();
        obj1.menu();

        O_Employee_Show employeeShow = new O_Employee_Show();

        O_Employee_Add employeeAdd = new O_Employee_Add();
        employeeAdd.addObserver(employeeShow);


        while (true) {
            System.out.print("\nPlease Enter choice :");
            i = Integer.parseInt(sc.nextLine());

            switch (i) {
                case 1: {
                    employeeAdd.createFile();

                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 2: {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String s = sc.nextLine();
                    O_Employee_Show epv = new O_Employee_Show();
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
                    O_Employee_Remove epr = new O_Employee_Remove();
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
                        O_Employee_Show epv = new O_Employee_Show();
                        epv.viewFile(I);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    O_Employee_Update epu = new O_Employee_Update();
                    System.out.print("Please Enter the detail you want to Update :");
                    System.out.print("\nFor Example :\n");
                    System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
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
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                case 5: {
                    O_CodeExit obj = new O_CodeExit();
                    obj.out();
                    break; // Added break statement
                }
            }
        }
    }
}
