package creationalpattern.builder;

public class BuilderB extends BuilderUsb {

    {
        product = new ProductA();
    }

    @Override
    public void buildA() {
        product.setA("豪华轮子");
    }

    @Override
    public void buildB() {
        product.setB("豪华方向盘");
    }

    @Override
    public void buildC() {
        product.setC("豪华车身");
    }

    @Override
    public ProductUsb getProduct() {
        return product;
    }
}
