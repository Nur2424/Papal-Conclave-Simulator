import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ConclaveRoom {
    private ArrayList<Cardinal> cardinals;
    private Random rand;

    public ConclaveRoom(ArrayList<Cardinal> cardinals) {
        this.cardinals = cardinals;
        this.rand = new Random();
    }

    public void runElection() {
        boolean popeElected = false;
        int round = 1;

        while (!popeElected) {
            System.out.println("--- Round " + round + " ---");

            // Reset previous votes
            for (Cardinal c : cardinals) {
                c.resetVotes();
            }

            // Each cardinal votes
            for (Cardinal voter : cardinals) {
                Cardinal voteFor;
                do {
                    voteFor = cardinals.get(rand.nextInt(cardinals.size()));
                } while (voteFor == voter); // Can't vote for yourself

                voteFor.receiveVote();
                System.out.println(voter.getName() + " votes for " + voteFor.getName());
            }

            // Check if anyone has majority
            int majority = cardinals.size() / 2 + 1;
            for (Cardinal c : cardinals) {
                if (c.getVotesReceived() >= majority) {
                    System.out.println("🤍 White smoke rises!");
                    System.out.println("🎉 " + c.getName() + " has been elected Pope!");
                    popeElected = true;
                    break;
                }
            }

            if (!popeElected) {
                System.out.println("🚬 Black smoke rises... No pope yet.
");
            }

            round++;
        }
    }
}
