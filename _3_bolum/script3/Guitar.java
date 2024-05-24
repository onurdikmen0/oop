package script3;

public class Guitar implements IInstrument, IElectronicInstrument{

    @Override
    public void play() {
        System.out.println("Gitar çalıyor");
    }

    @Override
    public void tune() {
        System.out.println("Elektronik gitar");
    }

}
