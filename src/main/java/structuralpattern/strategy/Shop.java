package structuralpattern.strategy;

public class Shop {

    private Discount discountStrategy = null;

    public void setDiscountStrategy(Discount discount){
        this.discountStrategy = discount;
    }

    public void sell(double price){
        double nowPrice = discountStrategy.countPrice(price);
        System.out.println("经过优惠实际花费了$"+nowPrice);
    }

}
