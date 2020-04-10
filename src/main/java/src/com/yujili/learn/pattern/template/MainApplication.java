package src.com.yujili.learn.pattern.template;

public class MainApplication {
    public static void main(String[] args) {

        OperationTemplate operationAdd = new OperationAdd();
        System.out.println(operationAdd.doOperation(10, 5));

        OperationTemplate operationSubtract = new OperationSubtract();
        System.out.println(operationSubtract.doOperation(10, 5));
    }
}
