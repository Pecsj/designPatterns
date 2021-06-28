package structuralpattern.strategy;

public class DiscountMax implements Discount {
    @Override
    public double countPrice(double price) {
        return price * 0.8;
    }
}
