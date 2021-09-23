package com.bridgelabz.tictac;

public class CreateBoard {

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
		
	}
}
