package structuralpattern.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    private List<Animal> animals = new LinkedList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void action(Person person){
        animals.forEach(item -> {
            item.accept(person);
        });
    }

}
