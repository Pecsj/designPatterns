package behavioralpattern.bridge;

public class BenzCar extends Car {
    @Override
    void drive(Engine engine) {
        System.out.println("奔驰使用"+engine.start()+"跑起来了");
    }
}
