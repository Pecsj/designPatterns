package creationalpattern.factorymethod;

public class FactoryA extends FactoryConstract {

    {
        System.out.println("A工厂建立");
    }

    @Override
    public ProductAbstract getProdect() {
        System.out.println("A工厂生产A产品");
        return new ProductA();
    }
}
