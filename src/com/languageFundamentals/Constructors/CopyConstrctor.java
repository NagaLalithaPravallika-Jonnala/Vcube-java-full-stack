package com.languageFundamentals.Constructors;

public class CopyConstrctor {
	String movieName;
	String director;
	String hero;
	double budget;
	CopyConstrctor(String movieName,String director,String hero,double budget){
		this.movieName = movieName;
		this.director = director;
		this.hero = hero;
		this.budget = budget;
		
	}
	CopyConstrctor(CopyConstrctor c){
		this.movieName = c.movieName;
		this.director = c.director;
		this.hero = c.hero;
		this.budget = c.budget;
		
	}
	

	public static void main(String[] args) {
		CopyConstrctor c1 = new CopyConstrctor("arya","xyz","arjun",500000.00);
		CopyConstrctor c2 = new CopyConstrctor(c1);
		c2.movieName="varudu";
		c2.budget=1000000.00;
		c1.display();
        System.out.println("_________________________________");
        c2.display();
	}
	void display() {
		System.out.println("Movie Name : " + movieName);
		System.out.println("Director : " + director);
		System.out.println("Hero : " + hero);
		System.out.println("Budget : " + budget);
	}

}
