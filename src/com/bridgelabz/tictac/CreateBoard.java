package com.bridgelabz.tictac;

import java.util.Random;
import java.util.Scanner;

public class CreateBoard {

	static char x = 'X';
	static char o = 'O';
	static Scanner sc = new Scanner(System.in);
	static char userMark, computerMark;
	public static char[] element;

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Game");

		elementCreation();
		chooseUserInput();
		showBoard();
		userMove();
		currentBoard();
	}

	public static void elementCreation() {
		element = new char[10];
		for (int i = 1; i < 10; i++) {
			element[i] = ' ';
		}
		System.out.println("Tic tac Toe element is ready");
	}

	public static void chooseUserInput() {

		System.out.println("Input X or O");
		char ch = sc.next().charAt(0);
		sc.close();

		if (ch == 'x' || ch == 'o')
			System.out.println(" you have entered: " + x);

		else if (ch == 'X' || ch == 'O')
			System.out.println("you have entered: " + o);

		else
			System.out.println("invalid input ");
	}

	public static void showBoard() {
		System.out.println("| " + element[1] + " | " + element[2] + " | " + element[3] + " |");
		System.out.println("-------------- ");
		System.out.println("| " + element[4] + " | " + element[5] + " | " + element[6] + " |");
		System.out.println("-------------- ");
		System.out.println("| " + element[7] + " | " + element[8] + " | " + element[9] + " |");
	}

	public static void userMove() {
		System.out.println("Enter your move 1-9 : ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		if (element[userInput] != 'X' && element[userInput] != 'O') {
			element[userInput] = userMark;
		} else {
			System.out.println("Position already Taken ! please choose another position ");
		}
	}

	public static void currentBoard() {
		for (int i = 1; i < 10; i++) {
			if (element[i] != 'X' && element[i] != 'O') {
				element[i] = (char) (i + '0');
			}
		}
		showBoard();
	}

	public static void toss() {
		Random rand = new Random();
		int a = rand.nextInt(2);
		if (a == 0) {
			System.out.println("User Won Toss ! Play your First Move");
			userMove();
			currentBoard();
		} else {
			System.out.println("Computer Won Toss ! Will play First Move");
		}
	}
	public static void computerFirstTurn() {
        int computerNumber = (int) Math.random()*10;
      element[computerNumber]=computerMark;
        System.out.println("Computer choses '"+computerNumber+"' now user turn");
    }
}