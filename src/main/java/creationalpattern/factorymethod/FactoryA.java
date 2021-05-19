package creationalpattern.factorymethod;

public class FactoryA extends FactoryConstract {

    @Override
    public ProductAbstract getProdect() {
        return new ProductA();
    }
}
