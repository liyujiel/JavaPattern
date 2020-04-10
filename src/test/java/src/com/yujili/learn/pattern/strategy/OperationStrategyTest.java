package src.com.yujili.learn.pattern.strategy;

import org.junit.Assert;
import org.junit.Test;

public class OperationStrategyTest {

    private static final int num1 = 10;
    private static final int num2 = 5;
    private OperationStrategy operationStrategy;

    @Test
    public void doAddOperation() {
        operationStrategy = new OperationAdd();
        int res = operationStrategy.doOperation(num1, num2);

        Assert.assertEquals(15, res);
    }

    @Test
    public void doSubtractOperation() {
        operationStrategy = new OperationSubtract();
        int res = operationStrategy.doOperation(num1, num2);

        Assert.assertEquals(5, res);
    }
}