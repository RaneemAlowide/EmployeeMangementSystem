package composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory implements EmployComponent {
    private List<EmployComponent> employees = new ArrayList<>();

    public void addEmployee(EmployComponent emp) {
        employees.add(emp);
    }

    public void removeEmployee(EmployComponent emp) {
        employees.remove(emp);
    }

    @Override
    public void getInfo() {
        for (EmployComponent emp : employees) {
            emp.getInfo();
        }
    }

    @Override
    public void view() {
        for (EmployComponent emp : employees) {
            emp.view();
        }
    }
}