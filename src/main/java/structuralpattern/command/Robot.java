package structuralpattern.command;

public class Robot {
    public void up(int num){
        System.out.println("前进"+num+"格");
    }
    public void down(int num){
        System.out.println("后退"+num+"格");
    }
    public void left(int num){
        System.out.println("向左"+num+"格");
    }
    public void right(int num){
        System.out.println("向右"+num+"格");
    }
}
