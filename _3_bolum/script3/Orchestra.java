package script3;

public class Orchestra {
    private IInstrument[] instruments = {new Guitar(), new Piano()};
    public void playAll(){
        for (IInstrument instrument : instruments) {
            instrument.play();
        }
    }
}
