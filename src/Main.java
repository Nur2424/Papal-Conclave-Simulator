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

/*
  
🗣️ How to explain your Main class step by step:

⸻

🔹 1. Introduction — What does this program do?

This program simulates a papal conclave, where cardinals vote to elect a new Pope. The Main class acts like the organizer of the election. It asks the user for input, creates cardinal objects, and starts the voting process by using other classes like Cardinal and ConclaveRoom.

⸻

🔹 2. User input and cardinal creation

At the beginning, I ask the user how many cardinals will participate — they can choose between 5 and 20. Then, using a for loop, I let the user enter the name of each cardinal.

I also assign each cardinal a random Italian city, a random age between 65 and 74, and a random influence score between 5 and 9 to make the simulation more realistic.

Each cardinal is created using the Cardinal class and stored in an ArrayList. This list is used later during voting.

⸻

🔹 3. Why I use Random and Scanner

I use the Random class to:
	•	Pick a city randomly from an array of Italian cities
	•	Generate age and influence randomly for variety

I use Scanner to:
	•	Read the number of cardinals
	•	Read each cardinal’s name from the user

⸻

🔹 4. Starting the election

After creating the cardinals, I pass them into a ConclaveRoom object. That object handles the voting process. I call its runElection() method to begin the election.

⸻

🔹 5. Real-life comparison

You can think of this Main class like the registration desk at an event. It collects all the participants’ information and then sends them into the voting room.

The real voting happens in another class (ConclaveRoom), which keeps the code organized and separated into smaller pieces, following the OOP principle of modularity.

⸻

🎓 Summary (how to conclude)

So in short, the Main class sets up the simulation. It builds the list of cardinals with names and data, then hands it to the election room to run the conclave. It’s the first class that runs when the program starts, and it plays the role of initializing and starting everything.

*/
