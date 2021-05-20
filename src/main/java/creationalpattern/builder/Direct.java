package creationalpattern.builder;

public class Direct {
    private BuilderUsb builder;

    public void setBuilder(BuilderUsb builder){
        this.builder = builder;
    }

    public ProductUsb getProduct(){
        System.out.println("指挥者指挥自动构建");
        builder.buildA();
        builder.buildC();
        builder.buildB();
        return builder.getProduct();
    }

}
