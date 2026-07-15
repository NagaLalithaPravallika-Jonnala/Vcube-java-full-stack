package com.basics;

public class CricketPlayer {

	static String teamName="India";
	String playerName;
	int runs;

	public static void main(String[] args) {
		CricketPlayer c1=new CricketPlayer();
		c1.playerName="Dhoni";
		c1.runs=20;
		System.out.println("Team Name : " + teamName);
		System.out.println("Player Name : " + c1.playerName);
		System.out.println("Runs :" + c1.runs);
		System.out.println();
		CricketPlayer c2=new CricketPlayer();
		c2.playerName="jadeja";
		c2.runs=24;
		System.out.println("Team Name : " + teamName);
		System.out.println("Player Name : " + c2.playerName);
		System.out.println("Runs :" + c2.runs);
		System.out.println();
		CricketPlayer c3=new CricketPlayer();
		c3.teamName="Africa";
		c3.playerName="Rohith";
		c3.runs=34;
		System.out.println("Team Name : " + teamName);
		System.out.println("Player Name : " + c3.playerName);
		System.out.println("Runs :" + c3.runs);
		

	}

}


