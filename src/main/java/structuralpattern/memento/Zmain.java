package structuralpattern.memento;

public class Zmain {
    public static void main(String[] args) {
        /**
         * 备忘录模式：
         * 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
         *
         * 其实我们使用的几乎所有软件都用到了备忘录模式。
         * 最简单的备忘录模式就是保存到文件，打开文件。对于文本编辑器来说，保存就是把TextEditor类的字符串存储到文件，打开就是恢复TextEditor类的状态。
         * 对于图像编辑器来说，原理是一样的，只是保存和恢复的数据格式比较复杂而已。
         * Java的序列化也可以看作是备忘录模式。
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
