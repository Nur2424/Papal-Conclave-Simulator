import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cardinal> cardinals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] cities = {
            "Rome", "Milan", "Naples", "Florence", "Venice",
            "Turin", "Bologna", "Genoa", "Verona", "Palermo",
            "Bari", "Catania", "Padua", "Trieste", "Parma",
            "Modena", "Reggio Calabria", "Perugia", "Ravenna", "Lecce"
        };

        System.out.println("✝️ Welcome to the Papal Conclave Simulation!");
        System.out.print("How many cardinals will participate? (5–20): ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the name of Cardinal #" + i + ": ");
            String name = scanner.nextLine();
            String city = cities[random.nextInt(cities.length)];
            String fullName = "Cardinal " + name + " of " + city;

            int age = 65 + random.nextInt(10);        
            int influence = 5 + random.nextInt(5);    

            cardinals.add(new Cardinal(fullName, age, influence, true));

            System.out.println("🪶 " + fullName + " created | Age: " + age + ", Influence: " + influence);
        }

        // Start the election
        ConclaveRoom conclave = new ConclaveRoom(cardinals);
        conclave.runElection();
    }
}
