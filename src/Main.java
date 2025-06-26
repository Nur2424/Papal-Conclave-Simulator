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
        scanner.nextLine(); // consume newline after number

        // Ask user to enter names of cardinals
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the name of Cardinal #" + i + ": ");
            String name = scanner.nextLine();

            // Generate random age and influence score
            int age = 65 + random.nextInt(10);       // age between 65–74
            int influence = 5 + random.nextInt(5);   // influence between 5–9

            // Create and add new cardinal
            cardinals.add(new Cardinal(name, age, influence, true));
        }

        // Start the election
        ConclaveRoom conclave = new ConclaveRoom(cardinals);
        conclave.runElection();
    }
}
