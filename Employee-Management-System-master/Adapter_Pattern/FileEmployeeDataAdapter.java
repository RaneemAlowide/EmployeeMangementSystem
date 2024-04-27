package Adapter_Pattern;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileEmployeeDataAdapter implements EmployeeDataAdapter {
  @Override
  public void saveEmployeeData(String employeeId, String data) throws IOException {
    File file = new File("file" + employeeId + ".txt");
    FileWriter writer = new FileWriter(file);
    writer.write(data);
    writer.close();
  }

  @Override
  public String retrieveEmployeeData(String employeeId) throws IOException {
    File file = new File("file" + employeeId + ".txt");
    BufferedReader reader = new BufferedReader(new FileReader(file));
    StringBuilder data = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
      data.append(line).append("\n");
    }
    reader.close();
    return data.toString();
  }
}