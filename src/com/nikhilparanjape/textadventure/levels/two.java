package com.nikhilparanjape.textadventure.levels;

import com.nikhilparanjape.textadventure.Inventory;

/**
 * A simple text adventure
 * 
 * Level Two
 * 
 * @author Nikhil Paranjape (indianpoptart)
 * @version September 22nd 2015 - v1.0
 * 
 * 
 */

public class two {
	static String inventory[] = Inventory.getInventory();
	static int inventoryV[] = Inventory.getValues();
	static int abilities[] = Inventory.getAbilities();
	
	public static void start(int choice1){
		if(choice1==1){
			//Tree
			inventory[0] = "Wood";
			inventoryV[0] = 25;
			System.out.println("                                                   ");
			System.out.println("You now have " + inventoryV[0] + " " + inventory[0]);
			three.start(1);
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
			three.start(2);
		}
		
		else{
			
		}
	}
}
