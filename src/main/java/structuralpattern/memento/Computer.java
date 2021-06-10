package structuralpattern.memento;

import java.util.Arrays;

public class Computer {
    private int cpu = 123;
    private int gpu = 3070;
    public Memory memory = new Memory();

    public static class Memory{
        public String content = "我是正在运行的内容";

        Memory(){}
        Memory(String content){
            this.content = content;
        }

        @Override
        public String toString() {
            return "Memory{" +
                    "content=" + content +
                    '}';
        }
    }

    //保存到成一个备份
    public Memento saveToMemento(){
        Memento memento = new Memento();
        memento.addState(memory);
        return memento;
    }

    //把备份恢复
    public void setToComputer(Memento memento){
        memory = memento.getState();
    }

}
