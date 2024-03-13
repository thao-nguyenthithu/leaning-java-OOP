
public class Stringed implements Instrument {
    private String name;

    public Stringed(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing Stringed instrument: " + what());
    }

    @Override
    public String what() {
        return name;
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Stringed instrument.");
    }
}
