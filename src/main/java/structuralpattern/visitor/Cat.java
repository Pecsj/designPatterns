package structuralpattern.visitor;

public class Cat extends Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        //定义不变的逻辑
        System.out.println("大橘又长胖了些");
    }
}
