package structuralpattern.mediator;

public class Zmain {
    public static void main(String[] args) {
        /**
         * 中介者模式（调停者模式）：
         * 中介者模式(Mediator Pattern)定义：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，
         * 而且可以独立地改变它们之间的交互。中介者模式又称为调停者模式，它是一种对象行为型模式。
         *
         * 优点：
         * 【简化了对象之间的交互】。
         * 将各同事解耦。
         * 减少子类生成。
         * 可以简化各同事类的设计和实现。
         *
         * 缺点：
         * 在具体中介者类中【包含了同事之间的交互细节】，可能会导致具体中介者类非常复杂，使得系统难以维护。
         *
         */
        Mediator mediator = new MediatorIml();
        Student student1 = new Student1();
        Student student2 = new Student2();
        Student student3 = new Student3();
        //注册中介
        mediator.register(student1);
        mediator.register(student2);
        mediator.register(student3);

        //发送通知
        student1.sendMsg("同志们幸苦了");
    }
}
