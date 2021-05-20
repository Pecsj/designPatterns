package creationalpattern.abstractfactory;

public class ABrand implements FactoryUsb {
    @Override
    public HtmlProduct getHtml() {
        System.out.println("A品牌代理生产html产品");
        return new HtmlProduct() {
            @Override
            public void show() {
                System.out.println("使用A品牌的html产品");
            }
        };
    }

    @Override
    public PdfProduct getPdf() {
        System.out.println("A品牌代理生产pdf产品");
        return new PdfProduct() {
            @Override
            public void show() {
                System.out.println("使用A品牌的pdf产品");
            }
        };
    }
}
