package Behavioral.Memento;
import java.util.List;
import java.util.ArrayList;
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();
    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
