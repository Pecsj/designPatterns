package structuralpattern.mediator;

public class Student {
    private Mediator mediator;

    public void bindMeditor(Mediator mediator){
        this.mediator = mediator;
    }

    public void receiveMsg(String msg){
        System.out.println(this.toString()+msg);
    };
    public void sendMsg(String msg){
        this.mediator.sendMsg(this,msg);
    };
}
