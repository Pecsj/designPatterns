package behavioralpattern.decorator;

public class FlyDecorator extends Decorator{
    public FlyDecorator(Transport transport) {
        super(transport);
    }

    public void start(){
        System.out.println("芜湖，起飞");
        transport.start();
    }
}
