package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void printMenu(int round, int food){
        System.out.println("Round: " + round);
        System.out.println("Food left: " + food);
        System.out.println("\n 1. Feed \n 2. Pet \n 3. Next Round \n 4. EXIT");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	int food = 600, round = 1, choose;
	boolean ifEnd = false;

	while (ifEnd == false){
	    printMenu(round, food);
	    choose = scanner.nextInt();
	    if(choose == 4) ifEnd=true;
	    round++;
    }
    }
}
