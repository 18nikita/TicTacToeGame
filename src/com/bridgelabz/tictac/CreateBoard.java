package com.bridgelabz.tictac;

import java.util.Scanner;

public class CreateBoard {

	static char x = 'X';
	static char o = 'O';
	public static char[] element;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		
		boardCreation();
		chooseUserInput();
		showBoard();
	}

	public static void boardCreation() {
		 element = new char[10];
		for (int i = 1; i < 10; i++) {
			element[i] = ' ';
		}
		System.out.println("Tic tac Toe board is ready");
	}

	public static void chooseUserInput() {
		
		System.out.println("Input X or O");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		sc.close();

		if (ch == 'x' || ch == 'o')
			System.out.println(" you have entered: " + x);

		else if (ch == 'X' || ch == 'O')
			System.out.println("you have entered: " + o);

		else
			System.out.println("invalid input ");
	}

	public static void showBoard() 
	{
		System.out.println("  " + element[1] + " | " + element[2] + " | " + element[3] + " |");
		System.out.println(" ----------- ");
		System.out.println("  " + element[4] + " | " + element[5] + " | " + element[6] + " |");
		System.out.println(" ----------- ");
		System.out.println("  " + element[7] + " | " + element[8] + " | " + element[9] + " |");
	}
}
