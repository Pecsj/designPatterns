package behavioralpattern.bridge;

public class BMWCar extends Car {
    @Override
    void drive(Engine engine) {
        System.out.println("宝马使用"+engine.start()+"跑起来了");
    }
}
