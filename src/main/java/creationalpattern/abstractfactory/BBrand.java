package creationalpattern.abstractfactory;

public class BBrand implements FactoryUsb {
    @Override
    public HtmlProduct getHtml() {
        System.out.println("B品牌代理生产html产品");
        return new HtmlProduct() {
            @Override
            public void show() {
                System.out.println("使用B品牌的html产品");
            }
        };
    }

    @Override
    public PdfProduct getPdf() {
        System.out.println("B品牌代理生产html产品");
        return new PdfProduct() {
            @Override
            public void show() {
                System.out.println("使用B品牌的pdf产品");
            }
        };
    }
}
