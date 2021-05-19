package creationalpattern.simplefactory;

public class ZMain {
    public static void main(String[] args) {
        Factory factory = new Factory();
        ProductAbstract product = factory.getProduct("B");
        System.out.println(product.show());
    }
}
