package Factor_Pattern;

import java.io.File;
import java.util.Scanner;

public class F_EmployeeRemove implements FactoryEmployeeService {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease Enter Employee's ID: ");
        String employeeId = scanner.nextLine();

        File file = new File("file" + employeeId + ".txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("\nEmployee has been removed Successfully");
            }
        } else {
            System.out.println("\nEmployee does not exist :(");
        }
    }
}
