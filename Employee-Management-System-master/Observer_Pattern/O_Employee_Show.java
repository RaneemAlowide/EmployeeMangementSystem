package Observer_Pattern;

class O_Employee_Show implements O_EmployeeAddedObserver {
    public void viewFile(String s) {

    }

    @Override
    public void onEmployeeAdded(String employeeId) {
        System.out.println("--------------------------");
        System.out.println("** New employee added with ID: " + employeeId + " **");
        System.out.println("--------------------------");
    }
}
