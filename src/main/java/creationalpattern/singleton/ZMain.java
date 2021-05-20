package creationalpattern.singleton;

public class ZMain {

    public static void main(String[] args) {
        // 单列模式-懒汉模式
        SingleClass singleClass1 = SingleClass.getSingleClass();
        SingleClass singleClass2 = SingleClass.getSingleClass();
        System.out.println(singleClass1);
        System.out.println(singleClass2);
    }

}
