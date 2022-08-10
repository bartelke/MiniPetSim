package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static PetInterface dog = new Dog();
    static PetInterface duck = new Duck();
    static PetInterface bird = new Bird();
    static PetInterface cat = new Cat();
    static int foodAmount, foodMagazine = 600;

    //here I am using interface:
    static void feeding(PetInterface pet){
        System.out.println("Enter amount of food [0-"+foodMagazine+"]: ");
        foodAmount = scanner.nextInt();
        foodMagazine -= foodAmount;
        pet.feed(foodAmount);
    }

    static void play(PetInterface pet){
        System.out.println(pet.pet());
    }

    static void printMenu(int round, int food){
        System.out.println("Round: " + round);
        System.out.println("Food left: " + food);
        System.out.println("\n 1. Feed \n 2. Pet \n 3. Next Round \n 4. EXIT");
    }
    static String choosePetString = " Choose pet: \n 1. Dog \n 2. Duck \n 3. Bird \n 4. Cat";

    public static void main(String[] args) {
	int round = 1, choose, choosePet, feed;
	boolean ifEnd = false;

	while (ifEnd == false){
	    printMenu(round, foodMagazine);
	    choose = scanner.nextInt();
	    switch (choose) {
            case 1: {
                System.out.println(choosePetString);
                choosePet = scanner.nextInt();
                switch (choosePet){
                    case 1:{
                        feeding(dog);
                        break;
                    }
                    case 2:{
                        feeding(duck);
                        break;
                    }
                    case 3:{
                        feeding(bird);
                        break;
                    }
                    case 4:{
                        feeding(cat);
                        break;
                    }
                }
                break;
            }
            case 2: {
                System.out.println(choosePetString);
                choosePet = scanner.nextInt();
                switch (choosePet){
                    case 1:{
                        play(dog);
                        break;
                    }
                    case 2:{
                        play(duck);
                        break;
                    }
                    case 3:{
                        play(bird);
                        break;
                    }
                    case 4:{
                        play(cat);
                        break;
                    }
                }
                break;
            }
            case 4: {
                ifEnd = true;
                break;
            }
        }
        choose=0;

	    round++;
    }
    }
}
