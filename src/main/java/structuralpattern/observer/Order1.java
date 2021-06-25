package structuralpattern.observer;

public class Order1 extends ProductObserver {
    @Override
    public void notice(String product) {
        System.out.println("订阅者一收到了商品:"+product);
    }
}
