package _03objects;

import java.sql.SQLOutput;

public class VotingMachine {
    private int dVotes;
    private int rVotes;

    public VotingMachine() {
        dVotes = 0;
        rVotes = 0;
    }

    public void voteForRepublicans() {
        rVotes++;
    }

    public void voteForDemocrats() {
        dVotes++;
    }


    public int getRepublicanVotes() {
        return rVotes;
    }

    public int getDemocratVotes() {
        return dVotes;
    }

    public void printResults() {
        System.out.println("Democrats won " + dVotes + " votes!");
        System.out.println("Republicans won " + rVotes + " votes!");
        if (dVotes > rVotes) {
            System.out.println("Democrats Win!");
        } else if (rVotes > dVotes) {
            System.out.println("Republicans Win!");
        } else {
            System.out.println("TIE!?");
        }
    }

    public void clear() {
        dVotes = 0;
        rVotes = 0;
    }

}
