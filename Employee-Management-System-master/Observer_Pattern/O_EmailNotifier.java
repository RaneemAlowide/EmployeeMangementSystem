package Observer_Pattern;

public class O_EmailNotifier implements O_EmployeeAddedObserver {
    @Override
    public void onEmployeeAdded(String employeeId) {
        System.out.println("Email notification sent for employee with ID: " + employeeId);
    }
}
