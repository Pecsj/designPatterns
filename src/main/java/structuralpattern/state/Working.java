package structuralpattern.state;

public class Working implements State {
    @Override
    public void play() {
        System.out.println("想办法干他娘的一炮");
    }

    @Override
    public void fixBug() {
        System.out.println("加班改bug中....");
    }
}
