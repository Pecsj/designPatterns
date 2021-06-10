package structuralpattern.memento;

import java.util.HashMap;
import java.util.LinkedList;

public class CareTaker {
    private HashMap<String,Memento> mementos = new HashMap();

    public void addMemento(String key,Memento memento){
        mementos.put(key,memento);
    }

    public Memento getMemento(String key){
        return mementos.get(key);
    }

}
