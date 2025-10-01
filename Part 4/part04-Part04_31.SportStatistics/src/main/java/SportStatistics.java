
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //requests to pull the file
        System.out.println("File: ");
        String file = scan.nextLine();
        
        //team look up
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        
        //list that holds the info inputed 
        ArrayList<Game> games = new ArrayList<>();
        
        //access the file
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            //this reads until there is no more data
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if(line.isEmpty()) continue;
   
                //this splits the words using the "," i.e. home team / away team / home score / away score 
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                
                //this adds the game information to the array list 
                games.add(new Game(homeTeam, awayTeam, homeScore, awayScore));          
            }
        //this catches any errors and is aways with a try statement    
        }catch (Exception e) {
                System.out.println("File not found");
        }
        
        //setting  the counters to 0
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        //this goes through the sheet and compares the home and away team / calculates the num of games, wins and losses 
        for (Game game : games) {
            if(game.involves(teamName)) {
                gamesPlayed++;
                if(teamName.equals(game.winner())) {
                    wins++;
                }else{
                    losses++;
            }
        }
    }
        //prints the data 
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
