package bowling;

import java.util.ArrayList;

public class BowlingGame {


    int score = 0;

    public BowlingGame(int[] rolls) {
        int firstRollIndex = 0;
        for (int frameIndex = 0; frameIndex < 10; frameIndex++) {

            final int firstRoll = rolls[firstRollIndex];
            boolean isStrike = firstRoll == 10;
            if (isStrike) {
                score += firstRoll + rolls[firstRollIndex + 1] + rolls[firstRollIndex + 2];
                firstRollIndex++;
            } else {
                int secondRollIndex = firstRollIndex + 1;
                score += rolls[firstRollIndex] + rolls[secondRollIndex];
                boolean isSpare = rolls[firstRollIndex] + rolls[secondRollIndex] == 10;
                if (isSpare) {
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
