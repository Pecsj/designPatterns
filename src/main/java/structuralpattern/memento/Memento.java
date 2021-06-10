package structuralpattern.memento;

import java.util.HashMap;

public class Memento {
    public String data;
    public void addState(Computer.Memory memory){
        this.data = memory.toString();
    }
    public Computer.Memory getState(){
        Computer.Memory memory = new Computer.Memory(this.data);
        return memory;
    }
}
