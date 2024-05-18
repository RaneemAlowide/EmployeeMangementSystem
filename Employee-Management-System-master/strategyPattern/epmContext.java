package strategyPattern;

public class epmContext {
    employeeOperation operation;

    public epmContext(employeeOperation operation) {
        this.operation = operation;
    }

    public void performOperation() {
        operation.executeOperation();
    }

    public void performOperation(String s) {
        operation.executeOperation(s);
    }
}
