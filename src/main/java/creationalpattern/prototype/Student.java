package creationalpattern.prototype;

public class Student implements Cloneable{
    public String name;
    public int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(){};
}
