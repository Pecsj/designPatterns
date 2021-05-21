package behavioralpattern.adapter;

public class AdapterIml extends Adapter {

    private ProductUsb product;

    AdapterIml(ProductUsb product){
        this.product = product;
    }

    @Override
    String play() {
        String play = product.play();
        return "鬼畜版"+play;//此行满足客户端要求对旧接口进行适配
    }
}
