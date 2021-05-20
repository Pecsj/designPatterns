package creationalpattern.builder;

public abstract class BuilderUsb {
    public ProductUsb product;

    public abstract void buildA();
    public abstract void buildB();
    public abstract void buildC();
    public abstract ProductUsb getProduct();

}
