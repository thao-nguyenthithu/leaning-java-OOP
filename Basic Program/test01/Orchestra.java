public class Orchestra {

    private List<Instrument> instruments;

    public Orchestra() {
        instruments = new ArrayList<>();
    }

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }


    public void tuneAll() {
        for (Instrument instrument : instruments) {
            if (instrument instanceof Wind) {
                ((Wind) instrument).play(Note.MIDDLE_C);
            } else if (instrument instanceof Percussion) {
                ((Percussion) instrument).adjust("vặn nút");
            } else if (instrument instanceof Stringed) {
                ((Stringed) instrument).adjust(2);
            }
        }
    }

    public void adjustWind() {
        for (Instrument instrument : instruments) {
            if (instrument instanceof Wind) {
                if (instrument instanceof Brass) {
                    ((Brass) instrument).adjust("nút ngậm");
                } else if (instrument instanceof Woodwind) {
                    ((Woodwind) instrument).adjust("nút thổi");
                }
            }
        }
    }

}

