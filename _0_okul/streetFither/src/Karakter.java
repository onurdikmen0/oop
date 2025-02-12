import java.util.Random;

public class Karakter extends AKarakter implements ISaldiri {

    public Karakter(String isim, String hikaye, int can) {
        super(isim, hikaye, can);
    }
    
    
    Random random = new Random();
    private int hasar = random.nextInt(21);
    private int ekHasar = random.nextInt(11);

    public int getEkHasar() {
        return ekHasar;
    }

    public void setEkHasar(int ekHasar) {
        this.ekHasar = ekHasar;
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    @Override
    public int tekme() {
        return getHasar() + getEkHasar();
    }

    @Override
    public int yumruk() {
        return getHasar() + getEkHasar();
    }

    
}
