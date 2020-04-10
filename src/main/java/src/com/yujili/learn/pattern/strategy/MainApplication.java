package src.com.yujili.learn.pattern.strategy;

public class MainApplication {
    public static void main(String[] args) {
        OperationStrategy operationAdd = new OperationAdd();
        System.out.println(operationAdd.doOperation(10, 5));

        OperationStrategy operationSubtract = new OperationSubtract();
        System.out.println(operationSubtract.doOperation(10, 5));
    }
}
