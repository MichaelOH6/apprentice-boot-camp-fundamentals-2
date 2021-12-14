package bowling;

import org.junit.Ignore;
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
    public void gameWithNoSparesOrStrikes(){
        //arrange
        BowlingGame oneGame = new BowlingGame(new int[] {1,1, 1,1, 1,1, 1,1, 1,1,
                1,1, 1,1, 1,1, 1,1, 1,1});

        //act
        int score = oneGame.getScore();
        //assert
        assertThat(score).isEqualTo(20);
    }
    @Test
    public void gameWithASingleSpare(){
        BowlingGame zeroGame = new BowlingGame(new int[] {5,5, 1,0, 0,0, 0,0, 0,0,
                0,0, 0,0, 0,0, 0,0, 0,0});

        //act
        int score = zeroGame.getScore();
        assertThat(score).isEqualTo(12);
    }
    @Test
    public void NotATest(){
        BowlingGame zeroGame = new BowlingGame(new int[] {0,5, 5,1, 0,0, 0,0, 0,0,
                0,0, 0,0, 0,0, 0,0, 0,0});

        //act
        int score = zeroGame.getScore();

        assertThat(score).isEqualTo(11);

    }
    @Test

    public void strike(){
        BowlingGame zeroGame = new BowlingGame(new int[] {10, 1,1, 0,0, 0,0, 0,0,
                0,0, 0,0, 0,0, 0,0, 0,0});

        //act
        int score = zeroGame.getScore();

        assertThat(score).isEqualTo(14);

    }
    @Test

    public void spareLastFrame(){
        BowlingGame zeroGame = new BowlingGame(new int[] {5,5 ,5,5, 5,5, 5,5, 5,5,
                5,5, 5,5, 5,5, 5,5, 5,5, 5});

        //act
        int score = zeroGame.getScore();

        assertThat(score).isEqualTo(150);

    }
    @Test
    public void strikes(){
        BowlingGame zeroGame = new BowlingGame(new int[] {10, 10, 10, 10, 10,
                10, 10, 10, 10, 10, 10, 10});

        //act
        int score = zeroGame.getScore();

        assertThat(score).isEqualTo(300);
    }
    @Test
    public void nineZero(){
        BowlingGame zeroGame = new BowlingGame(new int[] {9,0, 9,0, 9,0, 9,0, 9,0,
                9,0, 9,0, 9,0, 9,0, 9,0, 9,0, 9,0});

        //act
        int score = zeroGame.getScore();

        assertThat(score).isEqualTo(90);

    }


}
