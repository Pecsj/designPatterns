package structuralpattern.strategy;

public class DiscountLittle implements Discount{
    @Override
    public double countPrice(double price) {
        return price * 0.95;
    }
}
