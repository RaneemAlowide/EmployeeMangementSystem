package Adapter_Pattern;
import java.io.*;

// Interface for accessing employee data
public interface EmployeeDataAdapter {
  void saveEmployeeData(String employeeId, String data) throws IOException;

  String retrieveEmployeeData(String employeeId) throws IOException;
}