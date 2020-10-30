package com.yacine.amouche.kata.tennis;

import com.yacine.amouche.kata.tennis.play.Game;
import com.yacine.amouche.kata.tennis.play.Player;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String[]args) throws Exception {

		Player player1 = new Player("palyer1");
		Player player2 = new Player("palyer2");
		String s="";
//		do{
//			//for (int i = 0; i<9; i++){
//				Random r = new Random();
//				int x = r.nextInt((100 - 0) + 1);
//				s = Game.onGame(player1, player2, x);
//				System.out.println("ssssss " + s);
//			//}
//
//		}while (!s.equals("The winner is "+ player1.getName())&&!s.equals("The winner is "+ player2.getName()));
		System.out.println(s);
	}
}
