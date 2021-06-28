package structuralpattern.visitor;

public class PersonTwo implements Person {
    @Override
    public void feed(Animal animal) {
        if(animal instanceof Dog){
            System.out.println("访问者二    喂了狗狗");
        }
        if(animal instanceof Cat){
            System.out.println("访问者二    喂了咪咪");
        }
    }
}
