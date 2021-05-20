package creationalpattern.builder;

public class BuilderA extends BuilderUsb {
    {
        product = new ProductA();
    }

    @Override
    public void buildA() {
        product.setA("轮子");
    }

    @Override
    public void buildB() {
        product.setB("方向盘");
    }

    @Override
    public void buildC() {
        product.setC("车身");
    }

    @Override
    public ProductUsb getProduct() {
        return product;
    }
}
