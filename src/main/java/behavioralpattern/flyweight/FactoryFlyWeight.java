package behavioralpattern.flyweight;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FactoryFlyWeight {
    private List<FlyWeight> cache;

    {
        cache = new LinkedList<FlyWeight>();
    }

    FlyWeight getFlyWight(String id){
        Iterator<FlyWeight> iterator = cache.iterator();
        FlyWeight flyWeight = null;
        while (iterator.hasNext()){
            flyWeight = iterator.next();
            if(flyWeight.getId().equals(id)){
                return flyWeight;
            }
        }
        flyWeight = new ConcreateFlyWeight(id);
        cache.add(flyWeight);
        return flyWeight;
    }

}
