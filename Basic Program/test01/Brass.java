
public class Brass extends Wind {
    private String name;

    public Brass(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing Brass instrument: " + what());
    }

    @Override
    public String what() {
        return name;
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Brass instrument.");
    }
}


