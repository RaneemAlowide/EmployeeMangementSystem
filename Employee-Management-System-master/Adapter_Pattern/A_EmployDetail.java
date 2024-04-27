import java.util.Scanner;

public class A_EmployDetail {
  String name;
  String father_name;
  String email;
  String position;
  String employ_id;
  String employ_salary;
  String employ_contact;

  public void getInfo() {
    Scanner Text = new Scanner(System.in);
    System.out.print("Enter Employee's name --------: ");
    name = Text.nextLine();
    System.out.print("Enter Employee's Father name -: ");
    father_name = Text.nextLine();
    System.out.print("Enter Employee's ID ----------: ");
    employ_id = Text.nextLine();
    System.out.print("Enter Employee's Email ID ----: ");
    email = Text.nextLine();
    System.out.print("Enter Employee's Position ----: ");
    position = Text.nextLine();
    System.out.print("Enter Employee contact Info --: ");
    employ_contact = Text.nextLine();
    System.out.print("Enter Employee's Salary ------: ");
    employ_salary = Text.nextLine();
  }
}
