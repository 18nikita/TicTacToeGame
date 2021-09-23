package com.bridgelabz.tictac;

import java.util.Scanner;

public class CreateBoard {
	
	static char x='X';
	static char o='O';
	
	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");
		boardCreation();
		chooseUserInput();
	}

	public static void boardCreation() {
		char[] element = new char[10];
		for (int i = 1; i < 10; i++) {
			element[i] = ' ';
		}
		System.out.println("Tic tac Toe board is ready");
	}
	
	public static void chooseUserInput() {
		
		System.out.println("Input between X or O");
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
}


