package creationalpattern.prototype;

public class CloneStuUtil {
    public static Student clone(Student copy){
        Student stu = new Student();
        stu.name = copy.name;
        stu.age = copy.age;
        return stu;
    }

}
