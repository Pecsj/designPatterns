package behavioralpattern.decorator;

public class MyReboot implements Transport{
    @Override
    public void start() {
        System.out.println("我至少还能跑");
    }
}
