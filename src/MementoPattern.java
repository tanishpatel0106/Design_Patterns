import Behavioral.Memento.*;
public class MementoPattern {
    public static void main(String [] args){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("State 1");
        originator.setState("State 2");
        caretaker.add(originator.saveStateToMemento());
        System.out.println("Current State: " + originator.getState());
        originator.setState("State 3");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("State 4");
        caretaker.add(originator.saveStateToMemento());
        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First Saved State: " + originator.getState());
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second Saved State: " + originator.getState());
        originator.getStateFromMemento(caretaker.get(2));
        System.out.println("Third Saved State: " + originator.getState());
    }
}
