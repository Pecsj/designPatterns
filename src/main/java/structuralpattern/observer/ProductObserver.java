package structuralpattern.observer;

//实现改接口就相当于订阅了商品
public abstract class ProductObserver {
    public void notice(String product){};
    public void order(Store store){
        store.order(this);
    };
}
