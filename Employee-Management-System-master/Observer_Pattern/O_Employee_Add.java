package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class O_Employee_Add {
    private List<O_EmployeeAddedObserver> observers = new ArrayList<>();

    public void addObserver(O_EmployeeAddedObserver observer) {
        observers.add(observer);
    }

    public void createFile() {
        O_EmployDetail emp = new O_EmployDetail();
        emp.getInfo();
        try {
            String employeeId = emp.employ_id;
            for (O_EmployeeAddedObserver observer : observers) {
                observer.onEmployeeAdded(employeeId);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

