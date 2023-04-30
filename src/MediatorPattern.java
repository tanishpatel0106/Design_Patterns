import Behavioral.Mediator.*;
public class MediatorPattern {
    public static void main(String [] args){
        User Person1 = new User("Person1");
        User Person2 = new User("Person2");
        Person1.sendMessage("This is a Message 1!");
        Person1.sendMessage("This is a Message 2!");
        Person2.sendMessage("This is a Message 3!");
    }
}
