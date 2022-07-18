package com.brz.gambling;

import java.util.Random;

public class GamblingSimulator {

	public static final int stake = 100;
	public static final int bet = 1;
	public static final int percentage_50_Stke = (stake / 100) * 50;
	public static final int high_Limit = stake + percentage_50_Stke;
	public static final int low_Limit = stake - percentage_50_Stke;
	public static final int start_Day = 1;
	public static final int max_Day = 20;
	public static final int stakes_Per_Day = 50;
	public static final int start_Dollars = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to the Gambler Game");
		int days = start_Day;
		int totalDollars = start_Dollars;
		for (days = start_Day; days <= max_Day; days++) {

			int totalStake = stake;

			while (totalStake < high_Limit && totalStake > low_Limit) {
				int game = (int) (Math.random() * 10) % 2;
				if (game == 1) {
					totalStake = totalStake + bet;
					System.out.println("Gambler won the bet and having total stack " + totalStake);
				} else {
					totalStake = totalStake - bet;
					System.out.println("Gambler lost the bet and having total stack " + totalStake);
				}
			}
			if (totalStake == high_Limit) {
				System.out.println("Gambler won by " + totalStake);
			} else {
				System.out.println("Gambler lost by " + totalStake);

			}

		}
		if (totalDollars > start_Dollars) {
			System.out.println("Gambler won " + totalDollars);
		} else {
			System.out.println("Gambler lost " + totalDollars);
		}
	}
}