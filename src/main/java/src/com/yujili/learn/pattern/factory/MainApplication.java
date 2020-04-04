package src.com.yujili.learn.pattern.factory;

public class MainApplication {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1  = shapeFactory.getShape("Circle");
        System.out.println(shape1.draw());

        Shape shape2  = shapeFactory.getShape("Square");
        System.out.println(shape2.draw());

        Shape shape3  = shapeFactory.getShape("Rectangle");
        System.out.println(shape3.draw());
    }
}
