/**
 * Representing games between two imaginary players of two scenarios
 * Counting how many rolls it will take to get a desired number from either a dice roll or a weighted dice roll
 *
 * @author Haoye
 * @version 1573514106
 */

public class Game {
    Die d = new Die();
    WeightedDie wd = new WeightedDie();

    /**
     * no parameter method to to call to the method that generate a score for two imaginary players and compares their score and states who wins
     */
    public void playGame() {
        int p1 = rollTwoDice();
        int p2 = rollTwoDice();

        System.out.println("Player 1's score is " + p1);
        System.out.println("Player 2's score is " + p2);

        if (p1 == p2) {
            System.out.println("It's a tie!");
        } else if (p1 > p2) {
            System.out.println("Player 1 has won!");
        } else {
            System.out.println("Player 2 has won!");
        }
    }

    /**
     * no parameter method to call to the method that generate a score for two imaginary players and compares their score,
     * however, if the score of player 2 is higher than player 1, the method will rerun until player 1 has a higher score
     * score of each player is not printed to keep the truth away from player 2
     */
    public void playUnfairGame() {
        int p1 = rollTwoDice();
        int p2 = rollTwoDice();

        if (p1 == p2) {
            System.out.println("It's a tie!");
        } else if (p1 > p2) {
            System.out.println("Player 1 has won!");
        } else {
            playUnfairGame();
        }
    }

    /**
     * no parameter method to actually generate a score, made up of the sum of two dice rolls
     * @return the score, or the sum of two dice rolls
     */
    private int rollTwoDice() {
        d.roll();
        int a = d.getValue();

        d.roll();
        int b = d.getValue();

        return a+b;
    }

    /**
     * a method taking a parameter then roll and count how many rolls it took to get to the input desired number
     * @param desiredNum is the desired number from the rolls
     * @return how many rolls it took to get the desired number
     */
    public int counter(int desiredNum) {
        if (desiredNum < 1 || desiredNum > 6) return 0;

        int i = 0;
        do {
            d.roll();
            i++;
        } while(desiredNum != d.getValue());

        System.out.println(i);
        return i;
    }

    /**
     * a method taking a parameter then roll the weighted dice and count how many rolls it took to get to the input desired number
     * @param desiredNum is the desired number from the rolls
     * @return how many rolls it took to get the desired number
     */
    public int weightedCounter(int desiredNum) {
        if (desiredNum < 1 || desiredNum > 6) return 0;

        int i = 0;
        do {
            wd.roll();
            i++;
        } while(desiredNum != wd.getValue());

        System.out.println(i);
        return i;
    }

    /**
     * no parameter method to check the ratio of even to odd from the weighted dice rolls
     */
    /*
    public void weightTester() {
        int count=0;
        int result =0;

        for (int i=0;i<99999999;i++) {
            wd.roll();
            result = wd.getValue();
            if (result % 2 == 0) count++;
        }
        System.out.println("out of 99999999 pick, even appear " + count + " times");
        System.out.println("expected/optimal value is 66666666");

        for (int i=0;i<999;i++) {
            wd.roll();
            result = wd.getValue();
            if (result % 2 == 0) count++;
        }
        System.out.println("out of 999 pick, even appear " + count + " times");
        System.out.println("expected/optimal value is 666");
    }
    */
}
