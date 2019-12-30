package com.raghu.coinFlip;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		System.out.println("Welcome to the Coin Flip Program!!!");


		 * Coin c = new Coin();

        System.out.println("Initial: " + c.getfaceUp());
        for(int i = 0; i < 10; i++) {
            c.flip();
            System.out.println("After Flip: " + c.getfaceUp());
        }

		 */

		System.out.println("Welcome to the Dice Roll Program!!!");


		Dice dice = new Dice();

		for (int i = 0; i<=10; i++) {

			System.out.println(dice.rollDice());

		}

	}

}
