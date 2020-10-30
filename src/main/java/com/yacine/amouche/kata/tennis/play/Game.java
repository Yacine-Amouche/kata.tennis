package com.yacine.amouche.kata.tennis.play;

import java.util.Random;

public class Game {

    public static String onGame(Player player1, Player player2, int x){
        boolean b = player1.hasWinner() || player2.hasWinner();
        System.out.println("<-----> b "+ b);
        if (player1.hasWinner() == false && player2.hasWinner() == false){
            String ss1 = player2.descriptionScore();
            String ss2 = player2.descriptionScore();
            System.out.println("ss1 " + ss1 + " ss2 " + ss2);
            System.out.println("x : " +x);
            if (x < 50) {
                int s = player2.getScore();
                System.out.println("s1 " + s);
                if (s == 4 && player1.getScore() == 3) {
                    player1.inadvantage();
                }else if (player1.getScore() == 4 && s == 3){
                    player1.isWinner();
                }
                else {
                    player1.scored(player2.getScore());
                }
            }else {
                int s = player1.getScore();
                System.out.println("s2 " + s);
                if (s == 4 && player2.getScore()== 3){
                    player2.inadvantage();
                }
                else if (player1.getScore() == 4 && s == 3){
                    player1.isWinner();
                }
                else {
                    player2.scored(player2.getScore());
                }
            }
            System.out.println("<---------------------------------debut--------------------------------------->");
            if (player1.getScore() == player2.getScore()&&player1.getScore() < 3){
                //System.out.println(player1.descriptionScore() + "  All");
                return player1.descriptionScore() + "  All";
            }else if (player1.getScore() == 4){
              //  System.out.println(player1.descriptionScore() + " " + player1.getName());
                return player1.descriptionScore() + " " + player1.getName();
            }else if (player2.getScore() == 4){
               // System.out.println(player2.descriptionScore() + " " + player2.getName());
                return player2.descriptionScore() + " " + player2.getName();
            }
            else if (player1.getScore() == 3 && player2.getScore() == 3){
                //System.out.println(" Deuce ");
                return "Deuce";
            }else {
                return player1.getName() + " : " + player1.descriptionScore()+"\n"+ player2.getName() + " : " + player2.descriptionScore();
            }

        }else  if (player1.hasWinner()){
            return "The winner is "+ player1.getName();
        }else{
            return "The winner is "+ player2.getName();
        }

    }
}
