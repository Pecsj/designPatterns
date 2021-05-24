package behavioralpattern.decorator;

public class ArmDecorator extends Decorator {
    public ArmDecorator(Transport transport) {
        super(transport);
    }

    @Override
    public void start() {
        System.out.println("枪在手，跟我走");
        transport.start();
    }
}
