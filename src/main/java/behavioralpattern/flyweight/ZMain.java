package behavioralpattern.flyweight;

public class ZMain {
    /**
     * 享元模式
     * 运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用
     *
     * 优点：
     * 享元模式的优点在于它可以极大减少内存中对象的数量，使得相同对象或相似对象在内存中只保存一份。
     * 享元模式的外部状态相对独立，而且不会影响其内部状态，从而使得享元对象可以在不同的环境中被共享。
     *
     * 缺点：
     * 享元模式使得系统更加复杂，需要分离出内部状态和外部状态，这使得程序的逻辑复杂化。
     * 为了使对象可以共享，享元模式需要将享元对象的状态外部化，而读取外部状态使得运行时间变长。
     *
     */
    public static void main(String[] args) {
        FactoryFlyWeight factory = new FactoryFlyWeight();
        FlyWeight one = factory.getFlyWight("one");
        FlyWeight two = factory.getFlyWight("two");
        FlyWeight one1 = factory.getFlyWight("one");
        System.out.println(one);
        System.out.println(two);
        System.out.println(one1);
    }
}
