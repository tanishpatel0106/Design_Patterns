import Structural.Facade.*;
public class FacadePattern {
    public static void main(String [] args){
        ShapeMaker sm = new ShapeMaker();
        sm.drawCircle();
        sm.drawSquare();
        sm.drawTriangle();
    }
}
