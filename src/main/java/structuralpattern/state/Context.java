package structuralpattern.state;

public class Context {
    private State state1 = new Holidays();
    private State state2 = new Working();
    private State nowState = state1;

    public void changeState(){
        if (nowState == state1){
            nowState = state2;
        }else{
            nowState = state1;
        }
    }

    public void showState(){
        System.out.print(nowState == state1 ? "放假状态：" : "工作状态：");
    }

    public void play(){
        showState();
        nowState.play();
    }

    public void work(){
        showState();
        nowState.fixBug();
    }

}
