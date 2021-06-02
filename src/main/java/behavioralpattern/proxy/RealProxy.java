package behavioralpattern.proxy;

public class RealProxy implements Image {
    private Image image;

    RealProxy(Image image){
        this.image = image;
    }

    @Override
    public void show() {
        System.out.println("加上上边框");
        image.show();
        System.out.println("加上下边框");
    }
}
