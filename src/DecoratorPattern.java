import Structural.Decorator.*;
public class DecoratorPattern {
    public static void main(String [] args){
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectangle = new RedShapeDecorator(rectangle);
        System.out.println("Circle with No Border: ");
        circle.draw();
        System.out.println("Rectangle with No Border: ");
        rectangle.draw();
        System.out.println("Circle with Red Border: ");
        redCircle.draw();
        System.out.println("Rectangle with Red Border: ");
        redRectangle.draw();
    }
}
