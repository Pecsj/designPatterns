package structuralpattern.mediator;

import java.util.HashSet;
import java.util.LinkedList;

public class MediatorIml implements Mediator{
    private HashSet<Student> students = new HashSet<>();

    @Override
    public void register(Student student) {
        student.bindMeditor(this);
        students.add(student);
    }

    @Override
    public void sendMsg(Student student,String msg) {
        for(Student stu : students){
            if(stu != student){
                stu.receiveMsg(msg);
            }
        }
    }
}
