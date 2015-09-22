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
	public static void main(String[] args) {
		
		System.out.println("A: Start New Game");
		System.out.println("B: Load Game File");
		System.out.println("C: Quit");
		String game = scan.nextLine();
		startMenu(game);
	}
	public static void startMenu(String game){
		if(game.equalsIgnoreCase("A") || game.equalsIgnoreCase("1")){
			Game.start();
		}
		else if(game.equalsIgnoreCase("B") || game.equalsIgnoreCase("2")){
			System.out.println("That feature is currently unavailable. Sorry.");
			
		}
		else if(game.equalsIgnoreCase("C") || game.equalsIgnoreCase("3")){
			System.exit(0);
		}
	}
	
	
	

}