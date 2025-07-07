public class Cardinal {
    private String name;
    private int age;
    private int influence;
    private int votesReceived;
    private boolean isCandidate;

    public Cardinal(String name, int age, int influence, boolean isCandidate) {
        this.name = name;
        this.age = age;
        this.influence = influence;
        this.isCandidate = isCandidate;
        this.votesReceived = 0;    // Starts votesReceived at 0 (since voting hasn’t started yet)
    }        // Cardinal c = new Cardinal("John", 76, 85, true);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getInfluence() {
        return influence;
    }

    public int getVotesReceived() {
        return votesReceived;
    }

    public boolean isCandidate() {
        return isCandidate;
    }

    public void receiveVote() {
        this.votesReceived++;
    }

    public void resetVotes() {
        this.votesReceived = 0;
    }    // These methods allow other classes to read the cardinal’s information safely (since the variables are private).

    @Override
    public String toString() {
        return "Cardinal " + name + " (Age: " + age + ", Influence: " + influence + ")";
    }    // “I used @Override to change the built-in toString() method, so when I print a Cardinal, 
}      //it shows the name, age, and influence instead of a confusing code. It makes the output clear and easy to understand}
