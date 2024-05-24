package script3;

public class Piano implements IInstrument, IKeyboardInstrument {

    @Override
    public void play() {
        System.out.println("Piyano çalıyor");
    }

    @Override
    public void press() {
        System.out.println("Tuşlu piyano");
    }

}
