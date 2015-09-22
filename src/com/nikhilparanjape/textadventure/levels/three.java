package com.nikhilparanjape.textadventure.levels;

import java.util.Scanner;

/**
 * A simple text adventure
 * 
 * Level Three
 * 
 * @author Nikhil Paranjape (indianpoptart)
 * @version September 22nd 2015 - v1.0
 * 
 * 
 */

public class three {
	static Scanner scan = new Scanner(System.in);
	
	public static void start(int choice2){
		if(choice2==1){
			System.out.println("It starts to get dark, the forest is dark and eerie. \n In front of you, there is a small stone hatchet \n To the left of you, there is a ");
			String s2 = scan.nextLine();
			if(s2.equalsIgnoreCase("a")){
				
			}
			else if(s2.equalsIgnoreCase("Inventory") || s2.equalsIgnoreCase("Show Inventory") || s2.equalsIgnoreCase("Inv")){
				
			}
		}
		else if(choice2==2){
			String s2 = scan.nextLine();
			if(s2.equalsIgnoreCase("a")){
				
			}
			else if(s2.equalsIgnoreCase("Inventory") || s2.equalsIgnoreCase("Show Inventory") || s2.equalsIgnoreCase("Inv")){
				
			}
			System.out.println("");
		}
	}
}
