package creationalpattern.builder;

public class ProductA implements ProductUsb {
    private String str = "";

    public void setA(String a) {
        this.str += a;
    }

    public void setB(String b) {
        this.str += b;
    }

    public void setC(String c) {
        this.str += c;
    }

    @Override
    public void show() {
        System.out.println("A汽车跑起来("+str+")");
    }
}
