package structuralpattern.mediator;

public class Zmain {
    public static void main(String[] args) {
        /**
         * 中介者模式（调停者模式）：
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
