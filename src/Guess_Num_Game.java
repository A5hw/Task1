//Task-1 Number Guess game 

import java .util.Scanner;

import java.util.Random;
public class Guess_Num_Game {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Random random= new Random();
		    int minRange = 1, maxRange = 100,totalScore = 0,rounds = 0;;
	        int K = 5;
	        do {
	            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;

	            System.out.println("Round " + (rounds + 1) + ": Guess the number between " + minRange + " and " + maxRange);

	            while (attempts < K) {
	                System.out.print("Enter your guess: ");
	                int userGuess = sc.nextInt();
	                attempts++;

	                if (userGuess == randomNumber) {
	                    System.out.println("Very Good! You guessed the correct number in " + attempts + " attempts.");
	                    totalScore += attempts;
	                    break;
	                } else if (userGuess < randomNumber) {
	                    System.out.println("The Guess is too Low.");
	                } else {
	                    System.out.println("The Guess is too High.");
	                }

	                if (attempts ==K) {
	                    System.out.println(" The correct number was: " + randomNumber);
	                }
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgain = sc.next().toLowerCase();
	            if (playAgain.equals("no")) {
	                break;
	            }

	            rounds++;
	        } while (true);

	        System.out.println("Game Over. Your total score across " + rounds + " rounds is: " + totalScore);

	        sc.close();
	    }
}





