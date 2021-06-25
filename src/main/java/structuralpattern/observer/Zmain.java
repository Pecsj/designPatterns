package structuralpattern.observer;

public class Zmain {
    public static void main(String[] args) {
        /**
         * 观察者模式【发布-订阅模式】：
         * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
         *
         * 与中介模式的不同点：
         * 观察者模式：只能从从一的一方循环的通知，属于单向。（好比上课，只能老实授课给班上所有的学生，反过来不行）
         * 中介者模式：可以从任一方循环通知，属于双向。（好比分享会，每个人都可以分享自己的事情给别人）
         *
         * 优点：
         * 观察者模式可以实现表示层和数据逻辑层的分离，并定义了稳定的消息更新传递机制，抽象了更新接口，使得可以有各种各样不同的表示层作为具体观察者角色。
         * 观察者模式在观察目标和观察者之间建立一个抽象的耦合。
         * 观察者模式支持广播通信。
         * 观察者模式符合“开闭原则”的要求。
         *
         * 缺点：
         * 如果一个观察目标对象有很多直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。
         * 如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
         * 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
         *
         *
         */
        //订阅者
        Order1 order1 = new Order1();
        Order2 order2 = new Order2();
        //发布者
        Store store = new Store();
        //订阅
        order1.order(store);
        order2.order(store);
        //发布商品，订阅者会收到通知
        store.publish("黑人牙膏");
    }
}