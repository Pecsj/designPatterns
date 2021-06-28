package structuralpattern.strategy;

public class Zmain {
    /**
     * 策略模式[政策模式]：
     * 定义一系列算法，将每一个算法封装起来，并让它们可以相互替换。策略模式让算法独立于使用它的客户而变化，也称为政策模式(Policy)。
     *
     * 优点：
     * 策略模式提供了对“开闭原则”的完美支持，用户可以在不修改原有系统的基础上选择算法或行为，也可以灵活地增加新的算法或行为。
     * 策略模式提供了管理相关的算法族的办法。
     * 策略模式提供了可以替换继承关系的办法。
     * 使用策略模式可以避免使用多重条件转移语句。
     *
     * 缺点：
     * 客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
     * 策略模式将造成产生很多策略类，可以通过使用享元模式在一定程度上减少对象的数量。
     *
     */
    public static void main(String[] args) {
        DiscountLittle discountLittle = new DiscountLittle();
        DiscountMax discountMax = new DiscountMax();
        Shop shop = new Shop();
        shop.setDiscountStrategy(discountLittle);
        //使用低优惠策略
        shop.sell(10.00);
        //使用高优惠策略
        shop.setDiscountStrategy(discountMax);
        shop.sell(10.00);
    }
}
