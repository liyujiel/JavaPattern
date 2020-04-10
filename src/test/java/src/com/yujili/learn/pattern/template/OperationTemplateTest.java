package src.com.yujili.learn.pattern.template;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTemplateTest {

    private static final int num1 = 10;
    private static final int num2 = 5;
    private OperationTemplate template;

    @Test
    public void doAddOperation() {
        template = new OperationAdd();
        int res = template.doOperation(num1, num2);

        Assert.assertEquals(15, res);
    }

    @Test
    public void doSubtractOperation() {
        template = new OperationSubtract();
        int res = template.doOperation(num1, num2);

        Assert.assertEquals(5, res);
    }
}