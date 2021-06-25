package structuralpattern.observer;

public class Order2 extends ProductObserver {
    @Override
    public void notice(String product) {
        System.out.println("订阅者二收到了商品:"+product);
    }
}
