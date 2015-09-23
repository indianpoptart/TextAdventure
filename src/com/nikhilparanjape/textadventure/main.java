package com.nikhilparanjape.textadventure;

import java.util.Scanner;

import com.nikhilparanjape.textadventure.levels.one;
import com.nikhilparanjape.textadventure.levels.two;

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
		else if(game.equalsIgnoreCase("lvl-slct1121")){
			//Cheat Code for level select
			//clear;
			System.out.println("Choose the level you want to go to.");
			String lvlselect = scan.nextLine();
			if(lvlselect.equalsIgnoreCase("1") || lvlselect.equalsIgnoreCase("one")){
				one.prompt();
			}
			else if(lvlselect.equalsIgnoreCase("2") || lvlselect.equalsIgnoreCase("two")){
				
			}
			else if(lvlselect.equalsIgnoreCase("3") || lvlselect.equalsIgnoreCase("three")){
				
			}
		}
		else{
			System.out.println("That is not an option, try again.");
			String again = scan.nextLine();
			startMenu(again);
		}
	}
	
	
	

}