package script3;

public class Main {
    public static void main(String[] args) {
        IInstrument guitar = new Guitar();
        guitar.play();

        IInstrument piano = new Piano();
        piano.play();

        IElectronicInstrument eguitar = new Guitar();
        eguitar.tune();

        IKeyboardInstrument kpianon = new Piano();
        kpianon.press();

        Orchestra orchestra = new Orchestra();
        orchestra.playAll();
    }
}
