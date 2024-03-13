
public class Woodwind extends Wind {
    private String name;

    public Woodwind(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing Woodwind instrument: " + what());
    }

    @Override
    public String what() {
        return name;
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Woodwind instrument.");
    }
}


