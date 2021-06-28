package structuralpattern.visitor;

public class Dog extends Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        //定义不变的逻辑
        System.out.println("狗狗开心的:汪汪...");
    }
}
