package com.yacine.amouche.kata.tennis;

import com.yacine.amouche.kata.tennis.play.Game;
import com.yacine.amouche.kata.tennis.play.Player;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	Player player1 = new Player("player1");
	Player player2 = new Player("player2");
	Game game = new Game();
	@Before
	public void setup(){

	}
	@Test
	void contextLoads() {
	}
	@Test
	public void testGameReturnLoveAll(){
		String score = player1.descriptionScore() + " "+ player2.descriptionScore();
		assertEquals("Love Love", score);
	}
	@Test
	public void testGameReturnPlayer1Fifteen(){
		String score = game.onGame(player1, player2, 10);
		assertEquals("player1 : Fifteen\n" +
				"player2 : Love", score);
	}
	@Test
	public void testGameReturnPlayer2Fifteen(){
		String score = game.onGame(player1, player2, 60);
		assertEquals("player1 : Love\n" +
				"player2 : Fifteen", score);
	}
	@Test
	public void testGameReturnFifteenAll(){
		String score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 10);
		assertEquals("Fifteen  All", score);
	}

	@Test
	public void testGameReturnDeuce(){
		String score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		assertEquals("Deuce", score);
	}

	@Test
	public void testGameReturnPlayer1Advantage(){
		String score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		assertEquals("advantage player1", score);
	}

	@Test
	public void testGameReturnPlayer2Advantage(){
		String score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		assertEquals("advantage player2", score);
	}

	@Test
	public void testGameReturnPlayer1Winner(){
		String score = game.onGame(player1, player2, 60);
		//score = game.onGame(player1, player2, 60);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		score = game.onGame(player1, player2, 10);
		assertEquals("The winner is player1", score);
	}


}
