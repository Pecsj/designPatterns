package creationalpattern.builder;

public class ZMain {
    public static void main(String[] args) {
        /**
         * 建造者模式
         * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
         *
         * 优点：
         * 在建造者模式中， 客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象。
         * 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者， 用户使用不同的具体建造者即可得到不同的产品对象 。
         * 可以更加精细地控制产品的创建过程 。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程。
         * 增加新的具体建造者无须修改原有类库的代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合“开闭原则”。
         *
         * 缺点：
         * 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，则不适合使用建造者模式，因此其使用范围受到一定的限制。
         * 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大。
         *
         * 适用场景：
         * 需要生成的产品对象有复杂的内部结构，这些产品对象通常包含多个成员属性。
         * 需要生成的产品对象的属性相互依赖，需要指定其生成顺序。
         * 对象的创建过程独立于创建该对象的类。在建造者模式中引入了指挥者类，将创建过程封装在指挥者类中，而不在建造者类中。
         * 隔离复杂对象的创建和使用，并使得相同的创建过程可以创建不同的产品。
         *
         */

        //指挥者构建
        BuilderUsb builder = new BuilderA();
        Direct direct = new Direct();
        direct.setBuilder(builder);
        ProductUsb product = direct.getProduct();
        product.show();

        //手动构建
//        BuilderUsb builder = new BuilderB();
//        builder.buildB();
//        builder.buildA();
//        builder.buildB();
//        builder.buildC();
//        ProductUsb product = builder.getProduct();
//        product.show();
    }
}
