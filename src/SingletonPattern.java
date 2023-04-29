import Creational.Singleton.*;
public class SingletonPattern {
    public static void main(String [] args){
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();
    }
}
