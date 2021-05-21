package behavioralpattern.bridge;

public class AEngine implements Engine {
    @Override
    public String start() {
        return "A发动机";
    }
}
