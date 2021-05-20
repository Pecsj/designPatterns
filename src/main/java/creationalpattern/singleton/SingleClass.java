package creationalpattern.singleton;

public class SingleClass {
    private static SingleClass singleClass;

    private SingleClass (){
        System.out.println("单例创建");
    }

    public static SingleClass getSingleClass(){
        if(singleClass == null){
            singleClass = new SingleClass();
        }
        return singleClass;
    }

}
