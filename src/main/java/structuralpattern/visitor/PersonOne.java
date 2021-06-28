package structuralpattern.visitor;

public class PersonOne implements Person {
    @Override
    public void feed(Animal animal) {
        if(animal instanceof Dog){
            System.out.println("访问者一    喂了狗狗");
        }
        if(animal instanceof Cat){
            System.out.println("访问者一    喂了咪咪");
        }
    }
}
