package com.languageFundamentals.Constructors;
import java.util.Scanner;
public class CricketPlayer 
{
    String playername;
    int matchesPlayed;
    int totalRuns;
    double averageRuns;
    CricketPlayer(String playername,int matchesPlayed,int totalRuns)
    {
    	this.playername = playername;
    	this.matchesPlayed = matchesPlayed;
    	this.totalRuns = totalRuns;
    	System.out.println("Player Name : " + playername);
    	System.out.println("Matches Played : " + matchesPlayed);
    	System.out.println("Total Runs : " + totalRuns);
    }
    void calculateAndDisplay( ) 
    {
    	System.out.println("Average Runs :" + totalRuns/matchesPlayed);
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player Name : ");
		String playername = sc.next();
		System.out.println("Enter Played Matches  : ");
		int matchesPlayed = sc.nextInt();
		System.out.println("Enter Total Rnus : ");
		int totalRuns = sc.nextInt();
		CricketPlayer c = new CricketPlayer( playername,matchesPlayed,totalRuns);
		c.calculateAndDisplay();
	}

}
