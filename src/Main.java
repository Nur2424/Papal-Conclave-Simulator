import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cardinal> cardinals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("✝️ Welcome to the Papal Conclave Simulation!");
        System.out.print("How many cardinals will participate? (e.g., 5–20): ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the name of Cardinal #" + i + ": ");
            String name = scanner.nextLine();

            
            int age = 65 + random.nextInt(10);       
            int influence = 5 + random.nextInt(5);   

            cardinals.add(new Cardinal(name, age, influence, true));
        }

        ConclaveRoom conclave = new ConclaveRoom(cardinals);
        conclave.runElection();
    }
}
