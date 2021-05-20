package creationalpattern.factorymethod;

public class FactoryB extends FactoryConstract {

    {
        System.out.println("B工厂建立");
    }

    @Override
    public ProductAbstract getProdect() {
        System.out.println("B工厂生产B产品");
        return new ProductB();
    }
}
