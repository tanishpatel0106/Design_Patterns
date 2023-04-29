package Creational.AbstractFactory;
public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        if (shapeType == null)
            return null;
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if (shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}
