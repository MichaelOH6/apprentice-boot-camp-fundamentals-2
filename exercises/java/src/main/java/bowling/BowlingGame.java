package bowling;
import java.util.ArrayList;

public class BowlingGame {


    int score = 0;
    public BowlingGame(int[] rolls) {
            boolean strike = false;

        int firstRollIndex = 0;
        for (int frameIndex=0; frameIndex<10; frameIndex++) {

                int firstRoll = rolls[firstRollIndex];
                if (firstRoll == 10) {
                    score += firstRoll += rolls[firstRollIndex + 1] + rolls[firstRollIndex + 2];
                    firstRollIndex++;
                } else {
                    int secondRollIndex = firstRollIndex + 1;
                    score += rolls[firstRollIndex] + rolls[secondRollIndex];
                    if (rolls[firstRollIndex] + rolls[secondRollIndex] == 10) {
                        score += rolls[secondRollIndex + 1];
                    }
                    firstRollIndex += 2;
                }
            }
        }


    public int getScore() {
        return score;
    }
}
