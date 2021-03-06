package tictactoe;

import java.util.Scanner;

public class TicTacToeGame {

	// UC1 - creating method to initialize indices with blank space
	static char[] createBoard() {
		char[] board = new char[10];
		for (int index = 1; index < board.length; index++) {
			board[index] = ' ';
		}
		return board;
	}

	// UC2 - Creating method to take the input from user
	static void user_Input() {

		char computer = 'O';

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the input X/O");

		char userInput = input.next().charAt(0);

		if (userInput == 'X') {
			System.out.println("player = " + computer + "   computer = " + userInput);
		} else if (userInput == 'O') {
			computer = 'X';
			System.out.println("player = " + computer + "  computer = " + userInput);
		} else {
			System.out.println("Invalid input");
		}

		input.close();
	}

	public static void main(String[] args) {

		System.out.println("Welcome to TicTacToe Game");

		createBoard();

		user_Input();
	}
}
