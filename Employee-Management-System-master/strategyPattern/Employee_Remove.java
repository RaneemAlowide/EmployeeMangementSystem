package strategyPattern;
import java.io.File;

public class Employee_Remove implements employeeOperation {
    private String id;

    public Employee_Remove(String id) {
        this.id = id;
    }

    @Override
    public void executeOperation() {
        File file = new File("file" + id + ".txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("\nEmployee has been removed Successfully");
            }
        } else {
            System.out.println("\nEmployee does not exist :(");
        }
    }
}
