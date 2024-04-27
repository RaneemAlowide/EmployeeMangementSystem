package Factor_Pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class F_EmployeeShow  implements FactoryEmployeeService {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease Enter Employee's ID: ");
        String employeeId = scanner.nextLine();

        try {
            File file = new File("file" + employeeId + ".txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("\nEmployee does not exist :(");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
