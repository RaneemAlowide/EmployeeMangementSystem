package Factor_Pattern;

public class F_EmployeeServiceFactory {
    public static FactoryEmployeeService createService(int choice) {
        switch (choice) {
            case 1:
                return new F_EmployeeAdd();
            case 2:
                return new F_EmployeeShow();
            case 3:
                return new F_EmployeeRemove();
            case 4:
                return new F_EmployeeUpdate();
            case 5:
                return new F_CodeExit();
            default:
                System.out.println("Invalid choice!");
                return null;
        }
    }
}
