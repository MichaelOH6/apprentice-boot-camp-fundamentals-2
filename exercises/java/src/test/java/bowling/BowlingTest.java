package bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BowlingTest {

    @Test
    public void emptyRoll(){
        //arrange
        BowlingGame zeroGame = new BowlingGame(new int[] {0,0, 0,0, 0,0, 0,0, 0,0,
                                                      0,0, 0,0, 0,0, 0,0, 0,0});

        //act
        int score = zeroGame.getScore();
        //assert
        assertThat(score).isEqualTo(0);
    }
    @Test
    public void fullRoll(){
        //arrange
        BowlingGame zerGame = new BowlingGame(new int[] {1,1, 1,1, 1,1, 1,1, 1,1,
                1,1, 1,1, 1,1, 1,1, 1,1});

        //act
        int score = zerGame.getScore();
        //assert
        assertThat(score).isEqualTo(20);
    }
}
