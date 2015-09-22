package com.nikhilparanjape.textadventure;

import java.util.ArrayList;
import java.util.Scanner;
import com.nikhilparanjape.textadventure.Inventory;
import com.nikhilparanjape.textadventure.levels.*;

/**
 * A simple text adventure
 * 
 * Game Mechanics Class
 * 
 * @author Nikhil Paranjape (indianpoptart)
 * @version September 22nd 2015 - v1.0
 * 
 * 
 */

public class Game {
	static Scanner scan = new Scanner(System.in);
	static String inventory[] = Inventory.getInventory();
	static int inventoryV[] = Inventory.getValues();
	static int abilities[] = Inventory.getAbilities();
	
	public static void start(){
		System.out.println("You wake up in a forest with nothing. In front of you, there is a tree.");
		System.out.println("Behind you there is a wooden structure.");
		one.prompt();
	}
}
