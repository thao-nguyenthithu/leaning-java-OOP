
public class Percussion implements Instrument {
    private String name;

    public Percussion(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Playing Percussion instrument: " + what());
    }

    @Override
    public String what() {
        return name;
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Percussion instrument.");
    }
}


