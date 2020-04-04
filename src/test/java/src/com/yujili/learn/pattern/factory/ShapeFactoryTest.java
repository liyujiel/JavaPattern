package src.com.yujili.learn.pattern.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryTest {

    private ShapeFactory shapeFactory;

    @Before
    public void beforeFunction() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void testGetCircleShape() {
        Shape testShape = shapeFactory.getShape("Circle");

        Assert.assertEquals(testShape.draw(), "Inside Circle::draw() method.");
    }

    @Test
    public void testGetSquareShape() {
        Shape testShape = shapeFactory.getShape("Square");

        Assert.assertEquals(testShape.draw(), "Inside Square::draw() method.");
    }

    @Test
    public void testGetRectangleShape() {
        Shape testShape = shapeFactory.getShape("Rectangle");

        Assert.assertEquals(testShape.draw(), "Inside Rectangle::draw() method.");
    }
}
