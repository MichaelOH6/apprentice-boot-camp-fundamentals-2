package bowling;

public class BowlingGame {
    int score = 0;
    public BowlingGame(int[] rolls) {

        for(int frameIndex=0; frameIndex<10;frameIndex++){
            int firstRollIndex = frameIndex*2;
            int secondRollIndex = frameIndex *2+1;
            score += rolls[firstRollIndex] + rolls[secondRollIndex];
        }

    }

    public int getScore() {
        return score;
    }
}
