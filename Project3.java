package code;


import java.util.Random;
import java.util.Scanner;

	public class Project3 {

	public static void main(String[] args) {

	Scanner kb = new Scanner(System.in);
	int choice;
	// display the menu choices
	System.out.println("The Game of Pig");
	System.out.println("-------------------------------------");
	System.out.println("1. Human vs. Human");
	System.out.println("2. Human vs. Computer");
	System.out.println("3. Computer vs. Computer");

	// input the choice
	System.out.print("\nWhat kind of game do you want to play? ");
	choice = kb.nextInt();

	// loop that continues until user inputs a valid menu choice
	while(choice < 1 || choice > 3)
	{
	System.out.println("Invalid choice.");
	System.out.print("\nWhat kind of game do you want to play? ");
	choice = kb.nextInt();
	}

	// based on user choice, call the playGame with appropriate values
	if(choice == 1)
	playGame(true, true);
	else if(choice == 2)
	playGame(true, false);
	else
	playGame(false, false);
	}

	/**
	* method to simulate a game of Pig
	*/
	public static void playGame(boolean player1, boolean player2)
	{
	// initialize player1Score and player2Score to 0
	int player1Score = 0, player2Score = 0, turnScore;
	int currentPlayer = 1; // set currentPlayer to first player

	// loop that continues until one of the players score >= 100
	while(player1Score < 100 && player2Score < 100)
	{
	// display the player scores
	System.out.println("Player 1 score: "+player1Score);
	System.out.println("Player 2 score: "+player2Score);

	// based on the currentPlayer calls the playTurn method
	if(currentPlayer == 1)
	{
	turnScore = playTurn(player1, currentPlayer, player1Score); // get the turnScore for player1
	player1Score += turnScore; // add turnScore to player1Score
	currentPlayer = 2; // alternate the currentPlayer
	}
	else
	{
	turnScore = playTurn(player2, currentPlayer, player2Score); // get the turnScore for player2
	player2Score += turnScore; // add turnScore to player2Score
	currentPlayer = 1; // alternate the currentPlayer
	}
	System.out.println();
	}

	// display the final scores for both the players and display the winner
	System.out.println("Player 1 score: "+player1Score);
	System.out.println("Player 2 score: "+player2Score);
	if(player1Score >= 100)
	System.out.println("Player 1 wins the game!!");
	else
	System.out.println("Player 2 wins the game!!");
	}

	// method to simulate one turn of the player
	public static int playTurn(boolean player, int number, int totalScore)
	{
	int turnScore = 0; // initialize turnScore to 0
	Random ran = new Random();
	// display the current player
	System.out.print("Player "+number+": ");
	if(player)
	System.out.println("Human");
	else
	System.out.println("Computer");
	int die;

	// loop that continues until the player rolls a 1 or player holds
	do
	{
	die = ran.nextInt(6)+1; // generate the dice roll between [1, 6]
	if(die == 1) // user rolls a 1
	{
	System.out.println("Your rolled 1.");
	turnScore = 0; // set turnScore to 0
	}
	else // else add die roll to turnScore
	turnScore += die;
	}while(die != 1 && getDecision(player, turnScore, totalScore));

	return turnScore;
	}

	// method that returns true if the player decides to roll else return false
	public static boolean getDecision(boolean player, int turnScore, int totalScore)
	{
	Scanner kb = new Scanner(System.in);
	if(!player) // computer player
	{
	// determine if player wants to hold
	if(((totalScore+turnScore) >= 100) || turnScore >= 20)
	{
	System.out.println("Computer player holds");
	return false;
	}
	else // player rolls
	{
	System.out.println("Computer player rolls");
	return true;
	}
	}
	else // human player
	{
	// display the turn score
	System.out.println("Your turn score: "+turnScore);
	String choice;

	// input if user wants to hold or roll
	System.out.print("Do you want to (r)oll or (h)old? ");
	choice = kb.next();

	// loop that continues until the user enters a valid choice
	while(!choice.equalsIgnoreCase("r") && !choice.equalsIgnoreCase("h"))
	{
	System.out.print("Do you want to (r)oll or (h)old? ");
	choice = kb.next();
	}

	// human player rolls
	if(choice.equalsIgnoreCase("r"))
	{
	System.out.println("Human player rolls");
	return true;
	}
	else // human player holds
	{
	System.out.println("Human player holds");
	return false;
	}
	}
	}
	{

}
}
