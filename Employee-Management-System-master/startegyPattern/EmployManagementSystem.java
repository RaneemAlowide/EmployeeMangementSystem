package startegyPattern;
import java.util.*;
import java.io.*;

/************************** Employee Details ***************************/

class EmployDetail {
    String name;
    String father_name;
    String email;
    String position;
    String employ_id;
    String employ_salary;
    String employ_contact;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        name = sc.nextLine();
        System.out.print("Enter Employee's Father name -: ");
        father_name = sc.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        employ_id = sc.nextLine();
        System.out.print("Enter Employee's Email ID ----: ");
        email = sc.nextLine();
        System.out.print("Enter Employee's Position ----: ");
        position = sc.nextLine();
        System.out.print("Enter Employee contact Info --: ");
        employ_contact = sc.nextLine();
        System.out.print("Enter Employee's Salary ------: ");
        employ_salary = sc.nextLine();
    }
}

/************************** Employee Action Interface ***************************/

interface EmployeeAction {
    void performAction(String id) throws Exception;
}

/************************** Adding Employee ***************************/

class EmployeeAdd implements EmployeeAction {
    @Override
    public void performAction(String id) throws Exception {
        Scanner sc = new Scanner(System.in);

        EmployDetail emp = new EmployDetail();
        emp.getInfo();
        try {
            File f1 = new File("file" + emp.employ_id + ".txt");
            if (f1.createNewFile()) {
                FileWriter myWriter = new FileWriter("file" + emp.employ_id + ".txt");
                myWriter.write("Employee ID:" + emp.employ_id + "\n" + "Employee Name     :" + emp.name + "\n" +
                        "Father's Name     :" + emp.father_name + "\n" + "Employee Contact  :" + emp.employ_contact + "\n" +
                        "Email Information :" + emp.email + "\n" + "Employee position :" + emp.position + "\n" +
                        "Employee Salary   :" + emp.employ_salary);
                myWriter.close();
                System.out.println("\nEmployee has been Added :)\n");

                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            } else {
                System.out.println("\nEmployee already exists :(");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/************************** Showing Employee ***************************/

class EmployeeShow implements EmployeeAction {
    @Override
    public void performAction(String id) throws Exception {
        File file = new File("file" + id + ".txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
}

/************************** Removing Employee ***************************/

class EmployeeRemove implements EmployeeAction {
    @Override
    public void performAction(String id) throws Exception {
        File file = new File("file" + id + ".txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("\nEmployee has been removed Successfully");
            }
        } else {
            System.out.println("\nEmployee does not exist :(");
        }
    }
}

/************************** Updating Employee ***************************/

class EmployeeUpdate implements EmployeeAction {
    @Override
    public void performAction(String id) throws Exception {
        Scanner sc = new Scanner(System.in);
        EmployeeShow epv = new EmployeeShow();

        try {
            epv.performAction(id);
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        System.out.print("Please Enter the detail you want to Update :");
        System.out.print("\nFor Example :\n");
        System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
        String s = sc.nextLine();
        System.out.print("Please Enter the Updated Info :");
        String n = sc.nextLine();

        File file = new File("file" + id + ".txt");
        Scanner fileScanner = new Scanner(file);
        String fileContent = "";
        while (fileScanner.hasNextLine()) {
            fileContent = fileContent + "\n" + fileScanner.nextLine();
        }
        FileWriter myWriter = new FileWriter("file" + id + ".txt");
        fileContent = fileContent.replaceAll(s, n);
        myWriter.write(fileContent);
        myWriter.close();
    }
}

/************************** Main Menu ***************************/

class MainMenu {
    public void menu() {
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t\t  EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("\t\t*******************************************");
        System.out.println("\t\t\t    --------------------");
        System.out.println("\t\t\t     ~$ Abhinav Dubey");
        System.out.println("\t\t\t    --------------------");
        System.out.println("\n\nPress 1 : To Add an Employee Details");
        System.out.println("Press 2 : To See an Employee Details ");
        System.out.println("Press 3 : To Remove an Employee");
        System.out.println("Press 4 : To Update Employee Details");
        System.out.println("Press 5 : To Exit the EMS Portal");
    }
}

/************************** Exiting Program ***************************/

class CodeExit {
    public void out() {
        System.out.println("\n*****************************************");
        System.out.println("$ cat Thank You For Using my Software :) ");
        System.out.println("*****************************************");
        System.out.println("\t\t/~ <0d3d by Abhinav Dubey\n");
        System.exit(0);
    }
}

/************************** Employee Management System ***************************/

class EmployManagementSystem {
    public static void main(String arv[]) throws Exception {
        /** To clear the output Screen **/
        System.out.print("\033[H\033[2J");

        Scanner sc = new Scanner(System.in);
        EmployeeAction[] actions = {
                new EmployeeAdd(),
                new EmployeeShow(),
                new EmployeeRemove(),
                new EmployeeUpdate(),
                (EmployeeAction) new CodeExit()
        };

        MainMenu menu = new MainMenu();

        while (true) {
            menu.menu();
            System.out.print("\nPlease Enter choice :");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice >= 1 && choice <= 5) {
                if (choice == 5) {
                    actions[choice - 1].performAction(null);
                    break;
                } else {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String id = sc.nextLine();
                    try {
                        actions[choice - 1].performAction(id);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                }
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
