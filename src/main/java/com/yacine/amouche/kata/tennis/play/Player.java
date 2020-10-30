package com.yacine.amouche.kata.tennis.play;

public class Player extends play{
    private String name;
    private int score;
    private boolean winner;
    public Player(String name){
        this.name = name;
        this.winner = false;
        this.score = 0;
    }
    @Override
    public String getName() {
        return this.name;
    }


    public void scored(int t){

        if (this.score <= 3 && t <= 3){
            this.score ++;
        }
        if (this.score == 4 && t < 3){
            this.winner = true;
        }

    }
    public void inadvantage(){
        this.score--;
    }
    public boolean hasWinner(){
        return this.winner;
    }
    public void isWinner(){
        this.winner = true;
    }
    public int getScore(){
        return this.score;
    }
    public String descriptionScore(){
        switch (this.getScore()){
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Therty";
            case 3: return "Forty";
            case 4: return "advantage";
        }
        throw new IllegalArgumentException("Illegal score: " + this.getScore());
    }
}
