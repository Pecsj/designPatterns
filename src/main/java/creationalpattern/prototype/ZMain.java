package creationalpattern.prototype;

public class ZMain {
    public static void main(String[] args) {
        Student a = new Student("csj",20);
        Student b = CloneStuUtil.clone(a);
    }
}
