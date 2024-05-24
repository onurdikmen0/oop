public class App {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        ComputerPlayer computerPlayer = new ComputerPlayer();
        HumanPlayer humanPlayer = new HumanPlayer();
        humanPlayer.chooseMove();
    }
}
