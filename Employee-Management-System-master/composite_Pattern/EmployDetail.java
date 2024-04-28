package composite_Pattern;

import java.util.Scanner;

public class EmployDetail implements EmployComponent {
    private String name;
    private String father_name;
    private String email;
    private String position;
    private String employ_id;
    private String employ_salary;
    private String employ_contact;

    @Override
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

    @Override
    public void view() {
        System.out.println("Employee ID:" + employ_id);
        System.out.println("Employee Name     :" + name);
        System.out.println("Father's Name     :" + father_name);
        System.out.println("Employee Contact  :" + employ_contact);
        System.out.println("Email Information :" + email);
        System.out.println("Employee position :" + position);
        System.out.println("Employee Salary   :" + employ_salary);
    }
}