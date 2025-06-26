import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cardinal> cardinals = new ArrayList<>();
        cardinals.add(new Cardinal("Mateo", 70, 8, true));
        cardinals.add(new Cardinal("Giovanni", 68, 6, true));
        cardinals.add(new Cardinal("Luis", 73, 7, true));
        cardinals.add(new Cardinal("Benedetto", 66, 5, true));
        cardinals.add(new Cardinal("Francesco", 71, 9, true));

        ConclaveRoom conclave = new ConclaveRoom(cardinals);
        conclave.runElection();
    }
}
