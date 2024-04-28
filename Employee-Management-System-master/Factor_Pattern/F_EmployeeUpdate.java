package Factor_Pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class F_EmployeeUpdate implements FactoryEmployeeService {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease Enter Employee's ID: ");
        String employeeId = scanner.nextLine();
        try {
            File file = new File("file" + employeeId + ".txt");
            Scanner sc = new Scanner(file);
            StringBuilder fileContent = new StringBuilder();
            while (sc.hasNextLine()) {
                fileContent.append(sc.nextLine()).append("\n");
            }
            System.out.println(fileContent.toString());

            System.out.print("Please Enter the detail you want to Update: ");
            String oldInfo = scanner.nextLine();
            System.out.print("Please Enter the Updated Info: ");
            String newInfo = scanner.nextLine();

            String updatedContent = fileContent.toString().replaceAll(oldInfo, newInfo);

            FileWriter myWriter = new FileWriter("file" + employeeId + ".txt");
            myWriter.write(updatedContent);
            myWriter.close();

            System.out.println("\nEmployee details have been updated successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("\nEmployee does not exist :(");
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}