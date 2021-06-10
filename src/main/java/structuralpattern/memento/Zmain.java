package structuralpattern.memento;

public class Zmain {
    public static void main(String[] args) {
        /**
         * 备忘录模式：
         * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
         *
         */
        Computer computer = new Computer();//发起人
        Memento memento = computer.saveToMemento();//备份
        CareTaker careTaker = new CareTaker();//存储备份
        careTaker.addMemento("state1",memento);

        //修改数据
        computer.memory.content = "我被修改了";

        //将备份恢复
        computer.setToComputer(careTaker.getMemento("state1"));

        System.out.println(computer.memory.toString());
    }
}
