package bowling;

public class BowlingGame {
    int score = 0;
    public BowlingGame(int[] rolls) {
        for(int i = 0; i < rolls.length;i++){
            score += rolls[i];
        }


    }

    public int getScore() {
        return score;
    }
}
