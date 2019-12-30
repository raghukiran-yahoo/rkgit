package com.raghu.coinFlip;

import java.util.Random;

public class Coin {

	public static int HEADS = 0;
	public static int TAILS = 1;

	private int faceUp;

	public Coin() {

		flip();
	}

	public void flip() {
			Random rand = new Random();
			faceUp = rand.nextInt(2);
	}
	
	public String getfaceUp() {
		
		if (faceUp == HEADS) {
            return "HEADS";
        } else if (faceUp == TAILS) {
            return "TAILS";
        } else {
            return "INVALID";
        }
		
	}

}
