import java.util.Scanner;

@SuppressWarnings("unused")
public class HumanPlayer extends Player {

    @Override
    protected void chooseMove() {
        System.out.println("Lütfen bir hamle seçiniz (TAŞ/KAĞIT/MAKAS)");
        Scanner scanner = new Scanner(System.in);
        String hamle = scanner.nextLine();
        System.out.println(hamle);


        scanner.close();
    }

}
