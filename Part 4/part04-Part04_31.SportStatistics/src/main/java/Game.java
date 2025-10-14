/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paul
 */
public class Game {
    
    //adds our data types 
    private String homeTeam, awayTeam;
    private int homeScore, awayScore;
    
    //set up the constructor to use the data 
    public Game(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
   //checks if a team participated in this game  
   public boolean involves(String team) {
       return team.equals(homeTeam) || team.equals(awayTeam);
    }
   
   //returns the winner of the game by comparing the scores
   public String winner() {
       if (homeScore > awayScore) {
           return homeTeam;
       }else{
           return awayTeam;
       }
   }
   
   public String getHomeTeam() {
       return homeTeam;
       }
   
   public String getAwayTeam() {
       return awayTeam;
   }
   
   public int getHomeTeamScore() {
       return homeScore;
   }
   
   public int getAwayTeamScore() {
       return awayScore;
   }
   
   //used to print the game result in text
   @Override
    public String toString() {
        return homeTeam + " " + homeScore + " - " + awayTeam + " " + awayScore;    
    }
}

