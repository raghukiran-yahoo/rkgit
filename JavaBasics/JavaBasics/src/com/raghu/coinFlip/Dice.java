package com.raghu.coinFlip;

import java.util.Random;

public class Dice {
	
	private int d1, d2;
	private Random rand;
	
	public Dice() {
		
		this.d1 = 0;
		this.d2 = 0;
		this.rand = new Random();
		System.out.println("Initializing the Dice with values: "+ d1+ "; "+d2);
		}
	
	public int rollDice() {
		
		int sumDice;
		
		do {
			d1 = rand.nextInt(6);
			d2 = rand.nextInt(6);
			} while (d1 <=0 || d2<=0);
		
		System.out.println("Roll of the First Dice : "+d1);
		System.out.println("Roll of the Second Dice : "+d2);
		
		sumDice = d1+d2;
		
		return sumDice;
		
	}

}
