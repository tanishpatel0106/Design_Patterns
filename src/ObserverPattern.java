import Behavioral.Observer.*;
public class ObserverPattern {
    public static void main(String [] args){
        Subject subject = new Subject();
        new HexalObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state: 69");
        subject.setState(69);
        System.out.println("Second state: 420");
        subject.setState(420);
    }
}
