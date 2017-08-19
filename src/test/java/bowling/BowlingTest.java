package bowling;

import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingTest {

	@Test
	public void shouldReturnBowlingScore (){
		BowlingGame bowlingGame = new BowlingGame();
		assertEquals(0, bowlingGame.score());
	}
}
