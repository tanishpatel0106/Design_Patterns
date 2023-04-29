import Creational.AbstractFactory.*;

public class AbstractFactoryPattern {
    public static void main(String [] args){
        Creational.AbstractFactory.AbstractFactory sf = FactoryProducer.getFactory(false);
        Shape s1 = sf.getShape("Rectangle");
        s1.draw();
        Shape s2 = sf.getShape("Square");
        s2.draw();
        Creational.AbstractFactory.AbstractFactory sf2 = FactoryProducer.getFactory(true);
        Shape s3 = sf2.getShape("Rectangle");
        s3.draw();
        Shape s4 = sf2.getShape("Square");
        s4.draw();
    }
}
