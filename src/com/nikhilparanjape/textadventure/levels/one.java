package com.nikhilparanjape.textadventure.levels;

import java.util.Scanner;

/**
 * A simple text adventure
 * 
 * Level One
 * 
 * @author Nikhil Paranjape (indianpoptart)
 * @version September 22nd 2015 - v1.0
 * 
 * 
 */

public class one {
	static Scanner scan = new Scanner(System.in);
	
	public static void prompt(){ 
		System.out.println("What do you want to do?");
		step1();
	}
	public static void step1(){
		String s1 = scan.nextLine();
		
		if(s1.equalsIgnoreCase("Go Forward") || s1.equalsIgnoreCase("Forward")){
			System.out.println("                                                   ");
			System.out.println("A tree, whoop-dee-doo. There are some weird ants.");
			System.out.println("You use magic powers to chop the tree down (Your name is Steve)");
			two.start(1);
		}
		else if(s1.equalsIgnoreCase("Go backward") || s1.equalsIgnoreCase("Backward") || s1.equalsIgnoreCase("Back")){
			System.out.println("The structure is not steady, you jump across it");
			two.start(2);
		}
		else if(s1.equalsIgnoreCase("Inventory") || s1.equalsIgnoreCase("Show Inventory") || s1.equalsIgnoreCase("Inv")){
			
		}
		else{
			System.out.println("Don't know how to " + s1);
			prompt();
		}
	}
}
