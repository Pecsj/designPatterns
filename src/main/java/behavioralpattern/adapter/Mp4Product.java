package behavioralpattern.adapter;

public class Mp4Product implements ProductUsb {
    @Override
    public String play() {
        return "mp4";
    }
}
