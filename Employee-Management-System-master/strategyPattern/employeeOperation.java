package strategyPattern;

public interface employeeOperation {
    void executeOperation();

    default void executeOperation(String s) {
        throw new UnsupportedOperationException("This operation is not supported.");
    }

}
