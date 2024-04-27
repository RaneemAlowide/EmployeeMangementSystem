import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class A_Employee_Add {
    private EmployeeDataAdapter adapter;

    public A_Employee_Add(EmployeeDataAdapter adapter) {
        this.adapter = adapter;
    }

    public void createFile() {
        A_EmployDetail emp = new A_EmployDetail();
        emp.getInfo();
        try {
            String employeeData = "Employee ID:" + emp.employ_id + "\n" +
                    "Employee Name     :" + emp.name + "\n" +
                    "Father's Name     :" + emp.father_name + "\n" +
                    "Employee Contact  :" + emp.employ_contact + "\n" +
                    "Email Information :" + emp.email + "\n" +
                    "Employee position :" + emp.position + "\n" +
                    "Employee Salary   :" + emp.employ_salary;
            adapter.saveEmployeeData(emp.employ_id, employeeData);
            System.out.println("\nEmployee has been Added :)\n");
            System.out.print("\nPress Enter to Continue...");
            new Scanner(System.in).nextLine();
        } catch (IOException e) {
            System.out.println("Error occurred while adding employee: " + e.getMessage());
        }
    }
}
