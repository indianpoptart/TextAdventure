package com.nikhilparanjape.textadventure;

import java.util.Scanner;

/**
 * A simple text adventure
 * 
 * @author Nikhil Paranjape (indianpoptart)
 * @version September 17th 2015 - v1.0
 * 
 * 
 */

public class main {
	static Scanner scan = new Scanner(System.in);
	static String[] inventory = new String[100];
	static int[] inventoryValues = new int[100];
	static int[] abilities = new int[100];
	public static void main(String[] args) {
		
		System.out.println("A: Start New Game");
		System.out.println("B: Load Game File");
		System.out.println("C: Quit");
		String game = scan.nextLine();
		if(game.equalsIgnoreCase("A") || game.equalsIgnoreCase("1")){
			startGame();
		}
		else if(game.equalsIgnoreCase("B") || game.equalsIgnoreCase("2")){
			inventory[] = IO.openFile("inventory");
		}
	}
	public static void startGame(){
		System.out.println("You wake up in a forest with nothing. In front of you, there is a tree.");
		System.out.println("Behind you there is a wooden structure.");
		next1();
	}
	public static void inventory(){
		
	}
	public static void next1(){
		System.out.println("What do you want to do?");
		step1();
	}
	public static void step1(){
		String s1 = scan.nextLine();
		
		if(s1.equalsIgnoreCase("Go Forward") || s1.equalsIgnoreCase("Forward")){
			System.out.println("A tree, whoop-dee-doo. There are some weird ants.");
			System.out.println("You use magic powers to chop the tree down (Your name is Steve)");
			step2(1);
		}
		else if(s1.equalsIgnoreCase("Go backward") || s1.equalsIgnoreCase("Backward") || s1.equalsIgnoreCase("Back")){
			System.out.println("The structure is not steady, you jump across it");
			step2(2);
		}
		else{
			System.out.println("Don't know how to " + s1);
			next1();
		}
	}
	public static void step2(int choice1){
		if(choice1==1){
			//Tree
			inventory[0] = "Wood";
			inventoryValues[0] = 25;
			
			System.out.println("You now have " + inventoryValues[0] + " " + inventory[0]);
			step3(1);
		}
		else if(choice1==2){
			//Structure
			abilities[0] = 10;
			int jLevel = 0;
			int score = abilities[0];
			if(score >= 50 && score < 100){
				jLevel = 1;
			}
			else if(score < 50){
				jLevel = 0;
			}
			System.out.println("Your jumping ability increased by 10. Your current jumping skill is at Level " + jLevel);
			step3(2);
		}
		else{
			
		}
	}
	public static void step3(int choice2){
		if(choice2==1){
			System.out.println("It starts to get dark, the forest is dark and eerie. \n In front of you, there is a small stone hatchet \n To the left of you, there is a ");
		}
		else if(choice2==2){
			System.out.println("");
		}
	}

}