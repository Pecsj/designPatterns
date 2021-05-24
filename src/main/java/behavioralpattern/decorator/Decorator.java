package behavioralpattern.decorator;

public abstract class Decorator implements Transport{
    public Transport transport;

    public Decorator(Transport transport){
        this.transport = transport;
    }

    @Override
    public void start() {
        transport.start();
    }
}
