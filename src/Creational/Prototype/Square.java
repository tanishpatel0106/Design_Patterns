package Creational.Prototype;
public class Square extends Shape{
    public Square(){
        type = "Square";
    }
    @Override
    public void draw(){
        System.out.println("Square Draw Method");
    }
}
