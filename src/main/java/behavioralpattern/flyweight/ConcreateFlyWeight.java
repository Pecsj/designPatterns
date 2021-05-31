package behavioralpattern.flyweight;

public class ConcreateFlyWeight implements  FlyWeight{
    public String id;

    ConcreateFlyWeight(String id){
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void show() {
        System.out.println(id);
    }
}
