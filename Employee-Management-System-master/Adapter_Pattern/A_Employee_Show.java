
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A_Employee_Show {
  private EmployeeDataAdapter adapter;

  public A_Employee_Show(EmployeeDataAdapter adapter) {
    this.adapter = adapter;
  }

  public void viewFile(String employeeId) {
    try {
      String employeeData = adapter.retrieveEmployeeData(employeeId);
      System.out.println(employeeData);
    } catch (IOException e) {
      System.out.println("Error occurred while retrieving employee data: " + e.getMessage());
    }
  }

}
