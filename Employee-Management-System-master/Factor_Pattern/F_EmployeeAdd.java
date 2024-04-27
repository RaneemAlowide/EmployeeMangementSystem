package Factor_Pattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F_EmployeeAdd implements FactoryEmployeeService {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        F_EmployDetail emp = new F_EmployDetail();
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
                scanner.nextLine();
            } else {
                System.out.println("\nEmployee already exists :(");
                System.out.print("\nPress Enter to Continue...");
                scanner.nextLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}