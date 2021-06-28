package structuralpattern.visitor;

public class Zmain {
    /**
     * 访问者模式:
     * 访问者模式（Visitor）是一种操作一组对象的操作，它的目的是不改变对象的定义，但允许新增不同的访问者，来定义新的操作
     *
     * 使用场景:
     * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免让这些操作“污染”这些对象的类时
     *
     * 优点：
     * 符合单一职责原则
     * 优秀的扩展性
     * 灵活性非常高
     *
     * 缺点：
     * 具体元素对访问者公布细节，也就是说访问者关注了其他类的内部细节，这是迪米特法则所不建议的
     * 具体元素变更比较困难
     * 违背了依赖倒转原则。访问者依赖的是具体元素，而不是抽象元素
     *
     */
    public static void main(String[] args) {
        //结构对象
        ObjectStructure structure = new ObjectStructure();
        //被访问对象
        Animal cat = new Cat();
        Animal dog = new Dog();
        structure.addAnimal(cat);
        structure.addAnimal(dog);
        //访问者一
        Person person1 = new PersonOne();
        structure.action(person1);
        System.out.println("\n\n");
        //访问者二
        Person person2 = new PersonTwo();
        structure.action(person2);
    }
}
