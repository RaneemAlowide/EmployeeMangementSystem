package singletonPattern;


import java.io.File;
import java.util.Scanner;

public class S_Employee_Show {
    public void viewFile(String s) throws Exception
    {
        File file = new File("file"+s+".txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
    }
}