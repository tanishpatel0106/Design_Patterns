package Behavioral.State;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("System in start state");
        context.setState(this);
    }
    public String toString(){
        return "Start State";
    }
}
