package _03objects;
import java.util.*;

public class P8_8 {
    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine();
        Random rand = new Random();
        int lol = rand.nextInt(1000);
        for (int i = 0; i < lol; i++) {
            votingMachine.voteForDemocrats();
        }

        int lol2 = rand.nextInt(1000);
        for (int i = 0; i < lol2; i++) {
            votingMachine.voteForRepublicans();
        }

        votingMachine.printResults();
    }
}
