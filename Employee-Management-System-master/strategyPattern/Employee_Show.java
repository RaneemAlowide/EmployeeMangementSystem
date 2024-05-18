package strategyPattern;

import java.io.File;
import java.util.Scanner;

public class Employee_Show implements employeeOperation {
    @Override
    public void executeOperation() {
        throw new UnsupportedOperationException("Employee ID required for this operation.");
    }

    @Override
    public void executeOperation(String s) {
        try {
            File file = new File("file" + s + ".txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}