package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {

		// User input

		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount?");
		int startAmount = in.nextInt();
		System.out.println("What is your chance of winning?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int winLimit = in.nextInt();
		System.out.println("How many days will you play?");
		int totalSimulations = in.nextInt();
		for (int day = 0; day < totalSimulations; day++)
		{
			double money = startAmount;
			while (money < winLimit && money > 0)

			{
				double gamblingGame = Math.random();
				boolean winOrLoss = gamblingGame <= winChance;
				if (winOrLoss == true)
				{
					money++;
					System.out.println("You won");
				}
				else
				{
					money--;
					System.out.println("You lost");
				}
			}	



		}

	}	
}
