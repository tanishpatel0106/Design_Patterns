package Structural.Flyweight;

public class Circle implements Shape{
    private String color;
    private int x;
    private int y;
    private int radius;
    public Circle(String color){
        this.color = color;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.print("Circle::Draw()");
        System.out.println("Color: " + color);
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Radius: " + radius);
    }
}
