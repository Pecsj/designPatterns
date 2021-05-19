package creationalpattern.factorymethod;

public class FactoryB extends FactoryConstract {

    @Override
    public ProductAbstract getProdect() {
        return new ProductB();
    }
}
