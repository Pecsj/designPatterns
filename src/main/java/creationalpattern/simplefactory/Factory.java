package creationalpattern.simplefactory;

/**
 * @Author csj
 * @Description: 简单工厂工厂类
 * @Date 2021/5/19
 */
public class Factory {

    public ProductAbstract getProduct(String type){
        switch (type){
            case "A":return new ProductA();
            case "B":return new ProductB();
            default:return null;
        }
    }

}
