package structuralpattern.mediator;

public interface Mediator {
    void register(Student student);
    void sendMsg(Student student,String msg);
}
