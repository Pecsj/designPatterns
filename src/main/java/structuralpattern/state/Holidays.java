package structuralpattern.state;

public class Holidays implements State{
    @Override
    public void play() {
        System.out.println("放假了，睡个毛线起来嗨！");
    }

    @Override
    public void fixBug() {
        System.out.println("我是拒绝的");
    }
}
