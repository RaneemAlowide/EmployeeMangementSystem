package strategyPattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee_Update implements employeeOperation {
    private String id, oldDetail, newDetail;

    public Employee_Update(String id, String oldDetail, String newDetail) {
        this.id = id;
        this.oldDetail = oldDetail;
        this.newDetail = newDetail;
    }

    @Override
    public void executeOperation() {
        try {
            File file = new File("file" + id + ".txt");
            Scanner sc = new Scanner(file);
            String fileContent = "";
            while (sc.hasNextLine()) {
                fileContent += "\n" + sc.nextLine();
            }
            sc.close();
            fileContent = fileContent.replaceAll(oldDetail, newDetail);
            FileWriter myWriter = new FileWriter("file" + id + ".txt");
            myWriter.write(fileContent);
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}