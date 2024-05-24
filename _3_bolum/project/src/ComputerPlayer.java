import java.util.Random;

public class ComputerPlayer extends Player{
    
    @Override
    protected void chooseMove() {
        Random random = new Random();
        int listeIndexBul = random.nextInt(2) + 1;

        String[] liste = {"taş","kağıt","makas"};
        this.setMove(liste[listeIndexBul]);
    }

}
