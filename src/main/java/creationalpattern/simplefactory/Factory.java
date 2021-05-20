package creationalpattern.simplefactory;

/**
 * @Author csj
 * @Description: 简单工厂工厂类
 * @Date 2021/5/19
 */
public class Factory {

    public ProductAbstract getProduct(String type){
        switch (type){
            case "A":
                System.out.println("简单工厂生产了A产品");return new ProductA();
            case "B":
                System.out.println("简单共产生产了B产品");return new ProductB();
            default:return null;
        }
    }

}
