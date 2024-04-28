package Adapter_Pattern;
import java.io.IOException;

public class A_Employee_Show {
  private EmployeeDataAdapter adapter;

  public A_Employee_Show() {
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
