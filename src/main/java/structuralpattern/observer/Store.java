package structuralpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<ProductObserver> orders = new ArrayList<>();

    public void publish(String product){
        orders.forEach(item -> {
            item.notice(product);
        });
    }

    public void order(ProductObserver order){
        orders.add(order);
    }

}
